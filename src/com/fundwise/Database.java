package com.fundwise;

import java.sql.*;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {
    public Connection connect_database() {
        Connection connection = null;
        
        try{
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://aws-0-ap-south-1.pooler.supabase.com:5432/postgres", "postgres.vmxphsbddbhjsmccvbmr", "Gh4b_%B-z&i~YxX");
            
            if(connection != null){
                System.out.println("Connection Successful.");
            }else{
                System.out.println("Connection Unsuccessful.");
            }
        }catch(SQLException e){
            System.out.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return connection;
    }
    
    public boolean login(Connection connection, String username, String password){
        ResultSet rs;
        Statement statement;
        
        try{
            String query = String.format("select password from customer where username = '%s'", username);
            statement = connection.createStatement();
            rs = statement.executeQuery(query);
            
            while(rs.next()){
                return password.equals(rs.getString("password"));
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        
        return false;
    }
    
    public ResultSet fetch_customer_information(Connection connection, String username){
        ResultSet rs = null;
        Statement statement;
        
        try{
            String query = String.format("select * from customer where username = '%s'", username);
            statement = connection.createStatement();
            rs = statement.executeQuery(query);  
        }catch(SQLException e){
            System.out.println(e);
        }
        
        return rs;
    }
    
    public boolean withdraw(Connection connection, String username, float amount){
        ResultSet rs;
        float balance = 0;
        Statement statement;
        
        try{
            String query = String.format("select balance from customer where username = '%s'", username);
            statement = connection.createStatement();
            rs = statement.executeQuery(query);
            
            while(rs.next()){
                balance = rs.getFloat("balance");
            }
            
            if(balance - amount > 0) {
                transaction(connection, username, "withdraw", amount, 0);
            
                query = String.format("update customer set balance = %.2f where username = '%s'", (balance - amount), username);
                statement = connection.createStatement();
                statement.executeQuery(query);
            }else{
                return false;
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        
        return true;
    }
    
    public void deposit(Connection connection, String username, float amount){
        ResultSet rs;
        float balance = 0;
        Statement statement;
        
        try{
            String query = String.format("select balance from customer where username = '%s'", username);
            statement = connection.createStatement();
            rs = statement.executeQuery(query);
            
            while(rs.next()){
                balance = rs.getFloat("balance");
            }
            
            transaction(connection, username, "deposit", amount, 0);
            
            query = String.format("update customer set balance = %.2f where username = '%s'", (balance + amount), username);
            statement = connection.createStatement();
            statement.executeQuery(query);
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public void transaction(Connection connection, String username, String type, float amount, int to_account){
        ResultSet rs;
        int customer_id = 0;
        Statement statement;
        
        try{
            String query = String.format("select id from customer where username = '%s'", username);
            statement = connection.createStatement();
            rs = statement.executeQuery(query);
            
            while(rs.next()){
                customer_id = rs.getInt("id");
            }
            
            query = String.format("insert into transaction (type, from_account, to_account, amount, username) values ('%s', %d, %d, %.2f, '%s')", type, customer_id, to_account, amount, username);
            statement = connection.createStatement();
            statement.executeQuery(query);
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public ResultSet fetch_transactions(Connection connection, String username){
        ResultSet rs = null;
        Statement statement;
        
        try{
            String query = String.format("select * from transaction where username = '%s'", username);
            statement = connection.createStatement();
            rs = statement.executeQuery(query);
        }catch(SQLException e){
            System.out.println(e);
        }
        
        return rs;
    }
    
    public boolean transfer(Connection connection, String username, int transfer_to, float amount){
        ResultSet rs;
        float balance = 0;
        Statement statement;
        try{
            String query = String.format("select balance from customer where username = '%s'", username);
            statement = connection.createStatement();
            rs = statement.executeQuery(query);
            
            while(rs.next()){
                balance = rs.getFloat("balance");
            }
            
            if(balance - amount > 0) {
                transaction(connection, username, "transfer", amount, transfer_to);
                update_to_account(connection, transfer_to, amount);

                query = String.format("update customer set balance = %.2f where username = '%s'", (balance - amount), username);
                statement = connection.createStatement();
                statement.executeQuery(query);
                return true;
            }else{
                return false;
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        
        return true;
    }
    
    public void update_to_account(Connection connection, int transfer_to, float amount){
        ResultSet rs;
        float balance = 0;
        Statement statement;
        
        try{
            String query = String.format("select balance from customer where id = %d", transfer_to);
            statement = connection.createStatement();
            rs = statement.executeQuery(query);
            
            while(rs.next()){
                balance = rs.getFloat("balance");
            }
            
            query = String.format("update customer set balance = %.2f where id = %d", (balance + amount), transfer_to);
            statement = connection.createStatement();
            statement.executeQuery(query);
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public void display_toast(javax.swing.JPanel toast) {
        toast.setVisible(true);
        
        int delay = 2500; 
        Timer timer = new Timer();
        
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                toast.setVisible(false);
            }
        }, delay);
    }
}

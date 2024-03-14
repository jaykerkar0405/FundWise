package com.fundwise;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Connection;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

class Transaction {
    int id;
    String date;
    String type;
    float amount;
    int to_account;
    int from_account;
    
    Transaction(int id, String date, String type, float amount, int to_account, int from_account) {
        this.id = id;
        this.date = date;
        this.type = type;
        this.amount = amount;
        this.to_account = to_account;
        this.from_account = from_account;
    }
}

public final class Transactions extends javax.swing.JFrame {
    String username;
    
    Database database = new Database();
    Connection connection = database.connect_database();
    
    public ArrayList transaction_list() {
        ResultSet rs = database.fetch_transactions(connection, this.username);
        
        ArrayList<Transaction> transaction = new ArrayList<>();
        
        try{
            while(rs.next()){
                Transaction transaction_entry = new Transaction(rs.getInt("id"), rs.getDate("created_at").toString(), rs.getString("type"), rs.getFloat("amount"), rs.getInt("to_account"), rs.getInt("from_account"));
                transaction.add(transaction_entry);
            }
        }catch(Exception e){
            System.out.println(e);
        }
        
        return transaction;
    }
    
    public void add_row_to_table(){
        DefaultTableModel model = (DefaultTableModel) transactions_table.getModel();
        ArrayList<Transaction> transactions = transaction_list();
        
        Object[] row_data = new Object[10];
        
        for(int i = 0; i < transactions.size(); i++) {
            row_data[0] = transactions.get(i).id;
            row_data[1] = transactions.get(i).type;
            row_data[2] = transactions.get(i).from_account;
            row_data[3] = transactions.get(i).to_account;
            row_data[4] = transactions.get(i).amount;
            row_data[5] = transactions.get(i).date;
            
            model.addRow(row_data);
        }
    }
    
    public Transactions(String username) {
        initComponents();
        this.username = username;
        add_row_to_table();
        this.setIconImage(new ImageIcon("D:\\ByteWise\\FundWise\\src\\resources\\images\\icon.png").getImage());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main_panel = new javax.swing.JPanel();
        left_panel = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        subtitle = new javax.swing.JLabel();
        information_text_1 = new javax.swing.JLabel();
        information_text_2 = new javax.swing.JLabel();
        information_text_3 = new javax.swing.JLabel();
        information_text_4 = new javax.swing.JLabel();
        information_text_5 = new javax.swing.JLabel();
        information_text_6 = new javax.swing.JLabel();
        information_text_7 = new javax.swing.JLabel();
        information_text_8 = new javax.swing.JLabel();
        information_text_9 = new javax.swing.JLabel();
        information_text_10 = new javax.swing.JLabel();
        information_text_11 = new javax.swing.JLabel();
        information_text_12 = new javax.swing.JLabel();
        logout_icon = new javax.swing.JLabel();
        logout_text = new javax.swing.JLabel();
        right_panel = new javax.swing.JPanel();
        onboarding_text = new javax.swing.JLabel();
        transactions_scroll_pane = new javax.swing.JScrollPane();
        transactions_table = new javax.swing.JTable();
        close_button = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Transactions || FundWise - Securely access your finances");
        setName("transactions"); // NOI18N
        setUndecorated(true);

        main_panel.setBackground(new java.awt.Color(255, 255, 255));
        main_panel.setPreferredSize(new java.awt.Dimension(825, 600));

        left_panel.setBackground(new java.awt.Color(41, 32, 117));
        left_panel.setPreferredSize(new java.awt.Dimension(275, 600));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icon.png"))); // NOI18N

        title.setFont(new java.awt.Font("Poppins Medium", 0, 26)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("FundWise");

        subtitle.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        subtitle.setForeground(new java.awt.Color(204, 204, 255));
        subtitle.setText("Securely access your finances");

        information_text_1.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        information_text_1.setForeground(new java.awt.Color(204, 255, 255));
        information_text_1.setText("Your security is our priority.");

        information_text_2.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        information_text_2.setForeground(new java.awt.Color(204, 255, 255));
        information_text_2.setText("Please be cautious of unsolicited");

        information_text_3.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        information_text_3.setForeground(new java.awt.Color(204, 255, 255));
        information_text_3.setText("calls, texts, or emails requesting");

        information_text_4.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        information_text_4.setForeground(new java.awt.Color(204, 255, 255));
        information_text_4.setText(" sensitive information such as");

        information_text_5.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        information_text_5.setForeground(new java.awt.Color(204, 255, 255));
        information_text_5.setText("passwords or account details. We ");

        information_text_6.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        information_text_6.setForeground(new java.awt.Color(204, 255, 255));
        information_text_6.setText("will never ask for this information");

        information_text_7.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        information_text_7.setForeground(new java.awt.Color(204, 255, 255));
        information_text_7.setText("via these channels. If you receive");

        information_text_8.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        information_text_8.setForeground(new java.awt.Color(204, 255, 255));
        information_text_8.setText("any communication, do not ");

        information_text_9.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        information_text_9.setForeground(new java.awt.Color(204, 255, 255));
        information_text_9.setText("respond and contact us .");

        information_text_10.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        information_text_10.setForeground(new java.awt.Color(204, 255, 255));
        information_text_10.setText("Stay vigilant and protect your");

        information_text_11.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        information_text_11.setForeground(new java.awt.Color(204, 255, 255));
        information_text_11.setText("financial information. Thank you");

        information_text_12.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        information_text_12.setForeground(new java.awt.Color(204, 255, 255));
        information_text_12.setText("for banking with us.");

        logout_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logout_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/logout.png"))); // NOI18N
        logout_icon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout_icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout_iconMouseClicked(evt);
            }
        });

        logout_text.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        logout_text.setForeground(new java.awt.Color(204, 204, 255));
        logout_text.setText("Logout");
        logout_text.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout_text.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout_textMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout left_panelLayout = new javax.swing.GroupLayout(left_panel);
        left_panel.setLayout(left_panelLayout);
        left_panelLayout.setHorizontalGroup(
            left_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(left_panelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(left_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(left_panelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(left_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(left_panelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(subtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(left_panelLayout.createSequentialGroup()
                                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(35, Short.MAX_VALUE))
                    .addGroup(left_panelLayout.createSequentialGroup()
                        .addGroup(left_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(information_text_11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(information_text_10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(information_text_8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(information_text_7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(information_text_6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(information_text_4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(information_text_3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(information_text_2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(information_text_1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(information_text_12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(information_text_5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(information_text_9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, left_panelLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(logout_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(logout_text)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        left_panelLayout.setVerticalGroup(
            left_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(left_panelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(left_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subtitle)
                .addGap(51, 51, 51)
                .addComponent(information_text_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(information_text_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(information_text_3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(information_text_4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(information_text_5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(information_text_6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(information_text_7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(information_text_8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(information_text_9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(information_text_10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(information_text_11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(information_text_12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(left_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logout_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logout_text, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        right_panel.setBackground(new java.awt.Color(204, 255, 255));
        right_panel.setForeground(new java.awt.Color(204, 204, 255));

        onboarding_text.setFont(new java.awt.Font("Poppins Medium", 0, 24)); // NOI18N
        onboarding_text.setForeground(new java.awt.Color(62, 62, 62));
        onboarding_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        onboarding_text.setText("View transactions");

        transactions_table.setBackground(new java.awt.Color(0, 102, 102));
        transactions_table.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        transactions_table.setForeground(new java.awt.Color(204, 255, 255));
        transactions_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Type", "From", "To", "Amount", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        transactions_table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        transactions_table.setSelectionBackground(new java.awt.Color(0, 102, 102));
        transactions_table.setSelectionForeground(new java.awt.Color(0, 102, 102));
        transactions_scroll_pane.setViewportView(transactions_table);

        close_button.setFont(new java.awt.Font("Poppins ExtraBold", 0, 18)); // NOI18N
        close_button.setForeground(new java.awt.Color(51, 51, 51));
        close_button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/back.png"))); // NOI18N
        close_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close_buttonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout right_panelLayout = new javax.swing.GroupLayout(right_panel);
        right_panel.setLayout(right_panelLayout);
        right_panelLayout.setHorizontalGroup(
            right_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(right_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(right_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, right_panelLayout.createSequentialGroup()
                        .addComponent(onboarding_text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, right_panelLayout.createSequentialGroup()
                        .addGap(0, 18, Short.MAX_VALUE)
                        .addGroup(right_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, right_panelLayout.createSequentialGroup()
                                .addComponent(transactions_scroll_pane, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, right_panelLayout.createSequentialGroup()
                                .addComponent(close_button, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))))))
        );
        right_panelLayout.setVerticalGroup(
            right_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(right_panelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(close_button, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(onboarding_text)
                .addGap(26, 26, 26)
                .addComponent(transactions_scroll_pane, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout main_panelLayout = new javax.swing.GroupLayout(main_panel);
        main_panel.setLayout(main_panelLayout);
        main_panelLayout.setHorizontalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_panelLayout.createSequentialGroup()
                .addComponent(left_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(right_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        main_panelLayout.setVerticalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(left_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(right_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logout_iconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout_iconMouseClicked
        System.exit(0);
    }//GEN-LAST:event_logout_iconMouseClicked

    private void logout_textMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout_textMouseClicked
        System.exit(0);
    }//GEN-LAST:event_logout_textMouseClicked

    private void close_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_buttonMouseClicked
        this.dispose();
    }//GEN-LAST:event_close_buttonMouseClicked

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Transactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transactions("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel close_button;
    private javax.swing.JLabel information_text_1;
    private javax.swing.JLabel information_text_10;
    private javax.swing.JLabel information_text_11;
    private javax.swing.JLabel information_text_12;
    private javax.swing.JLabel information_text_2;
    private javax.swing.JLabel information_text_3;
    private javax.swing.JLabel information_text_4;
    private javax.swing.JLabel information_text_5;
    private javax.swing.JLabel information_text_6;
    private javax.swing.JLabel information_text_7;
    private javax.swing.JLabel information_text_8;
    private javax.swing.JLabel information_text_9;
    private javax.swing.JPanel left_panel;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logout_icon;
    private javax.swing.JLabel logout_text;
    private javax.swing.JPanel main_panel;
    private javax.swing.JLabel onboarding_text;
    private javax.swing.JPanel right_panel;
    private javax.swing.JLabel subtitle;
    private javax.swing.JLabel title;
    private javax.swing.JScrollPane transactions_scroll_pane;
    private javax.swing.JTable transactions_table;
    // End of variables declaration//GEN-END:variables
}

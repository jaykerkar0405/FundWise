package com.fundwise;

import java.sql.ResultSet;
import java.sql.Connection;
import javax.swing.ImageIcon;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

public class Home extends javax.swing.JFrame {
    String username;
    
    Database database = new Database();
    Connection connection = database.connect_database();
    
    public Home(String username) {
        initComponents();
        
        toast.setVisible(false);
        
        long id = 0L;
        this.username = username;
        int customer_card_cvv = 0;
        float customer_balance = 0;
        long customer_card_number = 0L;
        SimpleDateFormat date_format = new SimpleDateFormat("MM / yyyy");
        String customer_first_name = "", customer_last_name = "", customer_card_expiry = "";
        
        show_balance.setVisible(false);
        show_balance.setEnabled(false); 
        
        show_card_details.setVisible(false);
        show_card_details.setEnabled(false); 
        
        balance.setBackground(new java.awt.Color(0, 0, 0, 1));
        this.setIconImage(new ImageIcon("D:\\ByteWise\\FundWise\\src\\resources\\images\\icon.png").getImage());
        
        ResultSet rs = database.fetch_customer_information(connection, this.username);
        
        try{
            while(rs.next()){
                id = rs.getLong("id");
                customer_balance = rs.getFloat("balance");
                customer_first_name = rs.getString("first_name");
                customer_last_name = rs.getString("last_name");
                customer_card_number = rs.getLong("card_number");
                customer_card_cvv = rs.getInt("cvv");
                customer_card_expiry = date_format.format(rs.getDate("expiry"));
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        
        customer_id.setText(Long.toString(id));
        balance.setText(Float.toString(customer_balance));
        first_name.setText(customer_first_name);
        last_name.setText(customer_last_name);
        card_number.setText(Long.toString(customer_card_number));
        cvv.setText(Integer.toString(customer_card_cvv));
        expiry.setText(customer_card_expiry);
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
        first_name = new javax.swing.JLabel();
        last_name = new javax.swing.JLabel();
        available_balance = new javax.swing.JLabel();
        balance = new javax.swing.JPasswordField();
        name_separator = new javax.swing.JSeparator();
        currency = new javax.swing.JLabel();
        hide_balance = new javax.swing.JLabel();
        show_balance = new javax.swing.JLabel();
        deposit = new javax.swing.JButton();
        withdraw = new javax.swing.JButton();
        view_transactions = new javax.swing.JButton();
        transfer = new javax.swing.JButton();
        operations_separator = new javax.swing.JSeparator();
        close_button = new javax.swing.JLabel();
        onboarding_text = new javax.swing.JLabel();
        card_details = new javax.swing.JLabel();
        card_details_icon = new javax.swing.JLabel();
        card_panel = new javax.swing.JPanel();
        card_number_label = new javax.swing.JLabel();
        card_number = new javax.swing.JPasswordField();
        expiry_label = new javax.swing.JLabel();
        expiry = new javax.swing.JLabel();
        cvv_label = new javax.swing.JLabel();
        show_card_details = new javax.swing.JLabel();
        hide_card_details = new javax.swing.JLabel();
        cvv = new javax.swing.JPasswordField();
        customer_id_label = new javax.swing.JLabel();
        customer_id = new javax.swing.JLabel();
        toast = new javax.swing.JPanel();
        toast_message = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home || FundWise - Securely access your finances");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("home"); // NOI18N
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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logout_textMouseEntered(evt);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(left_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logout_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logout_text, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        right_panel.setBackground(new java.awt.Color(204, 255, 255));
        right_panel.setForeground(new java.awt.Color(204, 204, 255));

        first_name.setFont(new java.awt.Font("Poppins Medium", 0, 36)); // NOI18N
        first_name.setForeground(new java.awt.Color(41, 32, 117));
        first_name.setText("Jay");

        last_name.setFont(new java.awt.Font("Poppins Medium", 0, 36)); // NOI18N
        last_name.setForeground(new java.awt.Color(41, 32, 117));
        last_name.setText("Kerkar");

        available_balance.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        available_balance.setForeground(new java.awt.Color(0, 102, 102));
        available_balance.setText("Available balance");

        balance.setEditable(false);
        balance.setBackground(new java.awt.Color(204, 255, 255));
        balance.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        balance.setForeground(new java.awt.Color(0, 0, 0));
        balance.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        balance.setText("10000000");
        balance.setBorder(null);
        balance.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        balance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balanceActionPerformed(evt);
            }
        });

        currency.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        currency.setForeground(new java.awt.Color(0, 0, 0));
        currency.setText("Rs");

        hide_balance.setBackground(new java.awt.Color(255, 255, 255));
        hide_balance.setForeground(new java.awt.Color(255, 255, 255));
        hide_balance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/show.png"))); // NOI18N
        hide_balance.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hide_balance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hide_balanceMouseClicked(evt);
            }
        });

        show_balance.setBackground(new java.awt.Color(255, 255, 255));
        show_balance.setForeground(new java.awt.Color(255, 255, 255));
        show_balance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/hide.png"))); // NOI18N
        show_balance.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        show_balance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                show_balanceMouseClicked(evt);
            }
        });

        deposit.setBackground(new java.awt.Color(41, 32, 117));
        deposit.setFont(new java.awt.Font("Poppins Medium", 0, 15)); // NOI18N
        deposit.setForeground(new java.awt.Color(204, 255, 255));
        deposit.setText("Deposit");
        deposit.setBorder(null);
        deposit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositActionPerformed(evt);
            }
        });

        withdraw.setBackground(new java.awt.Color(41, 32, 117));
        withdraw.setFont(new java.awt.Font("Poppins Medium", 0, 15)); // NOI18N
        withdraw.setForeground(new java.awt.Color(204, 255, 255));
        withdraw.setText("Withdraw");
        withdraw.setBorder(null);
        withdraw.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        withdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawActionPerformed(evt);
            }
        });

        view_transactions.setBackground(new java.awt.Color(41, 32, 117));
        view_transactions.setFont(new java.awt.Font("Poppins Medium", 0, 15)); // NOI18N
        view_transactions.setForeground(new java.awt.Color(204, 255, 255));
        view_transactions.setText("View Transactions");
        view_transactions.setBorder(null);
        view_transactions.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        view_transactions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_transactionsActionPerformed(evt);
            }
        });

        transfer.setBackground(new java.awt.Color(41, 32, 117));
        transfer.setFont(new java.awt.Font("Poppins Medium", 0, 15)); // NOI18N
        transfer.setForeground(new java.awt.Color(204, 255, 255));
        transfer.setText("Transfer");
        transfer.setBorder(null);
        transfer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        transfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferActionPerformed(evt);
            }
        });

        close_button.setFont(new java.awt.Font("Poppins ExtraBold", 1, 24)); // NOI18N
        close_button.setForeground(new java.awt.Color(51, 51, 51));
        close_button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close_button.setText("X");
        close_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close_buttonMouseClicked(evt);
            }
        });

        onboarding_text.setFont(new java.awt.Font("Poppins Medium", 0, 24)); // NOI18N
        onboarding_text.setForeground(new java.awt.Color(62, 62, 62));
        onboarding_text.setText("Welcome,");

        card_details.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        card_details.setForeground(new java.awt.Color(0, 102, 102));
        card_details.setText("Your card details");

        card_details_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/credit_card.png"))); // NOI18N

        card_panel.setBackground(new java.awt.Color(204, 255, 255));
        card_panel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));

        card_number_label.setFont(new java.awt.Font("Poppins Medium", 0, 16)); // NOI18N
        card_number_label.setForeground(new java.awt.Color(51, 51, 51));
        card_number_label.setText("Card number:");

        card_number.setEditable(false);
        card_number.setBackground(new java.awt.Color(204, 255, 255));
        card_number.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        card_number.setForeground(new java.awt.Color(102, 102, 102));
        card_number.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        card_number.setText("2244333455452223");
        card_number.setBorder(null);
        card_number.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        card_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card_numberActionPerformed(evt);
            }
        });

        expiry_label.setFont(new java.awt.Font("Poppins Medium", 0, 16)); // NOI18N
        expiry_label.setForeground(new java.awt.Color(51, 51, 51));
        expiry_label.setText("Expiry:");

        expiry.setFont(new java.awt.Font("Poppins Medium", 0, 16)); // NOI18N
        expiry.setForeground(new java.awt.Color(102, 102, 102));
        expiry.setText("04 / 2025");

        cvv_label.setFont(new java.awt.Font("Poppins Medium", 0, 16)); // NOI18N
        cvv_label.setForeground(new java.awt.Color(0, 102, 102));
        cvv_label.setText("CVV:");

        show_card_details.setBackground(new java.awt.Color(255, 255, 255));
        show_card_details.setForeground(new java.awt.Color(255, 255, 255));
        show_card_details.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/hide.png"))); // NOI18N
        show_card_details.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        show_card_details.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                show_card_detailsMouseClicked(evt);
            }
        });

        hide_card_details.setBackground(new java.awt.Color(255, 255, 255));
        hide_card_details.setForeground(new java.awt.Color(255, 255, 255));
        hide_card_details.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/show.png"))); // NOI18N
        hide_card_details.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hide_card_details.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hide_card_detailsMouseClicked(evt);
            }
        });

        cvv.setEditable(false);
        cvv.setBackground(new java.awt.Color(204, 255, 255));
        cvv.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        cvv.setForeground(new java.awt.Color(102, 102, 102));
        cvv.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cvv.setText("523");
        cvv.setBorder(null);
        cvv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cvv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cvvActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout card_panelLayout = new javax.swing.GroupLayout(card_panel);
        card_panel.setLayout(card_panelLayout);
        card_panelLayout.setHorizontalGroup(
            card_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_panelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(card_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(card_panelLayout.createSequentialGroup()
                        .addComponent(card_number_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(card_number, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hide_card_details)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(show_card_details)
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(card_panelLayout.createSequentialGroup()
                        .addComponent(expiry_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(expiry)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cvv_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cvv, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
        );
        card_panelLayout.setVerticalGroup(
            card_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_panelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(card_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(card_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(card_number_label)
                        .addComponent(card_number, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(card_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(hide_card_details, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(show_card_details, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(card_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(expiry_label)
                    .addComponent(expiry)
                    .addComponent(cvv_label)
                    .addComponent(cvv, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        customer_id_label.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        customer_id_label.setForeground(new java.awt.Color(0, 102, 102));
        customer_id_label.setText("Customer ID");

        customer_id.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        customer_id.setForeground(new java.awt.Color(0, 0, 0));
        customer_id.setText("28");

        toast.setBackground(new java.awt.Color(41, 32, 117));

        toast_message.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        toast_message.setForeground(new java.awt.Color(255, 255, 255));
        toast_message.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        toast_message.setText("Success! Transaction Processed");

        javax.swing.GroupLayout toastLayout = new javax.swing.GroupLayout(toast);
        toast.setLayout(toastLayout);
        toastLayout.setHorizontalGroup(
            toastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(toast_message, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
        );
        toastLayout.setVerticalGroup(
            toastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(toast_message, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout right_panelLayout = new javax.swing.GroupLayout(right_panel);
        right_panel.setLayout(right_panelLayout);
        right_panelLayout.setHorizontalGroup(
            right_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(right_panelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(right_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(right_panelLayout.createSequentialGroup()
                        .addComponent(onboarding_text)
                        .addGap(26, 26, 26)
                        .addComponent(toast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(close_button, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(right_panelLayout.createSequentialGroup()
                        .addComponent(card_details)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(card_details_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(right_panelLayout.createSequentialGroup()
                        .addGroup(right_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(right_panelLayout.createSequentialGroup()
                                .addComponent(customer_id_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(customer_id))
                            .addComponent(card_panel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, right_panelLayout.createSequentialGroup()
                                .addComponent(available_balance)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(currency, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(balance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(hide_balance)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(show_balance))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, right_panelLayout.createSequentialGroup()
                                .addComponent(first_name)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(last_name))
                            .addComponent(name_separator, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(operations_separator, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, right_panelLayout.createSequentialGroup()
                                .addGroup(right_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(withdraw, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(transfer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(right_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(deposit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(view_transactions, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))))
                        .addContainerGap(65, Short.MAX_VALUE))))
        );
        right_panelLayout.setVerticalGroup(
            right_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(right_panelLayout.createSequentialGroup()
                .addGroup(right_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, right_panelLayout.createSequentialGroup()
                        .addComponent(onboarding_text)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(right_panelLayout.createSequentialGroup()
                        .addGroup(right_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(toast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(close_button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(right_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(first_name)
                    .addComponent(last_name, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name_separator, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(right_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(hide_balance, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(right_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(right_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(available_balance)
                            .addComponent(balance, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(currency))
                        .addComponent(show_balance, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(right_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customer_id_label)
                    .addComponent(customer_id))
                .addGap(18, 18, 18)
                .addGroup(right_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deposit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(withdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(right_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transfer, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(view_transactions, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(operations_separator, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(right_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(card_details_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card_details))
                .addGap(18, 18, 18)
                .addComponent(card_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
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

    private void logout_textMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout_textMouseClicked
        System.exit(0);
    }//GEN-LAST:event_logout_textMouseClicked

    private void logout_iconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout_iconMouseClicked
        System.exit(0);
    }//GEN-LAST:event_logout_iconMouseClicked

    private void balanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_balanceActionPerformed
    
    private void hide_balanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hide_balanceMouseClicked
        balance.setEchoChar((char)0);

        hide_balance.setVisible(false);
        hide_balance.setEnabled(false);

        show_balance.setVisible(true);
        show_balance.setEnabled(true);
        
        float customer_balance = 0;
        ResultSet rs = database.fetch_customer_information(connection, this.username);
        
        
        try{
            while(rs.next()){
                customer_balance = rs.getFloat("balance");
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        
        balance.setText(Float.toString(customer_balance));
    }//GEN-LAST:event_hide_balanceMouseClicked

    private void show_balanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show_balanceMouseClicked
        balance.setEchoChar((char)8226);

        show_balance.setVisible(false);
        show_balance.setEnabled(false);

        hide_balance.setVisible(true);
        hide_balance.setEnabled(true);
    }//GEN-LAST:event_show_balanceMouseClicked

    private void depositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositActionPerformed
        Deposit deposit  = new Deposit(toast);
        deposit.username = this.username;
        deposit.show();
    }//GEN-LAST:event_depositActionPerformed

    private void transferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferActionPerformed
        Transfer transfer = new Transfer(toast);
        transfer.username = this.username;
        transfer.show();
    }//GEN-LAST:event_transferActionPerformed

    private void close_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_buttonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_close_buttonMouseClicked

    private void view_transactionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_transactionsActionPerformed
        Transactions transactions = new Transactions(this.username);
        transactions.show();
    }//GEN-LAST:event_view_transactionsActionPerformed

    private void card_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_card_numberActionPerformed

    private void hide_card_detailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hide_card_detailsMouseClicked
        cvv.setEchoChar((char)0);
        card_number.setEchoChar((char)0);
        
        hide_card_details.setVisible(false);
        hide_card_details.setEnabled(false);

        show_card_details.setVisible(true);
        show_card_details.setEnabled(true);
    }//GEN-LAST:event_hide_card_detailsMouseClicked

    private void show_card_detailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show_card_detailsMouseClicked
        cvv.setEchoChar((char)8226);
        card_number.setEchoChar((char)8226);

        show_card_details.setVisible(false);
        show_card_details.setEnabled(false);

        hide_card_details.setVisible(true);
        hide_card_details.setEnabled(true);
    }//GEN-LAST:event_show_card_detailsMouseClicked

    private void withdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawActionPerformed
        Withdraw withdraw  = new Withdraw(toast);
        withdraw.username = this.username;
        withdraw.show();
    }//GEN-LAST:event_withdrawActionPerformed

    private void logout_textMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout_textMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_logout_textMouseEntered

    private void cvvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cvvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cvvActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            new Home("").setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel available_balance;
    private javax.swing.JPasswordField balance;
    private javax.swing.JLabel card_details;
    private javax.swing.JLabel card_details_icon;
    private javax.swing.JPasswordField card_number;
    private javax.swing.JLabel card_number_label;
    private javax.swing.JPanel card_panel;
    private javax.swing.JLabel close_button;
    private javax.swing.JLabel currency;
    private javax.swing.JLabel customer_id;
    private javax.swing.JLabel customer_id_label;
    private javax.swing.JPasswordField cvv;
    private javax.swing.JLabel cvv_label;
    private javax.swing.JButton deposit;
    private javax.swing.JLabel expiry;
    private javax.swing.JLabel expiry_label;
    private javax.swing.JLabel first_name;
    private javax.swing.JLabel hide_balance;
    private javax.swing.JLabel hide_card_details;
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
    private javax.swing.JLabel last_name;
    private javax.swing.JPanel left_panel;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logout_icon;
    private javax.swing.JLabel logout_text;
    private javax.swing.JPanel main_panel;
    private javax.swing.JSeparator name_separator;
    private javax.swing.JLabel onboarding_text;
    private javax.swing.JSeparator operations_separator;
    private javax.swing.JPanel right_panel;
    private javax.swing.JLabel show_balance;
    private javax.swing.JLabel show_card_details;
    private javax.swing.JLabel subtitle;
    private javax.swing.JLabel title;
    private javax.swing.JPanel toast;
    private javax.swing.JLabel toast_message;
    private javax.swing.JButton transfer;
    private javax.swing.JButton view_transactions;
    private javax.swing.JButton withdraw;
    // End of variables declaration//GEN-END:variables
}

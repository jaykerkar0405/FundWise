package com.fundwise;

import java.sql.Connection;
import javax.swing.ImageIcon;

public class Transfer extends javax.swing.JFrame {
    String username;
    javax.swing.JPanel toast = new javax.swing.JPanel();
    
    Database database = new Database();
    Connection connection = database.connect_database();
    
    public Transfer(javax.swing.JPanel toast) {
        initComponents();
        
        amount.setBackground(new java.awt.Color(0, 0, 0, 1));
        transfer_to.setBackground(new java.awt.Color(0, 0, 0, 1));
        
        this.toast = toast;
        error.setVisible(false);
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
        amount_label = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        amount_icon = new javax.swing.JLabel();
        amount_separator = new javax.swing.JSeparator();
        transfer_to = new javax.swing.JTextField();
        transfer_to_label = new javax.swing.JLabel();
        transfer_to_icon = new javax.swing.JLabel();
        transfer_to_separator = new javax.swing.JSeparator();
        proceed_to_transfer = new javax.swing.JButton();
        close_button = new javax.swing.JLabel();
        error = new javax.swing.JPanel();
        error_message = new javax.swing.JLabel();
        error_icon = new javax.swing.JLabel();
        precaution_message = new javax.swing.JLabel();
        currency_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Transfer || FundWise - Securely access your finances");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setName("withdraw"); // NOI18N
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

        right_panel.setBackground(new java.awt.Color(0, 102, 102));
        right_panel.setForeground(new java.awt.Color(204, 204, 255));

        onboarding_text.setFont(new java.awt.Font("Poppins Medium", 0, 24)); // NOI18N
        onboarding_text.setForeground(new java.awt.Color(204, 255, 255));
        onboarding_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        onboarding_text.setText("Transfer Funds");

        amount_label.setFont(new java.awt.Font("Poppins Medium", 0, 16)); // NOI18N
        amount_label.setForeground(new java.awt.Color(204, 255, 255));
        amount_label.setText("Amount");

        amount.setBackground(new java.awt.Color(255, 255, 255));
        amount.setFont(new java.awt.Font("Poppins", 0, 17)); // NOI18N
        amount.setForeground(new java.awt.Color(255, 255, 255));
        amount.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        amount.setBorder(null);
        amount.setCaretColor(new java.awt.Color(255, 255, 255));
        amount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                amountFocusGained(evt);
            }
        });
        amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountActionPerformed(evt);
            }
        });

        amount_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/amount.png"))); // NOI18N

        amount_separator.setBackground(new java.awt.Color(255, 255, 255));
        amount_separator.setForeground(java.awt.Color.white);

        transfer_to.setBackground(new java.awt.Color(255, 255, 255));
        transfer_to.setFont(new java.awt.Font("Poppins", 0, 17)); // NOI18N
        transfer_to.setForeground(new java.awt.Color(255, 255, 255));
        transfer_to.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        transfer_to.setBorder(null);
        transfer_to.setCaretColor(new java.awt.Color(255, 255, 255));
        transfer_to.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                transfer_toFocusGained(evt);
            }
        });
        transfer_to.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfer_toActionPerformed(evt);
            }
        });

        transfer_to_label.setFont(new java.awt.Font("Poppins Medium", 0, 16)); // NOI18N
        transfer_to_label.setForeground(new java.awt.Color(204, 255, 255));
        transfer_to_label.setText("Transfer To (Customer ID)");

        transfer_to_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/username.png"))); // NOI18N

        transfer_to_separator.setBackground(new java.awt.Color(255, 255, 255));
        transfer_to_separator.setForeground(java.awt.Color.white);

        proceed_to_transfer.setBackground(new java.awt.Color(255, 255, 255));
        proceed_to_transfer.setFont(new java.awt.Font("Poppins Medium", 0, 15)); // NOI18N
        proceed_to_transfer.setForeground(new java.awt.Color(0, 0, 0));
        proceed_to_transfer.setText("Proceed to Transfer");
        proceed_to_transfer.setBorder(null);
        proceed_to_transfer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        proceed_to_transfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceed_to_transferActionPerformed(evt);
            }
        });

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

        error.setBackground(new java.awt.Color(255, 87, 51));

        error_message.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        error_message.setForeground(new java.awt.Color(255, 255, 255));
        error_message.setText("Insufficient funds for transaction");

        error_icon.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        error_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/error.png"))); // NOI18N

        javax.swing.GroupLayout errorLayout = new javax.swing.GroupLayout(error);
        error.setLayout(errorLayout);
        errorLayout.setHorizontalGroup(
            errorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, errorLayout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addComponent(error_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(error_message)
                .addGap(64, 64, 64))
        );
        errorLayout.setVerticalGroup(
            errorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(error_message, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
            .addGroup(errorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(error_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        precaution_message.setFont(new java.awt.Font("Poppins", 0, 16)); // NOI18N
        precaution_message.setForeground(new java.awt.Color(196, 218, 240));
        precaution_message.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        precaution_message.setText("Attention: Confirm Recipient ID for Secure Transfer");

        currency_label.setFont(new java.awt.Font("Poppins Medium", 0, 16)); // NOI18N
        currency_label.setForeground(new java.awt.Color(204, 255, 255));
        currency_label.setText("Rs");

        javax.swing.GroupLayout right_panelLayout = new javax.swing.GroupLayout(right_panel);
        right_panel.setLayout(right_panelLayout);
        right_panelLayout.setHorizontalGroup(
            right_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(right_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(onboarding_text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, right_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(close_button, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(right_panelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(right_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(amount_separator, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transfer_to_separator, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transfer_to_label)
                    .addComponent(precaution_message, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(right_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(proceed_to_transfer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, right_panelLayout.createSequentialGroup()
                            .addComponent(transfer_to, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(41, 41, 41)
                            .addComponent(transfer_to_icon)))
                    .addGroup(right_panelLayout.createSequentialGroup()
                        .addGroup(right_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(amount_label)
                            .addGroup(right_panelLayout.createSequentialGroup()
                                .addComponent(currency_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42)
                        .addComponent(amount_icon)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        right_panelLayout.setVerticalGroup(
            right_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(right_panelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(right_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(close_button, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(onboarding_text)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(precaution_message)
                .addGap(63, 63, 63)
                .addComponent(amount_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(right_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(right_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(currency_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(amount, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                    .addComponent(amount_icon, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(amount_separator, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(transfer_to_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(right_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(transfer_to_icon)
                    .addComponent(transfer_to, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(transfer_to_separator, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(proceed_to_transfer, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
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

    private void amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountActionPerformed

    }//GEN-LAST:event_amountActionPerformed

    private void amountFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_amountFocusGained
        error.setVisible(false);
    }//GEN-LAST:event_amountFocusGained

    private void transfer_toFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_transfer_toFocusGained
        error.setVisible(false);
    }//GEN-LAST:event_transfer_toFocusGained

    private void transfer_toActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfer_toActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transfer_toActionPerformed

    private void proceed_to_transferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceed_to_transferActionPerformed
        float transfer_amount = Float.parseFloat(amount.getText());
        int transfer_to_account = Integer.parseInt(transfer_to.getText());
        
        if(transfer_amount > 0 && transfer_to_account > 0) {
            boolean transfer_funds = database.transfer(connection, username, transfer_to_account, transfer_amount);
            
            if(transfer_funds) {
               this.dispose();
               database.display_toast(toast);
            }else{
                error.setVisible(true);
                amount.setText("");
                transfer_to.setText("");
            }
        }
    }//GEN-LAST:event_proceed_to_transferActionPerformed

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
            java.util.logging.Logger.getLogger(Transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        javax.swing.JPanel toast = new javax.swing.JPanel();
        
        java.awt.EventQueue.invokeLater(() -> {
            new Transfer(toast).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amount;
    private javax.swing.JLabel amount_icon;
    private javax.swing.JLabel amount_label;
    private javax.swing.JSeparator amount_separator;
    private javax.swing.JLabel close_button;
    private javax.swing.JLabel currency_label;
    private javax.swing.JPanel error;
    private javax.swing.JLabel error_icon;
    private javax.swing.JLabel error_message;
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
    private javax.swing.JLabel precaution_message;
    private javax.swing.JButton proceed_to_transfer;
    private javax.swing.JPanel right_panel;
    private javax.swing.JLabel subtitle;
    private javax.swing.JLabel title;
    private javax.swing.JTextField transfer_to;
    private javax.swing.JLabel transfer_to_icon;
    private javax.swing.JLabel transfer_to_label;
    private javax.swing.JSeparator transfer_to_separator;
    // End of variables declaration//GEN-END:variables
}

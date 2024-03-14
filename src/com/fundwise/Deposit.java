package com.fundwise;

import java.sql.Connection;
import javax.swing.ImageIcon;

public class Deposit extends javax.swing.JFrame {
    String username;
    javax.swing.JPanel toast = new javax.swing.JPanel();
    
    Database database = new Database();
    Connection connection = database.connect_database();
    
    public Deposit(javax.swing.JPanel toast) {
        initComponents();
        
        this.toast = toast;
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
        close_button = new javax.swing.JLabel();
        onboarding_text = new javax.swing.JLabel();
        amount_panel = new javax.swing.JPanel();
        amount = new javax.swing.JTextField();
        one = new javax.swing.JButton();
        two = new javax.swing.JButton();
        three = new javax.swing.JButton();
        four = new javax.swing.JButton();
        five = new javax.swing.JButton();
        six = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        backspace = new javax.swing.JButton();
        decimal_point = new javax.swing.JButton();
        deposit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Deposit || FundWise - Securely access your finances");
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

        right_panel.setBackground(new java.awt.Color(204, 255, 255));
        right_panel.setForeground(new java.awt.Color(204, 204, 255));

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

        onboarding_text.setFont(new java.awt.Font("Poppins Medium", 0, 24)); // NOI18N
        onboarding_text.setForeground(new java.awt.Color(62, 62, 62));
        onboarding_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        onboarding_text.setText("Deposit Funds");

        amount_panel.setBackground(new java.awt.Color(41, 32, 117));

        amount.setEditable(false);
        amount.setBackground(new java.awt.Color(204, 255, 255));
        amount.setFont(new java.awt.Font("Poppins Medium", 0, 30)); // NOI18N
        amount.setForeground(new java.awt.Color(102, 102, 102));
        amount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountActionPerformed(evt);
            }
        });

        one.setBackground(new java.awt.Color(204, 255, 255));
        one.setFont(new java.awt.Font("Poppins Medium", 1, 18)); // NOI18N
        one.setForeground(new java.awt.Color(0, 0, 0));
        one.setText("1");
        one.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });

        two.setBackground(new java.awt.Color(204, 255, 255));
        two.setFont(new java.awt.Font("Poppins Medium", 1, 18)); // NOI18N
        two.setForeground(new java.awt.Color(0, 0, 0));
        two.setText("2");
        two.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });

        three.setBackground(new java.awt.Color(204, 255, 255));
        three.setFont(new java.awt.Font("Poppins Medium", 1, 18)); // NOI18N
        three.setForeground(new java.awt.Color(0, 0, 0));
        three.setText("3");
        three.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });

        four.setBackground(new java.awt.Color(204, 255, 255));
        four.setFont(new java.awt.Font("Poppins Medium", 1, 18)); // NOI18N
        four.setForeground(new java.awt.Color(0, 0, 0));
        four.setText("4");
        four.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });

        five.setBackground(new java.awt.Color(204, 255, 255));
        five.setFont(new java.awt.Font("Poppins Medium", 1, 18)); // NOI18N
        five.setForeground(new java.awt.Color(0, 0, 0));
        five.setText("5");
        five.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });

        six.setBackground(new java.awt.Color(204, 255, 255));
        six.setFont(new java.awt.Font("Poppins Medium", 1, 18)); // NOI18N
        six.setForeground(new java.awt.Color(0, 0, 0));
        six.setText("6");
        six.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });

        seven.setBackground(new java.awt.Color(204, 255, 255));
        seven.setFont(new java.awt.Font("Poppins Medium", 1, 18)); // NOI18N
        seven.setForeground(new java.awt.Color(0, 0, 0));
        seven.setText("7");
        seven.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });

        eight.setBackground(new java.awt.Color(204, 255, 255));
        eight.setFont(new java.awt.Font("Poppins Medium", 1, 18)); // NOI18N
        eight.setForeground(new java.awt.Color(0, 0, 0));
        eight.setText("8");
        eight.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });

        nine.setBackground(new java.awt.Color(204, 255, 255));
        nine.setFont(new java.awt.Font("Poppins Medium", 1, 18)); // NOI18N
        nine.setForeground(new java.awt.Color(0, 0, 0));
        nine.setText("9");
        nine.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });

        zero.setBackground(new java.awt.Color(204, 255, 255));
        zero.setFont(new java.awt.Font("Poppins Medium", 1, 18)); // NOI18N
        zero.setForeground(new java.awt.Color(0, 0, 0));
        zero.setText("0");
        zero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        backspace.setBackground(new java.awt.Color(204, 255, 255));
        backspace.setFont(new java.awt.Font("Poppins Medium", 1, 18)); // NOI18N
        backspace.setForeground(new java.awt.Color(0, 0, 0));
        backspace.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/backspace.png"))); // NOI18N
        backspace.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backspaceActionPerformed(evt);
            }
        });

        decimal_point.setBackground(new java.awt.Color(204, 255, 255));
        decimal_point.setFont(new java.awt.Font("Poppins Medium", 1, 18)); // NOI18N
        decimal_point.setForeground(new java.awt.Color(0, 0, 0));
        decimal_point.setText(".");
        decimal_point.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        decimal_point.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decimal_pointActionPerformed(evt);
            }
        });

        deposit.setBackground(new java.awt.Color(204, 255, 255));
        deposit.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        deposit.setForeground(new java.awt.Color(0, 51, 51));
        deposit.setText("Deposit");
        deposit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout amount_panelLayout = new javax.swing.GroupLayout(amount_panel);
        amount_panel.setLayout(amount_panelLayout);
        amount_panelLayout.setHorizontalGroup(
            amount_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(amount_panelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(amount_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deposit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(amount)
                    .addGroup(amount_panelLayout.createSequentialGroup()
                        .addGroup(amount_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(seven, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                            .addComponent(four, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(one, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(decimal_point, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addGroup(amount_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(amount_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backspace, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        amount_panelLayout.setVerticalGroup(
            amount_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(amount_panelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(amount_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(amount_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(amount_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(amount_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(decimal_point, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backspace, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(deposit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout right_panelLayout = new javax.swing.GroupLayout(right_panel);
        right_panel.setLayout(right_panelLayout);
        right_panelLayout.setHorizontalGroup(
            right_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(right_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(right_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(right_panelLayout.createSequentialGroup()
                        .addComponent(onboarding_text, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, right_panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(amount_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, right_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(close_button, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        right_panelLayout.setVerticalGroup(
            right_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(right_panelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(close_button, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(onboarding_text)
                .addGap(29, 29, 29)
                .addComponent(amount_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
        amount.setText(amount.getText() + "1");
    }//GEN-LAST:event_oneActionPerformed

    private void amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountActionPerformed

    private void logout_iconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout_iconMouseClicked
        System.exit(0);
    }//GEN-LAST:event_logout_iconMouseClicked

    private void logout_textMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout_textMouseClicked
        System.exit(0);
    }//GEN-LAST:event_logout_textMouseClicked

    private void close_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_buttonMouseClicked
        this.dispose();
    }//GEN-LAST:event_close_buttonMouseClicked

    private void depositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositActionPerformed
        if(amount.getText().length() > 0) {
            database.deposit(connection, this.username, Float.parseFloat(amount.getText()));
            this.dispose();
            database.display_toast(toast);
        }
    }//GEN-LAST:event_depositActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
        amount.setText(amount.getText() + "3");
    }//GEN-LAST:event_threeActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        amount.setText(amount.getText() + "2");
    }//GEN-LAST:event_twoActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
        amount.setText(amount.getText() + "4");
    }//GEN-LAST:event_fourActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
        amount.setText(amount.getText() + "7");
    }//GEN-LAST:event_sevenActionPerformed

    private void decimal_pointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decimal_pointActionPerformed
        amount.setText(amount.getText() + ".");
    }//GEN-LAST:event_decimal_pointActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        amount.setText(amount.getText() + "0");
    }//GEN-LAST:event_zeroActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
        amount.setText(amount.getText() + "8");
    }//GEN-LAST:event_eightActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
        amount.setText(amount.getText() + "5");
    }//GEN-LAST:event_fiveActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
        amount.setText(amount.getText() + "6");
    }//GEN-LAST:event_sixActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
        amount.setText(amount.getText() + "9");
    }//GEN-LAST:event_nineActionPerformed

    private void backspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backspaceActionPerformed
        if(amount.getText().length() > 0) {
            amount.setText(amount.getText().substring(0, amount.getText().length() - 1));
        }
    }//GEN-LAST:event_backspaceActionPerformed

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
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        javax.swing.JPanel toast = new javax.swing.JPanel();
        
        java.awt.EventQueue.invokeLater(() -> {
            new Deposit(toast).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amount;
    private javax.swing.JPanel amount_panel;
    private javax.swing.JButton backspace;
    private javax.swing.JLabel close_button;
    private javax.swing.JButton decimal_point;
    private javax.swing.JButton deposit;
    private javax.swing.JButton eight;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
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
    private javax.swing.JButton nine;
    private javax.swing.JLabel onboarding_text;
    private javax.swing.JButton one;
    private javax.swing.JPanel right_panel;
    private javax.swing.JButton seven;
    private javax.swing.JButton six;
    private javax.swing.JLabel subtitle;
    private javax.swing.JButton three;
    private javax.swing.JLabel title;
    private javax.swing.JButton two;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}

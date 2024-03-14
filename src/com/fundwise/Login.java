package com.fundwise;

import java.sql.Connection;
import javax.swing.ImageIcon;

public class Login extends javax.swing.JFrame {
    Database database = new Database();
    Connection connection = database.connect_database();
    
    public Login() {
        initComponents();
        username.setBackground(new java.awt.Color(0, 0, 0, 1));
        password.setBackground(new java.awt.Color(0, 0, 0, 1));
        
        show_password.setVisible(false);
        show_password.setEnabled(false); 
        
        loading.setVisible(false);
        error.setVisible(false);
       
        this.setIconImage(new ImageIcon("D:\\ByteWise\\FundWise\\src\\resources\\images\\icon.png").getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main_panel = new javax.swing.JPanel();
        left_panel = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        right_panel = new javax.swing.JPanel();
        close_button = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        subtitle = new javax.swing.JLabel();
        username_label = new javax.swing.JLabel();
        username_icon = new javax.swing.JLabel();
        password_label = new javax.swing.JLabel();
        hide_password = new javax.swing.JLabel();
        proceed_to_login = new javax.swing.JButton();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        username_separator = new javax.swing.JSeparator();
        password_separator = new javax.swing.JSeparator();
        show_password = new javax.swing.JLabel();
        loading = new javax.swing.JPanel();
        loading_message = new javax.swing.JLabel();
        loading_icon = new javax.swing.JLabel();
        error = new javax.swing.JPanel();
        error_message = new javax.swing.JLabel();
        error_icon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FundWise || Securely access your finances");
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImages(null);
        setName("login"); // NOI18N
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        main_panel.setPreferredSize(new java.awt.Dimension(825, 600));

        left_panel.setBackground(new java.awt.Color(41, 32, 117));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/logo.png"))); // NOI18N
        logo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        logo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        right_panel.setBackground(new java.awt.Color(0, 102, 102));

        close_button.setFont(new java.awt.Font("Poppins ExtraBold", 1, 24)); // NOI18N
        close_button.setForeground(new java.awt.Color(255, 255, 255));
        close_button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close_button.setText("X");
        close_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close_buttonMouseClicked(evt);
            }
        });

        title.setFont(new java.awt.Font("Poppins Medium", 1, 36)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Login");

        subtitle.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        subtitle.setForeground(new java.awt.Color(196, 218, 240));
        subtitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitle.setText("Securely access your finances.");

        username_label.setFont(new java.awt.Font("Poppins Medium", 0, 16)); // NOI18N
        username_label.setForeground(new java.awt.Color(255, 255, 255));
        username_label.setText("Username");

        username_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/username.png"))); // NOI18N

        password_label.setFont(new java.awt.Font("Poppins Medium", 0, 16)); // NOI18N
        password_label.setForeground(new java.awt.Color(255, 255, 255));
        password_label.setText("Password");

        hide_password.setBackground(new java.awt.Color(255, 255, 255));
        hide_password.setForeground(new java.awt.Color(255, 255, 255));
        hide_password.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/show.png"))); // NOI18N
        hide_password.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hide_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hide_passwordMouseClicked(evt);
            }
        });

        proceed_to_login.setBackground(new java.awt.Color(255, 255, 255));
        proceed_to_login.setFont(new java.awt.Font("Poppins Medium", 0, 15)); // NOI18N
        proceed_to_login.setForeground(new java.awt.Color(0, 0, 0));
        proceed_to_login.setText("Proceed to Login");
        proceed_to_login.setBorder(null);
        proceed_to_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        proceed_to_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceed_to_loginActionPerformed(evt);
            }
        });

        username.setBackground(new java.awt.Color(255, 255, 255));
        username.setFont(new java.awt.Font("Poppins", 0, 17)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        username.setBorder(null);
        username.setCaretColor(new java.awt.Color(255, 255, 255));
        username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameFocusGained(evt);
            }
        });
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        password.setBackground(new java.awt.Color(255, 255, 255));
        password.setFont(new java.awt.Font("Poppins", 0, 17)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        password.setBorder(null);
        password.setCaretColor(new java.awt.Color(255, 255, 255));
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained(evt);
            }
        });

        username_separator.setBackground(new java.awt.Color(255, 255, 255));
        username_separator.setForeground(java.awt.Color.white);

        password_separator.setBackground(new java.awt.Color(255, 255, 255));
        password_separator.setForeground(new java.awt.Color(255, 255, 255));

        show_password.setBackground(new java.awt.Color(255, 255, 255));
        show_password.setForeground(new java.awt.Color(255, 255, 255));
        show_password.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/hide.png"))); // NOI18N
        show_password.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        show_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                show_passwordMouseClicked(evt);
            }
        });

        loading.setBackground(new java.awt.Color(41, 32, 117));

        loading_message.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        loading_message.setForeground(new java.awt.Color(255, 255, 255));
        loading_message.setText("Please wait while we validate your details.");

        loading_icon.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        loading_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/loading.gif"))); // NOI18N

        javax.swing.GroupLayout loadingLayout = new javax.swing.GroupLayout(loading);
        loading.setLayout(loadingLayout);
        loadingLayout.setHorizontalGroup(
            loadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loadingLayout.createSequentialGroup()
                .addComponent(loading_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loading_message, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        loadingLayout.setVerticalGroup(
            loadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loading_message, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loadingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loading_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        error.setBackground(new java.awt.Color(255, 87, 51));

        error_message.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        error_message.setForeground(new java.awt.Color(255, 255, 255));
        error_message.setText("Invalid username or password. Please try again.");

        error_icon.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        error_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/error.png"))); // NOI18N

        javax.swing.GroupLayout errorLayout = new javax.swing.GroupLayout(error);
        error.setLayout(errorLayout);
        errorLayout.setHorizontalGroup(
            errorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, errorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(error_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(error_message, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        errorLayout.setVerticalGroup(
            errorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(error_message, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
            .addGroup(errorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(error_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout right_panelLayout = new javax.swing.GroupLayout(right_panel);
        right_panel.setLayout(right_panelLayout);
        right_panelLayout.setHorizontalGroup(
            right_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(right_panelLayout.createSequentialGroup()
                .addGroup(right_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(right_panelLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(right_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, right_panelLayout.createSequentialGroup()
                                .addGroup(right_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(username_label)
                                    .addComponent(password_label))
                                .addGroup(right_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(right_panelLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(username_icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(right_panelLayout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(hide_password)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(show_password)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, right_panelLayout.createSequentialGroup()
                                .addGroup(right_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(password_separator, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(proceed_to_login, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(username_separator, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(right_panelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(loading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(close_button, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(right_panelLayout.createSequentialGroup()
                .addGroup(right_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(right_panelLayout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(title))
                    .addGroup(right_panelLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(subtitle)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(right_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(right_panelLayout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(69, Short.MAX_VALUE)))
        );
        right_panelLayout.setVerticalGroup(
            right_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(right_panelLayout.createSequentialGroup()
                .addGroup(right_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(close_button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subtitle)
                .addGap(34, 34, 34)
                .addComponent(username_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(right_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(username_icon)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(username_separator, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(password_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(right_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(right_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(hide_password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                    .addComponent(show_password, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password_separator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(proceed_to_login, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
            .addGroup(right_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(right_panelLayout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(541, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout left_panelLayout = new javax.swing.GroupLayout(left_panel);
        left_panel.setLayout(left_panelLayout);
        left_panelLayout.setHorizontalGroup(
            left_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(left_panelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(logo)
                .addGap(18, 18, 18)
                .addComponent(right_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        left_panelLayout.setVerticalGroup(
            left_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(right_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(left_panelLayout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(logo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout main_panelLayout = new javax.swing.GroupLayout(main_panel);
        main_panel.setLayout(main_panelLayout);
        main_panelLayout.setHorizontalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(left_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        main_panelLayout.setVerticalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(left_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void close_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_buttonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_close_buttonMouseClicked

    private void proceed_to_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceed_to_loginActionPerformed
        String identifier = username.getText();
        String key = new String(password.getPassword());
        
        if(identifier.length() != 0 && key.length() != 0) {
            loading.setVisible(true);
            boolean login = database.login(connection, identifier, key);
            
            if(login) {
                loading.setVisible(false);
                
                Home home = new Home(identifier);
                home.show();
                
                this.dispose();
            }else{
                loading.setVisible(false);
                error.setVisible(true);
                
                username.setText("");
                password.setText("");
            }
        }
    }//GEN-LAST:event_proceed_to_loginActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        
    }//GEN-LAST:event_usernameActionPerformed

    private void hide_passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hide_passwordMouseClicked
        password.setEchoChar((char)0);
        
        hide_password.setVisible(false);
        hide_password.setEnabled(false);
        
        show_password.setVisible(true);
        show_password.setEnabled(true);
    }//GEN-LAST:event_hide_passwordMouseClicked

    private void show_passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show_passwordMouseClicked
        password.setEchoChar((char)8226);
        
        show_password.setVisible(false);
        show_password.setEnabled(false);
        
        hide_password.setVisible(true);
        hide_password.setEnabled(true);
    }//GEN-LAST:event_show_passwordMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusGained
        error.setVisible(false);
    }//GEN-LAST:event_usernameFocusGained

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusGained
        error.setVisible(false);
    }//GEN-LAST:event_passwordFocusGained

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel close_button;
    private javax.swing.JPanel error;
    private javax.swing.JLabel error_icon;
    private javax.swing.JLabel error_message;
    private javax.swing.JLabel hide_password;
    private javax.swing.JPanel left_panel;
    private javax.swing.JPanel loading;
    private javax.swing.JLabel loading_icon;
    private javax.swing.JLabel loading_message;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel main_panel;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel password_label;
    private javax.swing.JSeparator password_separator;
    private javax.swing.JButton proceed_to_login;
    private javax.swing.JPanel right_panel;
    private javax.swing.JLabel show_password;
    private javax.swing.JLabel subtitle;
    private javax.swing.JLabel title;
    private javax.swing.JTextField username;
    private javax.swing.JLabel username_icon;
    private javax.swing.JLabel username_label;
    private javax.swing.JSeparator username_separator;
    // End of variables declaration//GEN-END:variables
}

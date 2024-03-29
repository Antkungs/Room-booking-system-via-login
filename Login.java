package javabook;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    private final String path = "PATH\\data.txt"; //data.txt
    
    public Login() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        labelLogin = new javax.swing.JLabel();
        labelUsername = new javax.swing.JLabel();
        userInput = new javax.swing.JTextField();
        labelPwd = new javax.swing.JLabel();
        checkBoxShowPwd = new javax.swing.JCheckBox();
        btLogin = new javax.swing.JButton();
        labelRegister = new javax.swing.JLabel();
        btRegister = new javax.swing.JButton();
        pwdInput = new javax.swing.JPasswordField();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setLocation(new java.awt.Point(500, 250));

        labelLogin.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        labelLogin.setText("Login");

        labelUsername.setText("Username");

        labelPwd.setText("Password");

        checkBoxShowPwd.setText("Show Password");
        checkBoxShowPwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxShowPwdActionPerformed(evt);
            }
        });

        btLogin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btLogin.setText("Login");
        btLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoginActionPerformed(evt);
            }
        });

        labelRegister.setText("Don't have an account ?");

        btRegister.setText("Register");
        btRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegisterActionPerformed(evt);
            }
        });

        pwdInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdInputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelRegister)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btRegister))
                    .addComponent(checkBoxShowPwd)
                    .addComponent(labelPwd)
                    .addComponent(labelUsername)
                    .addComponent(userInput)
                    .addComponent(btLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                    .addComponent(pwdInput))
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelLogin)
                .addGap(146, 146, 146))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(labelLogin)
                .addGap(18, 18, 18)
                .addComponent(labelUsername)
                .addGap(18, 18, 18)
                .addComponent(userInput, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelPwd)
                .addGap(18, 18, 18)
                .addComponent(pwdInput, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(checkBoxShowPwd)
                .addGap(18, 18, 18)
                .addComponent(btLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRegister)
                    .addComponent(btRegister))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(178, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkBoxShowPwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxShowPwdActionPerformed
      if(checkBoxShowPwd.isSelected()){
          pwdInput.setEchoChar((char)0);
      }       
      else{
          pwdInput.setEchoChar(('*'));
      }
    }//GEN-LAST:event_checkBoxShowPwdActionPerformed

    private void btRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegisterActionPerformed
        Register r1 = new Register();
        r1.show();
        dispose();
    }//GEN-LAST:event_btRegisterActionPerformed

    private void btLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoginActionPerformed

        String username = userInput.getText();
        String password = pwdInput.getText();
        if( username.equals("")){
            JOptionPane.showMessageDialog(null,"Please fill out username");
        }
        else if( password.equals("")){
            JOptionPane.showMessageDialog(null,"Please fill out password");
        }
        
        else{
            try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
                String line;
                boolean found = false;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(",");
                    if (parts.length == 2 && parts[0].equals(username) && parts[1].equals(password)) {
                        found = true;
                        break;
                    }
                }
                if (found) {
                    homePage m1 = new homePage(username);
                    m1.show();
                    dispose();
                } else {
                    userInput.setText("");
                    pwdInput.setText("");
                    JOptionPane.showMessageDialog(null, "Wrong username or password!!!", "Message", JOptionPane.ERROR_MESSAGE);
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error reading user data", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btLoginActionPerformed

    private void pwdInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdInputActionPerformed

    }//GEN-LAST:event_pwdInputActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLogin;
    private javax.swing.JButton btRegister;
    private javax.swing.JCheckBox checkBoxShowPwd;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelPwd;
    private javax.swing.JLabel labelRegister;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JPasswordField pwdInput;
    private javax.swing.JTextField userInput;
    // End of variables declaration//GEN-END:variables
}

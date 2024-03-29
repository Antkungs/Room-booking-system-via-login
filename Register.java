package javabook;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Register extends javax.swing.JFrame {

    private final String path = "PATH\\data.txt"; //data.txt
    public Register() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox2 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        labelRegister = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        usernameInput = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pwdInput = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        pwdConfirmInput = new javax.swing.JPasswordField();
        checkBoxShowPwd = new javax.swing.JCheckBox();
        btSubmit = new javax.swing.JButton();
        btCancel = new javax.swing.JButton();

        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Register");
        setLocation(new java.awt.Point(500, 250));

        labelRegister.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        labelRegister.setText("Register");

        jLabel1.setText("Username");

        jLabel2.setText("Password");

        jLabel3.setText("Confirm Password");

        checkBoxShowPwd.setText("Show Password");
        checkBoxShowPwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxShowPwdActionPerformed(evt);
            }
        });

        btSubmit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btSubmit.setText("Submit");
        btSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(labelRegister))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(checkBoxShowPwd)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(usernameInput)
                            .addComponent(jLabel2)
                            .addComponent(pwdInput)
                            .addComponent(pwdConfirmInput)
                            .addComponent(btSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE))))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(labelRegister)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(usernameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pwdInput, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pwdConfirmInput, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(checkBoxShowPwd)
                .addGap(18, 18, 18)
                .addComponent(btSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        btCancel.setText("Cancel");
        btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCancel)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btCancel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkBoxShowPwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxShowPwdActionPerformed
      if(checkBoxShowPwd.isSelected()){
          pwdInput.setEchoChar((char)0);
          pwdConfirmInput.setEchoChar((char)0);
      }       
      else{
          pwdInput.setEchoChar(('*'));
          pwdConfirmInput.setEchoChar(('*'));
      }
    }//GEN-LAST:event_checkBoxShowPwdActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed

    }//GEN-LAST:event_jCheckBox2ActionPerformed

private void saveToTxtFile() throws IOException {
    String username = usernameInput.getText();
    String password = pwdInput.getText();
    
    // ตรวจสอบว่ามีข้อมูล username และ password หรือไม่
    if (!username.isEmpty() && !password.isEmpty()) {
        try {
            // อ่านข้อมูลจากไฟล์ txt เพื่อนำมาแสดงใน rTable
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line;
            StringBuilder fileContent = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                fileContent.append(line).append("\n");
            }
            reader.close();

            // เพิ่มข้อมูลใหม่ลงในไฟล์ txt
            FileWriter writer = new FileWriter(path); // ใช้โหมด append
            writer.write(fileContent.toString());
            writer.write(username + "," + password + "\n");
            writer.close();
            System.out.println("บันทึกข้อมูลเรียบร้อยแล้วใน data.txt");
        } catch (IOException e) {
            System.err.println("เกิดข้อผิดพลาดในการบันทึกไฟล์: " + e.getMessage());
        }
    } else {
        System.out.println("กรุณากรอกข้อมูลให้ครบทุกช่อง");
    }
}


    
    private void btSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSubmitActionPerformed
        if("".equals(usernameInput.getText()) || "".equals(pwdInput.getText()) || "".equals(pwdConfirmInput.getText())){
            JOptionPane.showMessageDialog(null,"Please enter complete information!!","Message",JOptionPane.ERROR_MESSAGE);
        }
        else if(!pwdConfirmInput.getText().equals(pwdInput.getText())){
            JOptionPane.showMessageDialog(null, "password and confirm password not match", "Message", JOptionPane.ERROR_MESSAGE);
        }
        else{
            if(pwdInput.getText().equals(pwdConfirmInput.getText())){
                try {
                    saveToTxtFile();
                    Login l1 = new Login();
                    l1.show();
                    dispose();
                } catch (IOException ex) {
                    Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btSubmitActionPerformed

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
        // TODO add your handling code here:
        Login l1 = new Login();
        l1.show();
        dispose();
    }//GEN-LAST:event_btCancelActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btSubmit;
    private javax.swing.JCheckBox checkBoxShowPwd;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelRegister;
    private javax.swing.JPasswordField pwdConfirmInput;
    private javax.swing.JPasswordField pwdInput;
    private javax.swing.JTextField usernameInput;
    // End of variables declaration//GEN-END:variables
}

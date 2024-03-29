package javabook;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
public class homePage extends javax.swing.JFrame {

    private String username;
    private String path = "PATH\\room.txt"; //room.txt
    public homePage(){
        initComponents();
        jTable1.setRowHeight(40);
    }
    public homePage(String username) {
        this.username = username;
        initComponents();
        jTable1.setRowHeight(40);
        jLabel3.setText("ผู้ใช้งาน : "+ username);
        readTableFromFile(jTable1,path);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btSubmit = new javax.swing.JButton();
        btCancel = new javax.swing.JButton();
        btLogout = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HomePage");
        setLocation(new java.awt.Point(500, 250));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Room/Time", "8.00-9.00", "9.00-10.00", "10.00-11.00", "11.00-12.00", "12.00-13.00", "13.00-14.00", "15.00-16.00", "17.00-18.00"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setMinWidth(23);
        }

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setText("ระบบจองห้อง");

        btSubmit.setText("ยืนยันการจอง");
        btSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSubmitActionPerformed(evt);
            }
        });

        btCancel.setText("ยกเลิกการจอง");
        btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelActionPerformed(evt);
            }
        });

        btLogout.setText("ออกจากระบบ");
        btLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogoutActionPerformed(evt);
            }
        });

        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 66, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 872, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btLogout)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(btSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(btCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(285, 285, 285)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(btLogout)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSubmitActionPerformed

        actionPerformed();
        loadToDatabase();
    }//GEN-LAST:event_btSubmitActionPerformed

    private void btLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogoutActionPerformed

        Login l1 = new Login();
        l1.show();
        dispose();
    }//GEN-LAST:event_btLogoutActionPerformed

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed

        cancelPerformed(username);
        loadToDatabase();
    }//GEN-LAST:event_btCancelActionPerformed

    public void loadToDatabase(){
        writeTableToFile(jTable1,path);
        readTableFromFile(jTable1,path);
         writeTableToFile(jTable1,path);
        readTableFromFile(jTable1,path);
    }
    
    public void readTableFromFile(JTable table, String filePath) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        
        // เคลียร์ข้อมูลที่มีอยู่ในตารางก่อนอ่านข้อมูลใหม่
        model.setRowCount(0);
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // แยกข้อมูลในแต่ละบรรทัดโดยใช้เครื่องหมายคอมม่าเป็นตัวแยก
                String[] rowData = line.split(",");
                // เพิ่มข้อมูลลงในตาราง
                model.addRow(rowData);
            }
            System.out.println("อ่านข้อมูลจากไฟล์เรียบร้อยแล้ว: " + filePath);
        } catch (IOException e) {
            System.err.println("เกิดข้อผิดพลาดในการอ่านไฟล์: " + e.getMessage());
        }
    }
    
    public void writeTableToFile(JTable table, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            // เขียนข้อมูลในแต่ละเซลล์ลงในไฟล์ txt
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            int rows = model.getRowCount();
            int columns = model.getColumnCount();
            for (int i = 0; i < rows; i++) { // เริ่มที่แถว 1 เพื่อข้ามหัวข้อ
                for (int j = 0; j < columns; j++) {
                    writer.write(model.getValueAt(i, j).toString());
                    if (j < columns - 1) {
                        writer.write(",");
                    }
                }
                writer.newLine();
            }
            System.out.println("บันทึกข้อมูลเรียบร้อยแล้วใน " + filePath);
        } catch (IOException e) {
            System.err.println("เกิดข้อผิดพลาดในการบันทึกไฟล์: " + e.getMessage());
        }

    }

    public void cancelPerformed(String username){
        int selectedRow = jTable1.getSelectedRow();
        int selectedCol = jTable1.getSelectedColumn();
    // Get the value of the selected cell
        String cellValue = (String) jTable1.getValueAt(selectedRow, selectedCol);

        // Find the index of ":"
        int colonIndex = cellValue.indexOf(":");
        if (colonIndex != -1 && colonIndex + 1 < cellValue.length()) {
            // Extract the word after ":"
            String wordAfterColon = cellValue.substring(colonIndex + 1).trim();

            // Check if the word after ":" matches the username
            if (username.equals(wordAfterColon)) {
                DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();

                // Set the value of the selected cell to "ว่าง"
                jTable1.setValueAt("       ว่าง  ", selectedRow, selectedCol);

                // Show confirmation message
                JOptionPane.showMessageDialog(null, "ยกเลิกสำเร็จ!", "Message", JOptionPane.INFORMATION_MESSAGE);
                writeTableToFile(jTable1,path);
            } else {
                // Show error message
                JOptionPane.showMessageDialog(null, "ยกเลิกไม่สำเร็จ", "Error", JOptionPane.ERROR_MESSAGE);
            }

            // Write the updated table to the file
            
        }
    }

    
    public void actionPerformed(){
        int selectedRow = jTable1.getSelectedRow();
        int selectedCol = jTable1.getSelectedColumn();
        String cellValue = (String) jTable1.getValueAt(selectedRow, selectedCol);

        cellValue = cellValue.trim();

            // Check if the word after ":" matches the username
            if (cellValue.equals("ว่าง")) {
                DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();

                // Set the value of the selected cell to "ว่าง"
                jTable1.setValueAt("จองแล้วโดย : " + username, selectedRow, selectedCol);

                // Show confirmation message
                JOptionPane.showMessageDialog(null, "จองสำเร็จ!", "Message", JOptionPane.INFORMATION_MESSAGE);
                writeTableToFile(jTable1,path);
            } else {
                // Show error message
                JOptionPane.showMessageDialog(null, "จองไม่สำเร็จ", "Error", JOptionPane.ERROR_MESSAGE);
            }

            // Write the updated table to the file
            
        
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btLogout;
    private javax.swing.JButton btSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}

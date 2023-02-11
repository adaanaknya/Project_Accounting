/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package accounting;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import accounting.Accounting;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author klemu
 */
public class Client_Tabel_client extends javax.swing.JFrame {
    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    /**
     * Creates new form MainMenu
     */
    public Client_Tabel_client() {
        initComponents();
        con = Accounting.connectDB();
        tampil();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tblsimpan = new javax.swing.JButton();
        tblhapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelClient = new javax.swing.JTable();
        tblubah = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        TxtId_client = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TxtNama_client = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TxtAlamat = new javax.swing.JTextField();
        TxtEmail = new javax.swing.JTextField();
        TxtNo_telepon = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(242, 242, 242));
        setMinimumSize(new java.awt.Dimension(840, 515));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jButton1.setBackground(new java.awt.Color(0, 51, 102));
        jButton1.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Data Rekening");

        jButton2.setBackground(new java.awt.Color(0, 51, 102));
        jButton2.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cetak Invoice");

        jButton3.setBackground(new java.awt.Color(0, 51, 102));
        jButton3.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Data Gudang");

        jButton4.setBackground(new java.awt.Color(0, 51, 102));
        jButton4.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Data Nama");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 51, 102));
        jButton5.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Home");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 279, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 180, 620));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tabel Client");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(198, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        tblsimpan.setBackground(new java.awt.Color(84, 180, 53));
        tblsimpan.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        tblsimpan.setForeground(new java.awt.Color(255, 255, 255));
        tblsimpan.setText("Simpan");
        tblsimpan.setBorderPainted(false);
        tblsimpan.setMaximumSize(new java.awt.Dimension(84, 25));
        tblsimpan.setMinimumSize(new java.awt.Dimension(84, 25));
        tblsimpan.setPreferredSize(new java.awt.Dimension(84, 25));
        tblsimpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblsimpanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tblsimpanMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblsimpanMousePressed(evt);
            }
        });
        tblsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblsimpanActionPerformed(evt);
            }
        });

        tblhapus.setBackground(new java.awt.Color(255, 30, 30));
        tblhapus.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        tblhapus.setForeground(new java.awt.Color(255, 255, 255));
        tblhapus.setText("Hapus ");
        tblhapus.setBorderPainted(false);
        tblhapus.setMaximumSize(new java.awt.Dimension(84, 25));
        tblhapus.setMinimumSize(new java.awt.Dimension(84, 25));
        tblhapus.setPreferredSize(new java.awt.Dimension(84, 25));
        tblhapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblhapusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tblhapusMouseExited(evt);
            }
        });
        tblhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblhapusActionPerformed(evt);
            }
        });

        TabelClient.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        TabelClient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Client", "Nama Client", "No Telepon", "Email", "Alamat"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelClient.setShowGrid(true);
        TabelClient.getTableHeader().setResizingAllowed(false);
        TabelClient.getTableHeader().setReorderingAllowed(false);
        TabelClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelClientMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelClient);

        tblubah.setBackground(new java.awt.Color(15, 98, 146));
        tblubah.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        tblubah.setForeground(new java.awt.Color(255, 255, 255));
        tblubah.setText("Ubah");
        tblubah.setBorderPainted(false);
        tblubah.setMaximumSize(new java.awt.Dimension(84, 25));
        tblubah.setMinimumSize(new java.awt.Dimension(84, 25));
        tblubah.setPreferredSize(new java.awt.Dimension(84, 25));
        tblubah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblubahMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tblubahMouseExited(evt);
            }
        });
        tblubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblubahActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel2.setText("ID Client             ");

        TxtId_client.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel4.setText("Nama Client      ");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel3.setText("No Telepon        ");

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel6.setText("Email                   ");

        TxtNama_client.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel7.setText("Alamat               ");

        TxtAlamat.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N

        TxtEmail.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N

        TxtNo_telepon.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText(":");

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText(":");

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText(":");

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText(":");

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText(":");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(48, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtId_client, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(TxtAlamat, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TxtNama_client, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TxtNo_telepon, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tblhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tblubah, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tblsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TxtId_client, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(TxtNama_client, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15))))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TxtNo_telepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(TxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(TxtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel7)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(tblsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tblhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tblubah, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 680, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tblhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblhapusActionPerformed
        try{
            String value1= TxtId_client.getText();
            
            String delete= "Delete from Client where Id_client='"+value1+"'";
              pst= con.prepareStatement(delete);
              pst.execute();
              JOptionPane.showMessageDialog(null, "Berhasil dihapus!!", "Alert", JOptionPane.INFORMATION_MESSAGE);
              
          }catch(Exception e){
              JOptionPane.showMessageDialog(null,"Data gagal dihapus" +e.getMessage());
          }
          tampil(); 
    }//GEN-LAST:event_tblhapusActionPerformed

    private void tblsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblsimpanActionPerformed
        simpan();
    }//GEN-LAST:event_tblsimpanActionPerformed

    private void tblubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblubahActionPerformed
        try{
              String value1= TxtId_client.getText();
              String value2= TxtNama_client.getText();
              String value3= TxtNo_telepon.getText();
              String value4= TxtEmail.getText();
              String value5= TxtAlamat.getText();
              
              String update= "update Client set Id_client='"+value1+"', Nama_client='"+value2+"',No_Telepon='"+value3+"',Email='"+value4+"',Alamat='"+value5+"' where Id_client='"+value1+"'";
              pst= con.prepareStatement(update);
              pst.execute();
              JOptionPane.showMessageDialog(null, "Berhasil Update!!", "Alert", JOptionPane.INFORMATION_MESSAGE);
              
          }catch(Exception e){
              JOptionPane.showMessageDialog(null,"Data gagal diedit" +e.getMessage());
          }
          tampil();
    }//GEN-LAST:event_tblubahActionPerformed

    private void TabelClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelClientMouseClicked
        DefaultTableModel model = (DefaultTableModel)TabelClient.getModel();
        int selectedRowIndex = TabelClient.getSelectedRow();

        TxtId_client.setText(model.getValueAt (selectedRowIndex, 0).toString());
        TxtNama_client.setText(model.getValueAt (selectedRowIndex, 1).toString());
        TxtNo_telepon.setText(model.getValueAt (selectedRowIndex, 2).toString());
        TxtEmail.setText(model.getValueAt (selectedRowIndex, 3).toString());
        TxtAlamat.setText(model.getValueAt (selectedRowIndex, 4).toString());
    }//GEN-LAST:event_TabelClientMouseClicked

    private void tblsimpanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblsimpanMouseEntered
        // TODO add your handling code here:
        tblsimpan.setBackground(new Color(55, 146, 55));
    }//GEN-LAST:event_tblsimpanMouseEntered

    private void tblsimpanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblsimpanMouseExited
        // TODO add your handling code here:
        tblsimpan.setBackground(new Color(84, 180, 53));
    }//GEN-LAST:event_tblsimpanMouseExited

    private void tblsimpanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblsimpanMousePressed
        // TODO add your handling code here:
        tblsimpan.setBackground(new Color(55, 146, 55));
    }//GEN-LAST:event_tblsimpanMousePressed

    private void tblhapusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblhapusMouseEntered
        // TODO add your handling code here:255, 30, 30
        tblhapus.setBackground(new Color(172, 20, 20));
    }//GEN-LAST:event_tblhapusMouseEntered

    private void tblhapusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblhapusMouseExited
        // TODO add your handling code here:
        tblhapus.setBackground(new Color(255, 30, 30));
    }//GEN-LAST:event_tblhapusMouseExited

    private void tblubahMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblubahMouseEntered
        // TODO add your handling code here:
        tblubah.setBackground(new Color( 0, 2, 161));
    }//GEN-LAST:event_tblubahMouseEntered

    private void tblubahMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblubahMouseExited
        // TODO add your handling code here:
        tblubah.setBackground(new Color( 15, 98, 146));
    }//GEN-LAST:event_tblubahMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Client_Tabel_client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Client_Tabel_client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Client_Tabel_client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Client_Tabel_client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Client_Tabel_client().setVisible(true);
            }
        });
    }
public void tampil(){

     DefaultTableModel tb = new DefaultTableModel();

        tb.addColumn("Id");
        tb.addColumn("Nama Client");
        tb.addColumn("No Telepon");
        tb.addColumn("Email");
        tb.addColumn("Alamat");
        TabelClient.setModel(tb);


        try{
            String insert = ("Select * from Client");
            pst = con.prepareStatement(insert);
            rs = pst.executeQuery();

            while(rs.next()){
                tb.addRow(new Object[]{
                rs.getString("Id_client"),
                rs.getString("Nama_client"),
                rs.getString("No_Telepon"),
                rs.getString("Email"),
                rs.getString("Alamat")

                });
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Data gagal tampil" +e.getMessage());
        }
    }

    public void simpan(){
        try{
           String insert = "INSERT INTO Client (Nama_client,No_Telepon,Email,Alamat) VALUES (?,?,?,?)";
           
           pst = con.prepareStatement(insert);
           
           pst.setString(1, TxtNama_client.getText());
           pst.setString(2, TxtNo_telepon.getText());
           pst.setString(3, TxtEmail.getText());
           pst.setString(4, TxtAlamat.getText());
           pst.execute();
           
           JOptionPane.showMessageDialog(null, "Berhasil Simpan!!", "Alert", JOptionPane.INFORMATION_MESSAGE);
           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        tampil();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelClient;
    private javax.swing.JTextField TxtAlamat;
    private javax.swing.JTextField TxtEmail;
    private javax.swing.JTextField TxtId_client;
    private javax.swing.JTextField TxtNama_client;
    private javax.swing.JTextField TxtNo_telepon;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton tblhapus;
    private javax.swing.JButton tblsimpan;
    private javax.swing.JButton tblubah;
    // End of variables declaration//GEN-END:variables
}

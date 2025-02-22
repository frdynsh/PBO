package Demonstrasi;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author FERDI YANSAH
 */
public class Pesanan extends javax.swing.JFrame {
    private int userId;
    /**
     * Creates new form UserMenu
     */
    public Pesanan(int userId) {
        this.userId = userId;
        initComponents();     
        loadPesananData();
    }   
    private void loadPesananData() {
    DefaultTableModel model = new DefaultTableModel(
            new String[]{
                    "ID Pesanan", "ID Seller", "ID Driver",
                    "Total T-shirt", "Total Shirt", "Total Pants",
                    "Total Cost", "Status Pesanan"
            }, 0
    );

    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    try {
        // Mengambil koneksi dari dbConnection
        conn = dbConnection.getConnection();
        
        // Menyiapkan SQL query untuk mengambil data pesanan
        String sql = "SELECT idPesanan, idSeller, idDriver, totalTshirt, totalShirt, totalPants, totalCost, statusPesanan " +
                     "FROM pesanan WHERE idCustomer = ?";
        pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, userId);
        
        // Menjalankan query
        rs = pstmt.executeQuery();

        boolean hasData = false;
        while (rs.next()) {
            hasData = true;
            Object[] row = {
                    rs.getString("idPesanan"),
                    rs.getString("idSeller"),
                    rs.getString("idDriver"),
                    rs.getInt("totalTshirt"),
                    rs.getInt("totalShirt"),
                    rs.getInt("totalPants"),
                    rs.getDouble("totalCost"),
                    rs.getString("statusPesanan")
            };
            model.addRow(row);
        }

        if (!hasData) {
            JOptionPane.showMessageDialog(this, "Tidak ada pesanan ditemukan untuk pengguna ini.");
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Gagal memuat data pesanan: " + e.getMessage());
    } finally {
        // Menutup koneksi dan sumber daya lainnya
        try {
            if (rs != null) {
                rs.close();
            }
            if (pstmt != null) {
                pstmt.close();
            }           
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Gagal menutup koneksi: " + e.getMessage());
        }
    }

    // Menetapkan model tabel dengan data yang sudah dimuat
    jTable1.setModel(model);
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bayarBT = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        inputUangTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        jTable1.setBackground(new java.awt.Color(153, 153, 0));
        jTable1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTable1.setFont(new java.awt.Font("Segoe UI Semibold", 2, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Pesanan", "ID Seller", "ID Driver", "Total T-Shirt", "Total Shirt", "Total Pants", "Total Cost", "Status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        jLabel2.setText("GO DRY");

        jLabel4.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        jLabel4.setText("PESANAN");

        bayarBT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bayarBT.setText("Bayar");
        bayarBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bayarBTActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Masukkan Uang");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(67, 67, 67))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputUangTF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bayarBT)))
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bayarBT)
                    .addComponent(jLabel1)
                    .addComponent(inputUangTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bayarBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bayarBTActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih pesanan yang ingin dibayar.");
            return;
        }

        String idPesanan = jTable1.getValueAt(selectedRow, 0).toString();
        double totalCost = Double.parseDouble(jTable1.getValueAt(selectedRow, 6).toString());

        String inputUang = inputUangTF.getText();
        if (inputUang.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Masukkan jumlah uang untuk membayar.");
            return;
        }

        double uangMasuk;
        try {
            uangMasuk = Double.parseDouble(inputUang);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Input uang tidak valid.");
            return;
        }

        if (uangMasuk < totalCost) {
            JOptionPane.showMessageDialog(this, "Uang yang dimasukkan tidak mencukupi.");
            return;
        }

        double kembalian = uangMasuk - totalCost;
        
        // Tampilkan struk pembayaran tanpa mengubah status pesanan
        JOptionPane.showMessageDialog(this,
                    "Struk Pembayaran:\n" +
                    "=====================================\n" +        
                    "ID Pesanan: " + idPesanan + "\n" +
                    "ID Customer: " + userId + "\n" +
                    "Total T-shirt: " + jTable1.getValueAt(selectedRow, 3) + "\n" +
                    "Total Shirt: " + jTable1.getValueAt(selectedRow, 4) + "\n" +
                    "Total Pants: " + jTable1.getValueAt(selectedRow, 5) + "\n" +
                    "=====================================\n" +        
                    "Total Cost: " + totalCost + "\n" +
                    "=====================================\n" +        
                    "Uang Masuk: " + uangMasuk + "\n" +
                    "Kembalian: " + kembalian
        );       
        JOptionPane.showMessageDialog(this, "Pembayaran berhasil.");   
        this.dispose(); 
        new SignIn().setVisible(true);
    }//GEN-LAST:event_bayarBTActionPerformed

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
            java.util.logging.Logger.getLogger(Pesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pesanan(1001).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bayarBT;
    private javax.swing.JTextField inputUangTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}

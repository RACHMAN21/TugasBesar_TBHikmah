/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasBesar_View;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 * @author 
 *  Nama    : Diva Sabila Ramadhan (10119039)
 *          : Rachman Aldiansyah (10119038)
 *          : Reihan Wiyanda (10119011)
 * 
 * Kelas    : IF-1
 */

public class ViewDaftarKaryawan extends javax.swing.JFrame {

    /**
     * Creates new form ViewDaftarKaryawan
     */
    DefaultTableModel tabel = new DefaultTableModel();
    public ViewDaftarKaryawan() {
        initComponents();
        
        TabelKaryawan.setModel(tabel);
        tabel.addColumn("NIP");
        tabel.addColumn("Nama Karyawan");
        tabel.addColumn("Posisi");
        tabel.addColumn("Jenis Kelamin");
        tabel.addColumn("Telepon");
        tabel.addColumn("Alamat");
        
        tampilData();
    }
    
    private void tampilData() {
        //untuk mengahapus baris setelah input
        int row = tabel.getRowCount();
        for(int a = 0 ; a < row ; a++){
            tabel.removeRow(0);
        }
        
        String query = "SELECT * FROM `tbkaryawan`";
        
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/dblogin","root","");//memanggil koneksi
            Statement sttmnt = cn.createStatement();//membuat statement
            ResultSet rslt = sttmnt.executeQuery(query);//menjalanakn query
            
            while (rslt.next()){
                //menampung data sementara
                   
                    String nip = rslt.getString("nip");
                    String nama_karyawan = rslt.getString("nama_karyawan");
                    String posisi = rslt.getString("posisi");
                    String jenis_kelamin = rslt.getString("jenis_kelamin");
                    String no_telepon = rslt.getString("no_telepon");
                    String Alamat = rslt.getString("Alamat");
                    
                //masukan semua data kedalam array
                String[] data = {nip, nama_karyawan, posisi,  jenis_kelamin, no_telepon, Alamat};
                //menambahakan baris sesuai dengan data yang tersimpan diarray
                tabel.addRow(data);
            }
                //mengeset nilai yang ditampung agar muncul di table
                TabelKaryawan.setModel(tabel);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ada kesalahan di database");
        }
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bodyPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNip = new javax.swing.JTextField();
        txtNamaKaryawan = new javax.swing.JTextField();
        cbPosisi = new javax.swing.JComboBox<>();
        cbJenis = new javax.swing.JComboBox<>();
        txtNoTelepon = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taAlamat = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelKaryawan = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Daftar_Karyawan");
        setResizable(false);

        bodyPanel.setBackground(new java.awt.Color(34, 47, 62));

        jButton1.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jButton5.setText("BACK");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NIP :");

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nama Karyawan :");

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Alamat :");

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Posisi :");

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Jenis Kelamin :");

        jLabel6.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Telepon :");

        txtNip.setBackground(new java.awt.Color(52, 73, 94));
        txtNip.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        txtNip.setForeground(new java.awt.Color(255, 255, 255));

        txtNamaKaryawan.setBackground(new java.awt.Color(52, 73, 94));
        txtNamaKaryawan.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        txtNamaKaryawan.setForeground(new java.awt.Color(255, 255, 255));

        cbPosisi.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        cbPosisi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kasir", "Gudang", "Supir" }));
        cbPosisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPosisiActionPerformed(evt);
            }
        });

        cbJenis.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        cbJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-Laki", "Perempuan" }));
        cbJenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbJenisActionPerformed(evt);
            }
        });

        txtNoTelepon.setBackground(new java.awt.Color(52, 73, 94));
        txtNoTelepon.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        txtNoTelepon.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("DAFTAR KARYAWAN");

        taAlamat.setColumns(20);
        taAlamat.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        taAlamat.setRows(5);
        jScrollPane1.setViewportView(taAlamat);

        TabelKaryawan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TabelKaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelKaryawanMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TabelKaryawan);

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPanelLayout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPanelLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(bodyPanelLayout.createSequentialGroup()
                            .addGap(107, 107, 107)
                            .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addGap(30, 30, 30)
                            .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNip, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cbPosisi, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbJenis, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtNoTelepon, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNamaKaryawan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel7)
                            .addGap(86, 86, 86)))
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNamaKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPosisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(15, 15, 15)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbJenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNoTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String posisi = cbPosisi.getSelectedItem().toString();
        String jenis_kelamin = cbJenis.getSelectedItem().toString();
        //Validasi Posisi
        
//        if (cbPosisi.getSelectedItem().equals("Kasir")) {
//            posisi = "Kasir";
//        } else if (cbPosisi.getSelectedItem().equals("Gudang")) {
//            posisi = "Gudang";
//        } else if (cbPosisi.getSelectedItem().equals("Supir")) {
//            posisi = "Supir";
//        }
//        
//        //Validasi Jenis Kelamin
//        if (cbJenis.getSelectedItem().equals("Laki-Laki")) {
//            jenis_kelamin = "Laki-Laki";
//        } else if (cbJenis.getSelectedItem().equals("Perempuan")) {
//            jenis_kelamin = "Perempuan";
//        }
        //Validasi apabila ada data yang kosong
        if (txtNip.getText().equals("")) {
            if (txtNamaKaryawan.getText().equals("")) {
                if (taAlamat.getText().equals("")) {
                    if (txtNoTelepon.getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "Semua data harus diisi");
                    }
                }
            } 
        } else
        //Menambahkan Data
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/dblogin","root","");
            cn.createStatement().execute("insert into tbkaryawan values" + "('"+txtNip.getText()+"','"+txtNamaKaryawan.getText()+"','"+posisi+"','"+jenis_kelamin+"','"+txtNoTelepon.getText()+"','"+taAlamat.getText()+"' )");
            JOptionPane.showMessageDialog(null, "Data Karyawan berhasil ditambahkan");
            tampilData();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data gagal ditambahkan");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        txtNip.setText("");
        txtNamaKaryawan.setText("");
        txtNoTelepon.setText("");
        taAlamat.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cbJenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbJenisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbJenisActionPerformed

    private void cbPosisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPosisiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPosisiActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int i = TabelKaryawan.getSelectedRow();
        String nip = tabel.getValueAt(i, 0).toString();
        String sql = "DELETE FROM `tbkaryawan` WHERE `tbkaryawan`.`nip` = '" + nip +"' ";
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/dblogin","root","");
            PreparedStatement ps = (PreparedStatement) cn.prepareStatement(sql);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus!");
        }catch(SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null, "Data Gagal Dihapus!");
        }finally {
            tampilData();
    }                                         
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        MenuView back = new MenuView ();
        back.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void TabelKaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelKaryawanMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_TabelKaryawanMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        tampilData();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewDaftarKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewDaftarKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewDaftarKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewDaftarKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewDaftarKaryawan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelKaryawan;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JComboBox<String> cbJenis;
    private javax.swing.JComboBox<String> cbPosisi;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea taAlamat;
    private javax.swing.JTextField txtNamaKaryawan;
    private javax.swing.JTextField txtNip;
    private javax.swing.JTextField txtNoTelepon;
    // End of variables declaration//GEN-END:variables
}
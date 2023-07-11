/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pages;

import DataBases.ExperimentDB;
import DataBases.MaterialDB;
import Classes.Experiment;
import Classes.Material;
import Classes.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author omeryasironal
 */

/*
Deneylerin oluşturulduğu ekran.
 */
public class ExperimentCreatingPage extends javax.swing.JFrame {

    DefaultTableModel tbl_table_materials = new DefaultTableModel();
    DefaultTableModel tbl_table_added_materials = new DefaultTableModel();

    ExperimentsPage ep;
    StartPage sp;
    User u;

    public ExperimentCreatingPage(ExperimentsPage ep, User u, StartPage sp) {
        this.ep = ep;
        this.sp = sp;
        initComponents();
        this.u = u;
        tbl_table_materials.addColumn("Malzeme");
        tbl_table_materials.addColumn("Stok");
        tbl_table_added_materials.addColumn("Malzeme");
        tbl_table_added_materials.addColumn("adet");
        fillTable();
        this.setLocation(300, 400);

    }

    public ExperimentCreatingPage(ExperimentsPage ep, User u) {
        this.ep = ep;
        initComponents();
        this.u = u;
        tbl_table_materials.addColumn("Malzeme");
        tbl_table_materials.addColumn("Stok");
        tbl_table_added_materials.addColumn("Malzeme");
        tbl_table_added_materials.addColumn("adet");
        fillTable();
        this.setLocation(300, 400);
    }

    // Malzemeler tablosunun doldurulmasını sağlar
    private void fillTable() {
        ArrayList<Material> materials = MaterialDB.getMaterials();
        tbl_table_materials.setRowCount(0);

        for (Material material : materials) {
            // Material ismi ve stok durumunu sırasıyla ekliyoruz
            tbl_table_materials.addRow(new Object[]{material.getMaterialName(), material.getStockStatus()});
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        jPanel1 = new javax.swing.JPanel();
        txt_name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_create = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        yearComboBox = new javax.swing.JComboBox<>();
        btn_add = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMaterials = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblSelectedMaterials = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(550, 396));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Deney Oluşturma Ekranı", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 3, 12))); // NOI18N
        jPanel1.setMinimumSize(new java.awt.Dimension(583, 406));
        jPanel1.setPreferredSize(new java.awt.Dimension(583, 406));
        jPanel1.setSize(new java.awt.Dimension(583, 406));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 120, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Deneyde Kullanılacak Malzemeleri Seçin");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        jLabel3.setText("Deney Yapılış Tarihi:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 120, -1));

        jLabel2.setText("Deney Adı:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        btn_create.setText("Oluştur");
        btn_create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_createActionPerformed(evt);
            }
        });
        jPanel1.add(btn_create, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 130, 40));

        btnBack.setText("Geri");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 90, 20));

        yearComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023" }));
        jPanel1.add(yearComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 120, 30));

        btn_add.setText("Ekle");
        btn_add.setToolTipText("");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        jPanel1.add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, -1, -1));

        btn_delete.setText("Sil");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        jPanel1.add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, -1, -1));

        tblMaterials.setModel(tbl_table_materials);
        jScrollPane2.setViewportView(tblMaterials);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 190, 140));

        tblSelectedMaterials.setModel(tbl_table_added_materials);
        jScrollPane4.setViewportView(tblSelectedMaterials);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 200, 140));

        getContentPane().add(jPanel1);

        pack();
    }//GEN-END:initComponents

    // Deneyi oluşturur ve MySQL'de belirtilen tabloya kaydeder.
    private void btn_createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_createActionPerformed
        String experimentName = txt_name.getText();
        String selectedItem = (String) yearComboBox.getSelectedItem();
        int date = Integer.parseInt(selectedItem);

        // Tablodan seçili malzemeleri al
        HashMap<Material, Integer> materialCountMap = new HashMap<>();
        for (int i = 0; i < tblSelectedMaterials.getRowCount(); i++) {
            String materialName = (String) tblSelectedMaterials.getValueAt(i, 0);
            int count = (Integer) tblSelectedMaterials.getValueAt(i, 1);
            Material m = MaterialDB.getMaterialByName(materialName);
            if (m != null) {
                materialCountMap.put(m, count);
            }
        }

        // Stoktaki her malzemenin miktarını günceller
        for (int i = 0; i < tblMaterials.getRowCount(); i++) {
            String materialName = (String) tblMaterials.getValueAt(i, 0);
            int stock = (int) tblMaterials.getValueAt(i, 1);

            Material material = MaterialDB.getMaterialByName(materialName);
            MaterialDB.setMaterialStock(material, stock);
        }

        Experiment newExperiment = new Experiment(experimentName, date);

        // Yeni Experiment'ı veritabanına ekler ve geri dönen id'yi alır
        int experimentId = ExperimentDB.addExperiment(newExperiment);
        if (experimentId != -1) {

            boolean areMaterialsAdded = true;

            for (Map.Entry<Material, Integer> entry : materialCountMap.entrySet()) {
                Material material = entry.getKey();
                int count = entry.getValue();

                if (!ExperimentDB.addMaterialToExperiment(experimentId, material, count)) {
                    areMaterialsAdded = false;
                    break;
                }
            }

            if (areMaterialsAdded) {

                JOptionPane.showMessageDialog(this, "Deney ve Malzemeler Eklendi", "Bilgi", JOptionPane.INFORMATION_MESSAGE);
                ExperimentsPage ep = new ExperimentsPage(this.u, this.sp);
                ep.setVisible(true);
                dispose();

            } else {
                JOptionPane.showMessageDialog(this, "Deney Eklendi ama Malzemeler Eklenemedi", "Uyarı!", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Deney Eklenemedi", "Uyarı!", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btn_createActionPerformed

    // ExperimentsPage sayfasına gider
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        ExperimentsPage ep = new ExperimentsPage(this.u, this.sp);
        ep.setVisible(true);
        dispose();

    }//GEN-LAST:event_btnBackActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed

        int selectedRow = tblSelectedMaterials.getSelectedRow();

        if (selectedRow != -1) {
            String materialName = (String) tblSelectedMaterials.getValueAt(selectedRow, 0);
            int quantity = (int) tblSelectedMaterials.getValueAt(selectedRow, 1);

            // Kullanılan malzemeler listesindeki miktarı azaltır
            if (quantity > 1) {
                tblSelectedMaterials.setValueAt(quantity - 1, selectedRow, 1);
            } else {

                // Eğer miktarı 1 ise, malzemeyi listeden çıkartır
                tbl_table_added_materials.removeRow(selectedRow);
            }

            // Stok tablosundaki malzemenin miktarını artırır
            for (int i = 0; i < tblMaterials.getRowCount(); i++) {
                if (tblMaterials.getValueAt(i, 0).equals(materialName)) {
                    int stock = (int) tblMaterials.getValueAt(i, 1);
                    tblMaterials.setValueAt(stock + 1, i, 1);
                    break;
                }
            }

            // Veritabanındaki stok miktarını günceller
            Material selectedMaterial = MaterialDB.getMaterialByName(materialName);
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed

        int selectedRow = tblMaterials.getSelectedRow();

        if (selectedRow != -1) {

            String materialName = (String) tblMaterials.getValueAt(selectedRow, 0);
            int stock = (int) tblMaterials.getValueAt(selectedRow, 1);

            // Stokta malzeme varsa işlemleri gerçekleştirir
            if (stock > 0) {
                // Malzeme zaten kullanılanlar listesinde mi diye kontrol eder
                boolean isMaterialInUsedList = false;

                for (int i = 0; i < tblSelectedMaterials.getRowCount(); i++) {
                    if (tblSelectedMaterials.getValueAt(i, 0).equals(materialName)) {
                        int quantity = (int) tblSelectedMaterials.getValueAt(i, 1);
                        tblSelectedMaterials.setValueAt(quantity + 1, i, 1);
                        isMaterialInUsedList = true;
                        break;
                    }
                }

                // Eğer malzeme kullanılanlar listesinde yoksa, yeni bir satır olarak ekler
                if (!isMaterialInUsedList) {
                    tbl_table_added_materials.addRow(new Object[]{materialName, 1});
                }

                // Stok miktarını azaltır
                tblMaterials.setValueAt(stock - 1, selectedRow, 1);

                // Veritabanındaki stok miktarını günceller
                Material selectedMaterial = MaterialDB.getMaterialByName(materialName);

            } else {
                JOptionPane.showMessageDialog(this, "Stokta yeterli malzeme yok.", "Bilgi", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_addActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_create;
    private javax.swing.JButton btn_delete;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tblMaterials;
    private javax.swing.JTable tblSelectedMaterials;
    private javax.swing.JTextField txt_name;
    private javax.swing.JComboBox<String> yearComboBox;
    // End of variables declaration//GEN-END:variables
}

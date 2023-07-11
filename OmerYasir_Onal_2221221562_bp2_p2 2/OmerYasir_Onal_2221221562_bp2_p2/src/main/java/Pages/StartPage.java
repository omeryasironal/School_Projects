/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pages;

import Classes.User;
import java.awt.Color;
import java.awt.event.ItemEvent;

/**
 *
 * @author omeryasironal
 */
public class StartPage extends javax.swing.JFrame {

    User user;

    public StartPage() {
        initComponents();
    }

    public StartPage(User user) {
        initComponents();
        this.user = user;
        this.setLocation(300, 400);
        
        if (user.getType().equals("öğretmen")) {
            btn_experiment.setEnabled(true);
        } else {
            btn_experiment.setEnabled(false);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        btn_experiment = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_logout = new javax.swing.JButton();
        btn_material = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        btn_menu = new javax.swing.JMenu();
        item_logout = new javax.swing.JMenuItem();
        check_theme = new javax.swing.JCheckBoxMenuItem();
        menu_close = new javax.swing.JMenu();

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(506, 488));
        setPreferredSize(new java.awt.Dimension(506, 488));
        setSize(new java.awt.Dimension(506, 488));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_experiment.setText("Deneyleri Yönet");
        btn_experiment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_experimentActionPerformed(evt);
            }
        });
        jPanel1.add(btn_experiment, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 192, 432, 110));

        jLabel1.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        jLabel1.setText("Deney Malzemeleri Takip Sistemi");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        btn_logout.setText("Çıkış Yap");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        jPanel1.add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 320, 432, 110));

        btn_material.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        btn_material.setText("Malzemeleri Yönet");
        btn_material.setMaximumSize(new java.awt.Dimension(160, 160));
        btn_material.setMinimumSize(new java.awt.Dimension(160, 160));
        btn_material.setPreferredSize(new java.awt.Dimension(160, 160));
        btn_material.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_materialActionPerformed(evt);
            }
        });
        jPanel1.add(btn_material, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 77, 432, 97));

        getContentPane().add(jPanel1);

        btn_menu.setText("Menü");

        item_logout.setText("Çıkış Yap");
        item_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_logoutActionPerformed(evt);
            }
        });
        btn_menu.add(item_logout);

        check_theme.setText("Siyah Tema");
        check_theme.setToolTipText("");
        check_theme.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                check_themeItemStateChanged(evt);
            }
        });
        btn_menu.add(check_theme);

        jMenuBar1.add(btn_menu);

        menu_close.setText("Kapat");
        menu_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_closeMouseClicked(evt);
            }
        });
        jMenuBar1.add(menu_close);

        setJMenuBar(jMenuBar1);

        pack();
    }//GEN-END:initComponents

    
    // Malzemeler sayfasına yönlendirir
    private void btn_materialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_materialActionPerformed

        MaterialsPage mp = new MaterialsPage(this, user);
        mp.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btn_materialActionPerformed

    // Deneyler sayfasına yönlendirir
    private void btn_experimentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_experimentActionPerformed

        ExperimentsPage ep = new ExperimentsPage(user, this);
        ep.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btn_experimentActionPerformed

    // Hesaptan çıkış yapmanızı sağlar ve giriş ekranına döndürür
    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        LoginPage lp = new LoginPage();
        lp.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_logoutActionPerformed

    //  Menüyü kullanarak da çıkış yapmanızı sağlamaktadır
    private void item_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_logoutActionPerformed
        btn_logoutActionPerformed(evt);
        
    }//GEN-LAST:event_item_logoutActionPerformed

    // Tema'yı değiştirir ve sadece ana ekranda çalışır
    private void check_themeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_check_themeItemStateChanged
        if (evt.getStateChange() == ItemEvent.DESELECTED) {
            jPanel1.setBackground(new Color(242, 242, 242));
            jLabel1.setForeground(Color.BLACK);

        } else {
            jPanel1.setBackground(Color.DARK_GRAY);
            jLabel1.setForeground(Color.LIGHT_GRAY);

        }
    }//GEN-LAST:event_check_themeItemStateChanged

    // Uygulamayı tamamen kapatır
    private void menu_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_closeMouseClicked
           System.exit(0);

    }//GEN-LAST:event_menu_closeMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_experiment;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_material;
    private javax.swing.JMenu btn_menu;
    private javax.swing.JCheckBoxMenuItem check_theme;
    private javax.swing.JMenuItem item_logout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menu_close;
    // End of variables declaration//GEN-END:variables
}

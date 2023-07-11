/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package authPages;

import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author omeryasironal
 */
public class ÖmerYasirÖnal_SingupPage extends javax.swing.JFrame {

    private String name;
    private String mail;
    private String pass;

    public ÖmerYasirÖnal_SingupPage() {
        initComponents();
        setPreferredSize(new java.awt.Dimension(600, 500));
        setLocation(new java.awt.Point(400, 50));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtSifre = new javax.swing.JPasswordField();
        btnKayıtOl = new javax.swing.JButton();
        txtMail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(500, 500));
        setMinimumSize(new java.awt.Dimension(300, 301));
        setPreferredSize(new java.awt.Dimension(300, 301));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Kayıt Ekranı"));
        jPanel1.setMaximumSize(new java.awt.Dimension(32767, 3276));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Kullanıcı Adı:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel3.setText("Mail:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel4.setText("Şifre:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        txtUserName.setMinimumSize(new java.awt.Dimension(100, 23));
        txtUserName.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel1.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        txtSifre.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel1.add(txtSifre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));

        btnKayıtOl.setBackground(new java.awt.Color(102, 255, 0));
        btnKayıtOl.setText("Kayıt Ol");
        btnKayıtOl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKayıtOlActionPerformed(evt);
            }
        });
        jPanel1.add(btnKayıtOl, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 100, 40));
        jPanel1.add(txtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 100, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 300));

        pack();
    }//GEN-END:initComponents

    /**
     * Bu method, kullanıcıdan alınan email, kullanıcı adı ve şifre değerlinin
     * geçerli olup olmadığını kontrol eder. Geçersiz değerlere özel uyarılar
     * gösterir. Eğer değerler geçerli ise kullanıcın bilgilerini "FileWriter"
     * ile 'users.txt' dosyasına kayıt eder ve kayıt penceresini kapatır.
     */
    private void btnKayıtOlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKayıtOlActionPerformed
        String mail = txtMail.getText().trim();
        String username = txtUserName.getText().trim();
        String password = new String(txtSifre.getPassword()).trim();

        if (mail.isEmpty() || username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lütfen tüm alanları doldurunuz!", "Hata", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (!validateUserName(username)) {
            JOptionPane.showMessageDialog(null, "Lütfen geçerli bir kullanıcı adı giriniz!", "Hata", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!validateEmail(mail)) {
            JOptionPane.showMessageDialog(null, "Lütfen geçerli bir mail adresi giriniz!", "Hata", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (isEmailExists(mail)) {
            JOptionPane.showMessageDialog(null, "Lütfen farklı bir mail adresi giriniz!", "Hata", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!validatePassword(password)) {
            JOptionPane.showMessageDialog(null, "Şifreniz, En az bir rakam, en az bir küçük harf, en az bir büyük harf ve şifre uzunluğu en az 6 karakterden oluşmalı!", "Geçersiz Şifre", JOptionPane.ERROR_MESSAGE);

            return;
        }

        try {
            FileWriter fileWriter = new FileWriter("users.txt", true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(mail + "," + username + "," + password);
            printWriter.close();
            JOptionPane.showMessageDialog(null, "Kayıt başarıyla tamamlandı!", "Başarılı", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnKayıtOlActionPerformed

    // Kullanıcın girmiş olduğu emailin daha önce kullanılıp kullanılmadığını kontrol eder
    private boolean isEmailExists(String mail) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("users.txt"));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] user = line.split(",");
                if (user[0].equals(mail)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    // Kullanıcın girmiş olduğu kullanıcı adının geçerli olup olmadığını kontrol eder ve karşılaştırır
    private boolean validateUserName(String userName) {
        String userNameRegex = "^[A-Za-z]\\w{4,29}$";

        Pattern userNamePattern = Pattern.compile(userNameRegex);
        Matcher userNameMatcher = userNamePattern.matcher(userName);

        return userNameMatcher.matches();
    }

    // Kullanıcın girmiş olduğu emailin geçerli olup olmadığını kontrol eder ve karşılaştırır
    private boolean validateEmail(String mail) {
        String emailRegex = "^(.+)@(.+)$";

        Pattern emailPattern = Pattern.compile(emailRegex);
        Matcher emailMatcher = emailPattern.matcher(mail);

        return emailMatcher.matches();
    }

    // Kullanıcın girmiş olduğu şifrenin geçerli olup olmadığını kontrol eder ve karşılaştırır
    private boolean validatePassword(String password) {
        String passwordRegex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{6,}$";

        Pattern passwordPattern = Pattern.compile(passwordRegex);
        Matcher passwordMatcher = passwordPattern.matcher(password);

        return passwordMatcher.matches();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKayıtOl;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtMail;
    private javax.swing.JPasswordField txtSifre;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}

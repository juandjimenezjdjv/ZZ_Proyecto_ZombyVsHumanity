/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.zz_proyecto1;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Jimenez
 */
public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    public Admin() {
        cargaImagen("admin.jpg");
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCuenta = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        txfCuenta = new javax.swing.JTextField();
        lblAdmin = new javax.swing.JLabel();
        lblContrasena = new javax.swing.JLabel();
        pwfContrasena = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Usuario");
        setMaximumSize(new java.awt.Dimension(200, 200));
        setPreferredSize(new java.awt.Dimension(400, 400));
        getContentPane().setLayout(null);

        lblCuenta.setFont(new java.awt.Font("Chiller", 3, 24)); // NOI18N
        lblCuenta.setForeground(new java.awt.Color(153, 204, 255));
        lblCuenta.setText("Igrese La Cuenta");
        getContentPane().add(lblCuenta);
        lblCuenta.setBounds(120, 30, 150, 30);

        btnIngresar.setText("Ingresar");
        btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIngresarMouseClicked(evt);
            }
        });
        getContentPane().add(btnIngresar);
        btnIngresar.setBounds(150, 230, 90, 23);

        txfCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfCuentaActionPerformed(evt);
            }
        });
        getContentPane().add(txfCuenta);
        txfCuenta.setBounds(110, 110, 170, 30);

        lblAdmin.setFont(new java.awt.Font("Chiller", 1, 18)); // NOI18N
        lblAdmin.setForeground(new java.awt.Color(204, 255, 255));
        lblAdmin.setText("Cuenta");
        getContentPane().add(lblAdmin);
        lblAdmin.setBounds(110, 88, 90, 22);

        lblContrasena.setFont(new java.awt.Font("Chiller", 1, 18)); // NOI18N
        lblContrasena.setForeground(new java.awt.Color(204, 255, 255));
        lblContrasena.setText("Contraseña");
        getContentPane().add(lblContrasena);
        lblContrasena.setBounds(110, 150, 100, 20);
        getContentPane().add(pwfContrasena);
        pwfContrasena.setBounds(110, 170, 170, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txfCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfCuentaActionPerformed

    private void btnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseClicked
        char[] inputPassword = pwfContrasena.getPassword();
        String inputPasswordString = new String(inputPassword);
        if (txfCuenta.getText().equals("admin") && inputPasswordString.equals("admin")){//Si no tiene nada seleccionado, ponga un mensaje de error
            Ventana frame = new Ventana();
            frame.setVisible(true);   
            this.dispose();
        }else{
            pwfContrasena.setText("");
            txfCuenta.setText("");
            JOptionPane.showMessageDialog(null, "Por favor, llene correctamente", "Abrir Juego", JOptionPane.WARNING_MESSAGE);
            }
    }//GEN-LAST:event_btnIngresarMouseClicked

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JLabel lblContrasena;
    private javax.swing.JLabel lblCuenta;
    private javax.swing.JPasswordField pwfContrasena;
    private javax.swing.JTextField txfCuenta;
    // End of variables declaration//GEN-END:variables
public void cargaImagen(String imagen){
//        if ("menu.jpg".equals(imagen))
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        try{
            BufferedImage backgroundImage = ImageIO.read(new File("src/main/java/images/"+imagen));
            A_imagen backgroundPanel = new A_imagen(backgroundImage);
            setContentPane(backgroundPanel);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
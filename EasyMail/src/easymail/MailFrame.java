/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easymail;

import java.awt.Color;
import java.io.File;
import static java.util.Locale.filter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MailFrame extends javax.swing.JFrame {
    //(user, String password, String path, String filename, String to, String message)
    private String user;
    private String password;
    private String path = "";
    private String filename = "";
    private String to;
    private String message;
    private String subject;
    public MailFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground( Color.white );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblFile = new javax.swing.JLabel();
        txtMail = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtTo = new javax.swing.JTextField();
        txtSubject = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMessage = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("App para pedidos de Gerardo Calvo Murillo");
        setBackground(new java.awt.Color(204, 204, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(572, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Mensaje");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 110, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Correo del Emisor");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 190, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Contraseña");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 110, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Asunto");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 110, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Correo del Receptor");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 190, -1));

        lblFile.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblFile.setText("Archivo");
        getContentPane().add(lblFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 210, -1));

        txtMail.setText("ivanfelipecp@gmail.com");
        getContentPane().add(txtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 200, -1));

        txtPassword.setText("futbol123");
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 200, -1));

        txtTo.setText("ivan_fcp@hotmail.com");
        getContentPane().add(txtTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 200, -1));

        txtSubject.setText("Pruebaa");
        getContentPane().add(txtSubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 200, -1));

        txtMessage.setColumns(20);
        txtMessage.setRows(5);
        txtMessage.setText("dadadada\n");
        jScrollPane1.setViewportView(txtMessage);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 460, -1));

        jButton1.setText("Enviar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 503, -1, 40));

        jButton2.setText("Examinar...");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 100, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tridentlog.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 160, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cadburylogo.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 480, 230, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFileChooser fc = new JFileChooser(new File("C:\\Users\\Ivan\\Desktop"));
        //The created object we are going to call the method setfilefilter
        //We will open the dialog window to choose the images
        int option = fc.showOpenDialog(this);
        //If we click on the open button
        if (option==JFileChooser.APPROVE_OPTION){
            //We get the name of the file that we have selected
            this.path = fc.getSelectedFile().getPath();
            String[] array = this.path.split("\\\\");
            this.filename = array[array.length - 1];
            this.lblFile.setText(this.filename);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.user = this.txtMail.getText();
        this.password = "okxqjwjlnrqdljoa";
        this.to = this.txtTo.getText();
        this.message = this.txtMessage.getText();
        this.subject = this.txtSubject.getText();
        
        if(this.user.equals("") || this.password.equals("") || this.to.equals("") || this.subject.equals("") || this.path.equals(""))
            //JOptionPane.showMessageDialog("Hay espacios vacíos", JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(this,"Hay espacios vacíos");
        else{
            //(String user, String password, String path, String filename, String to, String subject, String message)
            Mail m = new Mail(this.user,"okxqjwjlnrqdljoa",this.path,this.filename,this.to,this.subject,this.message);
            Controller c = new Controller(m);
            String status = c.sendMail();
            if(status.equals("done"))
            {
                JOptionPane.showMessageDialog(this,"Se envió correctamente");
            }
            else{
                JOptionPane.showMessageDialog(this,status);
            }
        }   
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MailFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MailFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MailFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MailFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MailFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFile;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextArea txtMessage;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtSubject;
    private javax.swing.JTextField txtTo;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package english;

import java.applet.AudioClip;

/**
 *
 * @author USUARIO
 */
public class vocales extends javax.swing.JFrame {

    /**
     * Creates new form vocales
     */
    public vocales() {
        initComponents();
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        a = new javax.swing.JButton();
        e = new javax.swing.JButton();
        i = new javax.swing.JButton();
        o = new javax.swing.JButton();
        u = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        a.setBackground(new java.awt.Color(255, 255, 255));
        a.setAutoscrolls(true);
        a.setBorderPainted(false);
        a.setContentAreaFilled(false);
        a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aActionPerformed(evt);
            }
        });
        getContentPane().add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 260, 300));

        e.setBackground(new java.awt.Color(255, 255, 255));
        e.setAutoscrolls(true);
        e.setBorderPainted(false);
        e.setContentAreaFilled(false);
        e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eActionPerformed(evt);
            }
        });
        getContentPane().add(e, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 40, 210, 290));

        i.setBackground(new java.awt.Color(255, 255, 255));
        i.setAutoscrolls(true);
        i.setBorderPainted(false);
        i.setContentAreaFilled(false);
        i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iActionPerformed(evt);
            }
        });
        getContentPane().add(i, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 110, 300));

        o.setBackground(new java.awt.Color(255, 255, 255));
        o.setAutoscrolls(true);
        o.setBorderPainted(false);
        o.setContentAreaFilled(false);
        o.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oActionPerformed(evt);
            }
        });
        getContentPane().add(o, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 250, 300));

        u.setBackground(new java.awt.Color(255, 255, 255));
        u.setAutoscrolls(true);
        u.setBorderPainted(false);
        u.setContentAreaFilled(false);
        u.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uActionPerformed(evt);
            }
        });
        getContentPane().add(u, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 390, 240, 280));

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 153));
        jButton5.setText("VOLVER");
        jButton5.setBorderPainted(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 680, 200, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/44(1).jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eActionPerformed
        AudioClip sonido;
       sonido=java.applet.Applet.newAudioClip(getClass().getResource("/audios/E.wav"));
       sonido.play();
    }//GEN-LAST:event_eActionPerformed

    private void iActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iActionPerformed
        AudioClip sonido;
       sonido=java.applet.Applet.newAudioClip(getClass().getResource("/audios/I.wav"));
       sonido.play();
    }//GEN-LAST:event_iActionPerformed

    private void oActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oActionPerformed
        AudioClip sonido;
       sonido=java.applet.Applet.newAudioClip(getClass().getResource("/audios/O.wav"));
       sonido.play();
    }//GEN-LAST:event_oActionPerformed

    private void uActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uActionPerformed
        AudioClip sonido;
       sonido=java.applet.Applet.newAudioClip(getClass().getResource("/audios/U.wav"));
       sonido.play();
    }//GEN-LAST:event_uActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new leccionesInfantil();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aActionPerformed
         AudioClip sonido;
       sonido=java.applet.Applet.newAudioClip(getClass().getResource("/audios/A.wav"));
       sonido.play();
    }//GEN-LAST:event_aActionPerformed

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
            java.util.logging.Logger.getLogger(vocales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vocales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vocales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vocales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vocales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton a;
    private javax.swing.JButton e;
    private javax.swing.JButton i;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton o;
    private javax.swing.JButton u;
    // End of variables declaration//GEN-END:variables
}

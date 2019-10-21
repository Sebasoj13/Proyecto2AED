/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

/**
 *
 * @author Sebas
 */
public class PantallaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form PantallaPrincipal
     */
    public PantallaPrincipal() {
        initComponents();
        BotonesVIP.add(RadioOro);
        BotonesVIP.add(RadioPlatino);
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonesVIP = new javax.swing.ButtonGroup();
        RadioPreferencial = new javax.swing.JRadioButton();
        RadioPlatino = new javax.swing.JRadioButton();
        RadioOro = new javax.swing.JRadioButton();
        LugarDestinotxt = new javax.swing.JTextField();
        LugarOrigentxt = new javax.swing.JTextField();
        Nacionalidadtxt = new javax.swing.JTextField();
        Pasaportetxt = new javax.swing.JTextField();
        Fechatxt = new javax.swing.JTextField();
        Nombretxt = new javax.swing.JTextField();
        LabelSalida = new javax.swing.JLabel();
        LabelDestino = new javax.swing.JLabel();
        LabelOrigen = new javax.swing.JLabel();
        LabelNacionalidad = new javax.swing.JLabel();
        LabelPasaporte = new javax.swing.JLabel();
        LabelFecha = new javax.swing.JLabel();
        LabelNombre = new javax.swing.JLabel();
        LineaH = new javax.swing.JLabel();
        LineaV = new javax.swing.JLabel();
        LabelEspeciales = new javax.swing.JLabel();
        LabelVIP = new javax.swing.JLabel();
        LabelUsuario = new javax.swing.JLabel();
        jButtonRegistrar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RadioPreferencial.setText("Preferencial");
        RadioPreferencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioPreferencialActionPerformed(evt);
            }
        });
        getContentPane().add(RadioPreferencial, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, -1, -1));

        RadioPlatino.setText("Platino");
        getContentPane().add(RadioPlatino, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        RadioOro.setText("Oro");
        getContentPane().add(RadioOro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));
        getContentPane().add(LugarDestinotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 190, -1));
        getContentPane().add(LugarOrigentxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 190, -1));
        getContentPane().add(Nacionalidadtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 190, -1));
        getContentPane().add(Pasaportetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 190, -1));
        getContentPane().add(Fechatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 190, -1));
        getContentPane().add(Nombretxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 190, -1));

        LabelSalida.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        LabelSalida.setText("Salidas");
        getContentPane().add(LabelSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, -1, -1));

        LabelDestino.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        LabelDestino.setText("Destino:");
        getContentPane().add(LabelDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 210, -1, -1));

        LabelOrigen.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        LabelOrigen.setText("Origen:");
        getContentPane().add(LabelOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 180, -1, -1));

        LabelNacionalidad.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        LabelNacionalidad.setText("Nacionalidad:");
        getContentPane().add(LabelNacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 150, 150, -1));

        LabelPasaporte.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        LabelPasaporte.setText("Pasaporte:");
        getContentPane().add(LabelPasaporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 110, -1));

        LabelFecha.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        LabelFecha.setText("Fecha de nacimiento:");
        getContentPane().add(LabelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 230, -1));

        LabelNombre.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        LabelNombre.setText("Nombre:");
        getContentPane().add(LabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 60, 80, -1));

        LineaH.setBackground(new java.awt.Color(0, 0, 0));
        LineaH.setOpaque(true);
        getContentPane().add(LineaH, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 298, 1000, 3));

        LineaV.setBackground(new java.awt.Color(0, 0, 0));
        LineaV.setOpaque(true);
        getContentPane().add(LineaV, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 3, 600));

        LabelEspeciales.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        LabelEspeciales.setText("Preferencial");
        getContentPane().add(LabelEspeciales, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        LabelVIP.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        LabelVIP.setText("VIP");
        LabelVIP.setToolTipText("");
        getContentPane().add(LabelVIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, -1));

        LabelUsuario.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        LabelUsuario.setText("Registro");
        getContentPane().add(LabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, -1));

        jButtonRegistrar.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jButtonRegistrar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonRegistrar.setText("Registrar");
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 110, 30));

        jButtonSalir.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(255, 0, 0));
        jButtonSalir.setText("X");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(953, 5, 40, 30));

        Fondo.setBackground(new java.awt.Color(255, 125, 0));
        Fondo.setForeground(new java.awt.Color(255, 125, 0));
        Fondo.setOpaque(true);
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void RadioPreferencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioPreferencialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioPreferencialActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BotonesVIP;
    private javax.swing.JTextField Fechatxt;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel LabelDestino;
    private javax.swing.JLabel LabelEspeciales;
    private javax.swing.JLabel LabelFecha;
    private javax.swing.JLabel LabelNacionalidad;
    private javax.swing.JLabel LabelNombre;
    private javax.swing.JLabel LabelOrigen;
    private javax.swing.JLabel LabelPasaporte;
    private javax.swing.JLabel LabelSalida;
    private javax.swing.JLabel LabelUsuario;
    private javax.swing.JLabel LabelVIP;
    private javax.swing.JLabel LineaH;
    private javax.swing.JLabel LineaV;
    private javax.swing.JTextField LugarDestinotxt;
    private javax.swing.JTextField LugarOrigentxt;
    private javax.swing.JTextField Nacionalidadtxt;
    private javax.swing.JTextField Nombretxt;
    private javax.swing.JTextField Pasaportetxt;
    private javax.swing.JRadioButton RadioOro;
    private javax.swing.JRadioButton RadioPlatino;
    private javax.swing.JRadioButton RadioPreferencial;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JButton jButtonSalir;
    // End of variables declaration//GEN-END:variables
}

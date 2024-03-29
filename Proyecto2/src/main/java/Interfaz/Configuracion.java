/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author Sebas
 */
public class Configuracion extends javax.swing.JFrame {

    /**
     * Creates new form Configuracion
     */
    public Configuracion() {
        initComponents();
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

        jComboBox1 = new javax.swing.JComboBox<>();
        RangoMax = new javax.swing.JTextField();
        RangoMin = new javax.swing.JTextField();
        CantPuertasVIP = new javax.swing.JTextField();
        CantPuertas = new javax.swing.JTextField();
        LabelMaximo = new javax.swing.JLabel();
        LabelMinimo = new javax.swing.JLabel();
        LabelRango = new javax.swing.JLabel();
        LabelEstructura = new javax.swing.JLabel();
        LabelPuertasVIP = new javax.swing.JLabel();
        LabelPuertas = new javax.swing.JLabel();
        LabelConfiguracion = new javax.swing.JLabel();
        ButtonAceptar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Árboles Heap", "Cola de prioridad" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 160, -1));

        RangoMax.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        RangoMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RangoMaxActionPerformed(evt);
            }
        });
        getContentPane().add(RangoMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 218, 50, -1));

        RangoMin.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        RangoMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RangoMinActionPerformed(evt);
            }
        });
        getContentPane().add(RangoMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 217, 50, -1));

        CantPuertasVIP.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        CantPuertasVIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantPuertasVIPActionPerformed(evt);
            }
        });
        getContentPane().add(CantPuertasVIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 88, 50, -1));

        CantPuertas.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        CantPuertas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantPuertasActionPerformed(evt);
            }
        });
        getContentPane().add(CantPuertas, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 58, 50, -1));

        LabelMaximo.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        LabelMaximo.setText("Máximo:");
        getContentPane().add(LabelMaximo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 70, 40));

        LabelMinimo.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        LabelMinimo.setText("Mínimo:");
        getContentPane().add(LabelMinimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 70, 40));

        LabelRango.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        LabelRango.setText("Rango de tiempo para la puerta de salida:");
        getContentPane().add(LabelRango, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 440, 40));

        LabelEstructura.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        LabelEstructura.setText("Tipo de estructura: ");
        getContentPane().add(LabelEstructura, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 200, 40));

        LabelPuertasVIP.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        LabelPuertasVIP.setText("Cantidad de puertas VIP:");
        getContentPane().add(LabelPuertasVIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 250, 40));

        LabelPuertas.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        LabelPuertas.setText("Cantidad de puertas normales:");
        getContentPane().add(LabelPuertas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 290, 40));

        LabelConfiguracion.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        LabelConfiguracion.setText("Configuración");
        getContentPane().add(LabelConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 5, 180, 40));

        ButtonAceptar.setBackground(new java.awt.Color(255, 255, 255));
        ButtonAceptar.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        ButtonAceptar.setText("Aceptar");
        ButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, -1, -1));

        jButtonSalir.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(255, 0, 0));
        jButtonSalir.setText("X");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 6, -1, 30));

        Fondo.setBackground(new java.awt.Color(255, 125, 0));
        Fondo.setOpaque(true);
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void CantPuertasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantPuertasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CantPuertasActionPerformed

    private void RangoMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RangoMinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RangoMinActionPerformed

    private void RangoMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RangoMaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RangoMaxActionPerformed

    private void ButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAceptarActionPerformed
        try {
            int nVIP = Integer.parseInt(CantPuertasVIP.getText());
            int nNormal = Integer.parseInt(CantPuertas.getText());
            if (nVIP>5){
                JOptionPane.showMessageDialog(null, "Las puertas deben tener un valor menor a o igual a 5");
                return;
            }
            if (nNormal>5){
                JOptionPane.showMessageDialog(null, "Las puertas deben tener un valor menor o igual a 5");
                return;
            }
            int max = Integer.parseInt(RangoMax.getText());
            int min = Integer.parseInt(RangoMin.getText());
            if (max<min){
                JOptionPane.showMessageDialog(null, "El numero de rango mínimo excede al máximo.");
                return; 
            }
            int tiempo = (int) Math.floor(Math.random()*(max-min+1)+min);
            System.out.println(tiempo);
            PantallaPrincipal ventana = new PantallaPrincipal(nVIP, nNormal, tiempo);
            ventana.setVisible(true);
            this.setVisible(false);
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "En las casillas se deben de introducir valores numéricos solamente.");
        }
    }//GEN-LAST:event_ButtonAceptarActionPerformed

    private void CantPuertasVIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantPuertasVIPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CantPuertasVIPActionPerformed

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
            java.util.logging.Logger.getLogger(Configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Configuracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAceptar;
    private javax.swing.JTextField CantPuertas;
    private javax.swing.JTextField CantPuertasVIP;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel LabelConfiguracion;
    private javax.swing.JLabel LabelEstructura;
    private javax.swing.JLabel LabelMaximo;
    private javax.swing.JLabel LabelMinimo;
    private javax.swing.JLabel LabelPuertas;
    private javax.swing.JLabel LabelPuertasVIP;
    private javax.swing.JLabel LabelRango;
    private javax.swing.JTextField RangoMax;
    private javax.swing.JTextField RangoMin;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JComboBox<String> jComboBox1;
    // End of variables declaration//GEN-END:variables
}

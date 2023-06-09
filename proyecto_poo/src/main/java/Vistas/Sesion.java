/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;
import Controladores.*;
import Modelos.Conductor;
import javax.swing.*;
import java.sql.*;
/**
 *
 * @author diego
 */
public class Sesion extends javax.swing.JFrame {

    /**
     * Creates new form Sesion
     */

    public Sesion() {
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

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        ConductoresFrame = new javax.swing.JMenu();
        Buses = new javax.swing.JMenu();
        ReporteConductor = new javax.swing.JMenu();
        ReporteBus = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Sesion iniciada con exito :)");

        ConductoresFrame.setText("Conductores");
        ConductoresFrame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConductoresFrameMouseClicked(evt);
            }
        });
        jMenuBar1.add(ConductoresFrame);

        Buses.setText("Buses");
        Buses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BusesMouseClicked(evt);
            }
        });
        jMenuBar1.add(Buses);

        ReporteConductor.setText("Reporte Conductor");
        ReporteConductor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReporteConductorMouseClicked(evt);
            }
        });
        jMenuBar1.add(ReporteConductor);

        ReporteBus.setText("Reporte Bus");
        ReporteBus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReporteBusMouseClicked(evt);
            }
        });
        jMenuBar1.add(ReporteBus);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 634, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 495, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BusesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BusesMouseClicked
        // TODO add your handling code here:
        Buses buses=new Buses();
        buses.setVisible(true);
        this.add(buses);
            
        try {
           buses.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {}
    }//GEN-LAST:event_BusesMouseClicked

    private void ReporteConductorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReporteConductorMouseClicked
        // TODO add your handling code here:
        ReporteConductor reporte=new ReporteConductor();
        reporte.setVisible(true);
        this.add(reporte);
            
        try {
           reporte.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {}
    }//GEN-LAST:event_ReporteConductorMouseClicked

    private void ConductoresFrameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConductoresFrameMouseClicked
        // TODO add your handling code here:
        Conductores conductores=new Conductores();
        conductores.setVisible(true);
        this.add(conductores);
            
        try {
           conductores.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {}
    }//GEN-LAST:event_ConductoresFrameMouseClicked

    private void ReporteBusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReporteBusMouseClicked
        // TODO add your handling code here:
        ReporteBus reporte=new ReporteBus();
        reporte.setVisible(true);
        this.add(reporte);
            
        try {
           reporte.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {}
    }//GEN-LAST:event_ReporteBusMouseClicked

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
            java.util.logging.Logger.getLogger(Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Buses;
    private javax.swing.JMenu ConductoresFrame;
    private javax.swing.JMenu ReporteBus;
    private javax.swing.JMenu ReporteConductor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}

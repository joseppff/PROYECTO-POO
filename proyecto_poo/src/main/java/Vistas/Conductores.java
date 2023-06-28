/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;
import Controladores.ConductorG;
import Controladores.ConexionBD;
import Modelos.Conductor;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author diego
 */
public class Conductores extends javax.swing.JInternalFrame {

    /**
     * Creates new form Conductores
     */
    public ConexionBD conexion;
    public Connection link;
    public Conductores() {
        initComponents();
        
        conexion=new ConexionBD();
        link=conexion.Conectar();
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
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtRut = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        GuardarDatos = new javax.swing.JButton();
        BuscarDato = new javax.swing.JButton();
        ModificarDatos = new javax.swing.JButton();
        EliminarDato = new javax.swing.JButton();
        txtPatenteAsociada = new javax.swing.JTextField();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setText("Nombre");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel2.setText("Apellido");

        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        jLabel3.setText("Rut");

        jLabel4.setText("Patente Asociada");

        GuardarDatos.setText("Guardar Datos");
        GuardarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarDatosActionPerformed(evt);
            }
        });

        BuscarDato.setText("Buscar Dato");
        BuscarDato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarDatoActionPerformed(evt);
            }
        });

        ModificarDatos.setText("Modificar Datos");
        ModificarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarDatosActionPerformed(evt);
            }
        });

        EliminarDato.setText("Eliminar Dato");
        EliminarDato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarDatoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                                    .addComponent(jLabel1)
                                    .addComponent(txtApellido)
                                    .addComponent(txtRut)
                                    .addComponent(txtPatenteAsociada))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BuscarDato, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(GuardarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(ModificarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                                .addComponent(EliminarDato, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(3, 3, 3)
                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BuscarDato, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPatenteAsociada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GuardarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ModificarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EliminarDato, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void GuardarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarDatosActionPerformed
        // TODO add your handling code here:
        ConductorG conductor=new ConductorG();
        Conductor ConsultaConductor=new Conductor();
        
        ConsultaConductor.setNombre(txtNombre.getText());
        ConsultaConductor.setApellido(txtApellido.getText());
        ConsultaConductor.setRut(txtRut.getText());
        ConsultaConductor.setPatenteAsociada(txtPatenteAsociada.getText());
        if(conductor.Crear(link,ConsultaConductor)){
            this.setVisible(false);
            JOptionPane.showMessageDialog(null,"Datos Creados!");
        }
                 
    }//GEN-LAST:event_GuardarDatosActionPerformed

    private void BuscarDatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarDatoActionPerformed
        // TODO add your handling code here:
        
        ConductorG conductor=new ConductorG();
        Conductor ConsultaConductor=new Conductor();
   
        if(!txtRut.getText().equals("")){
            ConsultaConductor=conductor.Buscar(link,txtRut.getText());
            JOptionPane.showMessageDialog(null, "");
            
        }else{
             JOptionPane.showMessageDialog(null, "Coloque un rut valido");
        }
       
        
        txtRut.setText(ConsultaConductor.getRut());
        txtNombre.setText(ConsultaConductor.getNombre());
        txtApellido.setText(ConsultaConductor.getApellido());
        txtPatenteAsociada.setText(ConsultaConductor.getPatenteAsociada());
        
        
        
        
    }//GEN-LAST:event_BuscarDatoActionPerformed

    private void ModificarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarDatosActionPerformed
        // TODO add your handling code here:
        ConductorG conductor=new ConductorG();
        Conductor ConsultaConductor=new Conductor();
        
        if(!txtRut.getText().equals("")){
            ConsultaConductor=conductor.Buscar(link,txtRut.getText());
            JOptionPane.showMessageDialog(null, "");
            
        }else{
             JOptionPane.showMessageDialog(null, "Coloque un rut valido");
        }
        
        ConsultaConductor.setNombre(txtNombre.getText());
        ConsultaConductor.setApellido(txtApellido.getText());
        ConsultaConductor.setRut(txtRut.getText());
        ConsultaConductor.setPatenteAsociada(txtPatenteAsociada.getText());
        
        if(conductor.Actualizar(link,ConsultaConductor)){
            JOptionPane.showMessageDialog(null, "Datos Modificados!");
        }else{
            JOptionPane.showMessageDialog(null,"Los datos no fueron modificados");
        }

                      
    }//GEN-LAST:event_ModificarDatosActionPerformed

    private void EliminarDatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarDatoActionPerformed
        // TODO add your handling code here:
        ConductorG conductor=new ConductorG();
        Conductor ConsultaConductor=new Conductor();
        ConsultaConductor.setRut(txtRut.getText());
        
        if(conductor.Crear(link,ConsultaConductor)){
            JOptionPane.showMessageDialog(null, "Datos Eliminados!");
        }else{
            JOptionPane.showMessageDialog(null,"Los datos no fueron eliminados");
        }

                      
    }//GEN-LAST:event_EliminarDatoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarDato;
    private javax.swing.JButton EliminarDato;
    private javax.swing.JButton GuardarDatos;
    private javax.swing.JButton ModificarDatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPatenteAsociada;
    private javax.swing.JTextField txtRut;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Forms;

import Clases.EjecutarOperaciones;

import javax.swing.JOptionPane;

/**
 *
 * @author Ronald
 */
public class formularioMovimientoEditar extends javax.swing.JFrame {

    /**
     * Creates new form formularioMovimientoModificar
     */
    public formularioMovimientoEditar() {
        initComponents();
        EjecutarOperaciones.llenarComboIdProducto(jcomBoxIDmovimiento);
        EjecutarOperaciones.llenarComboSucursal(jComboBoxsucursal_origen);
        EjecutarOperaciones.llenarComboSucursal(jComboBoxsucursal_destino);
        jCalFechaEdit.setDateFormatString("dd/MM/yyyy"); // Sirve para mostrar el formato en el date chooser
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

        txtFechaAntigua = new javax.swing.JTextField();
        btnRegresar = new javax.swing.JButton();
        txtProducto = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        jComboBoxsucursal_origen = new javax.swing.JComboBox<>();
        jComboBoxsucursal_destino = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jCalFechaEdit = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        spinCantidad = new javax.swing.JSpinner();
        lblCodigoProducto = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        labelCodigo = new javax.swing.JLabel();
        jcomBoxIDmovimiento = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jLabel1.setText("Sucursal Origen");

        jLabel2.setText("Sucursal Destino");

        jLabel3.setText("producto");

        jLabel4.setText("cantidad");

        jLabel5.setText("fecha_Encontrada");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel6.setText("ID movimiento");

        jCalFechaEdit.setToolTipText("");

        jLabel7.setText("fecha_Editar");

        lblCodigoProducto.setText("Codigo Producto");

        jcomBoxIDmovimiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcomBoxIDmovimiento.setSelectedIndex(-1);
        jcomBoxIDmovimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomBoxIDmovimientoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(74, 74, 74)
                        .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(lblCodigoProducto))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(labelCodigo)
                                        .addContainerGap())
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(spinCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jCalFechaEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                        .addGap(51, 51, 51)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnEditar)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(btnRegresar)
                                                    .addGap(14, 14, 14))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(btnBuscar)
                                                    .addGap(41, 41, 41)))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jcomBoxIDmovimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(43, 43, 43)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel5))
                    .addGap(32, 32, 32)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jComboBoxsucursal_destino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBoxsucursal_origen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(212, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(170, 170, 170)
                    .addComponent(jLabel10)
                    .addContainerGap(283, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jcomBoxIDmovimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoProducto)
                    .addComponent(jLabel9)
                    .addComponent(labelCodigo))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(spinCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegresar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jCalFechaEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addGap(15, 15, 15))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(52, 52, 52)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBoxsucursal_origen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addGap(28, 28, 28)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBoxsucursal_destino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGap(94, 94, 94)
                    .addComponent(jLabel5)
                    .addContainerGap(66, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(177, Short.MAX_VALUE)
                    .addComponent(jLabel10)
                    .addGap(123, 123, 123)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        formularioMenuMovimientos obj = new formularioMenuMovimientos();

        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int id_movimiento;
        id_movimiento = Integer.parseInt(jcomBoxIDmovimiento.getSelectedItem().toString());
        int sucursal_origen = jComboBoxsucursal_origen.getSelectedIndex() + 1;
        int sucursal_destino = jComboBoxsucursal_destino.getSelectedIndex() + 1;
        String producto = txtProducto.getText();
        int cantidad = (int) (spinCantidad.getValue());
        String fecha_envio = "" + jCalFechaEdit.getDate();

        EjecutarOperaciones.editarMovimiento(id_movimiento, "" + sucursal_origen, "" + sucursal_destino, producto, cantidad, fecha_envio);
        JOptionPane.showMessageDialog(null, "Movimiento editado");
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        int id_movimiento;
        id_movimiento = Integer.parseInt(jcomBoxIDmovimiento.getSelectedItem().toString());
        String[] movimiento;
        movimiento = EjecutarOperaciones.buscarMovimiento(id_movimiento);
        txtProducto.setText(movimiento[2]);
        labelCodigo.setText(movimiento[3]);
        spinCantidad.setValue(movimiento[4]);

        txtFechaAntigua.setText(movimiento[5]);

        jComboBoxsucursal_origen.setSelectedIndex(Integer.parseInt(movimiento[0]) - (1));
        jComboBoxsucursal_destino.setSelectedIndex(Integer.parseInt(movimiento[1]) - (1));
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jcomBoxIDmovimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomBoxIDmovimientoActionPerformed

    }//GEN-LAST:event_jcomBoxIDmovimientoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnRegresar;
    private com.toedter.calendar.JDateChooser jCalFechaEdit;
    private javax.swing.JComboBox<String> jComboBoxsucursal_destino;
    private javax.swing.JComboBox<String> jComboBoxsucursal_origen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> jcomBoxIDmovimiento;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel lblCodigoProducto;
    private javax.swing.JSpinner spinCantidad;
    private javax.swing.JTextField txtFechaAntigua;
    private javax.swing.JTextField txtProducto;
    // End of variables declaration//GEN-END:variables
}
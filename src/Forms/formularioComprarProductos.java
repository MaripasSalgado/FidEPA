/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Forms;

import Clases.EjecutarOperaciones;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import Clases.*;
import static Clases.EjecutarOperaciones.agregarProducto;
import java.util.ArrayList;
import javax.swing.JComboBox;

/**
 *
 * @author Ronald
 */
public class formularioComprarProductos extends javax.swing.JFrame {

    public static ArrayList listaProductos = new ArrayList<Producto>();

    /**
     * Creates new form formularioComprarProductos
     */
    public formularioComprarProductos() {
        initComponents();
        this.setLocationRelativeTo(null);

        EjecutarOperaciones.llenarComboSucursal(jcomBoxSucursal);
        jcomBoxTipoProducto.addItem("Construcción");
        jcomBoxTipoProducto.addItem("Garaje");
        jcomBoxTipoProducto.addItem("Hogar");
        jcomBoxTipoProducto.addItem("Jardinería");

        //Spinner para la cantidad de bienes.
        SpinnerNumberModel num = new SpinnerNumberModel();
        num.setMinimum(0);
        num.setMaximum(1000000);
        num.setStepSize(1);
        spinCantidad.setModel(num);

        //Spinner para la cantidad de colones. Salta en 100 así que cualquier
        //25, 50, 75 se mete manual. Esto para evitar estar haciendo click.
        SpinnerNumberModel nam = new SpinnerNumberModel();
        nam.setMinimum(0);
        nam.setMaximum(1000000);
        nam.setStepSize(100);
        spinPrecio.setModel(nam);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblSucursal = new javax.swing.JLabel();
        spinCantidad = new javax.swing.JSpinner();
        txtDescripcion = new javax.swing.JTextField();
        jcomBoxSucursal = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jcomBoxTipoProducto = new javax.swing.JComboBox<>();
        spinPrecio = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCodigo = new javax.swing.JTextPane();
        lblCodigo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\ferde\\Downloads\\martillo (2).png")); // NOI18N

        jLabel2.setText("Nombre");

        jLabel3.setText("Cantidad");

        jLabel5.setText("Precio Unitario");

        jLabel6.setText("Descripcion");

        lblSucursal.setText("Sucursal");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel9.setText("Tipo Producto");

        jScrollPane1.setViewportView(txtCodigo);

        lblCodigo.setText("Código (Asegurar que vaya acorde a tipo producto).");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregar)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 200, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSucursal)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(51, 51, 51)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(spinPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(txtDescripcion)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(jcomBoxSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel9))
                                .addGap(54, 54, 54)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jcomBoxTipoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(spinCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jcomBoxTipoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(spinCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(spinPrecio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigo))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSucursal)
                    .addComponent(jcomBoxSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 645, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSalir)
                        .addContainerGap())
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        try {
            if (txtCodigo.getText().isEmpty() || txtNombre.getText().isEmpty()
                    || spinPrecio.getValue().equals(0) || spinCantidad.getValue().equals(0)
                    || txtDescripcion.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "ERROR. Asegurese que todos los campos"
                        + " estén llenos y bien hechos.");
            } else {
                String tipoProd = (String) jcomBoxTipoProducto.getSelectedItem();

                if (tipoProd.equals("Construcción")) {

                    Construcion nuevoCons = new Construcion(txtNombre.getText(), txtCodigo.getText(), (Integer) spinCantidad.getValue(), (Integer) spinPrecio.getValue(), txtDescripcion.getText());

                    listaProductos.add(nuevoCons);

                    //Deja todo en "blanco", para meter más producto y no repetir.
                    txtCodigo.setText("");
                    txtNombre.setText("");
                    spinPrecio.setValue(0);
                    spinCantidad.setValue(0);
                    txtDescripcion.setText("");

                } else if (tipoProd.equals("Garaje")) {
                    Garaje nuevoGaraje = new Garaje(txtNombre.getText(), txtCodigo.getText(), (Integer) spinCantidad.getValue(), (Integer) spinPrecio.getValue(), txtDescripcion.getText());

                    listaProductos.add(nuevoGaraje);

                    //Deja todo en "blanco", para meter más producto y no repetir.
                    txtCodigo.setText("");
                    txtNombre.setText("");
                    spinPrecio.setValue(0);
                    spinCantidad.setValue(0);
                    txtDescripcion.setText("");

                } else if (tipoProd.equals("Hogar")) {
                    Hogar nuevoHogar = new Hogar(txtNombre.getText(), txtCodigo.getText(), (Integer) spinCantidad.getValue(), (Integer) spinPrecio.getValue(), txtDescripcion.getText());

                    listaProductos.add(nuevoHogar);

                    //Deja todo en "blanco", para meter más producto y no repetir.
                    txtCodigo.setText("");
                    txtNombre.setText("");
                    spinPrecio.setValue(0);
                    spinCantidad.setValue(0);
                    txtDescripcion.setText("");

                } else if (tipoProd.equals("Jardinería")) {
                    Jardineria nuevoJardin = new Jardineria(txtNombre.getText(), txtCodigo.getText(), (Integer) spinCantidad.getValue(), (Integer) spinPrecio.getValue(), txtDescripcion.getText());

                    listaProductos.add(nuevoJardin);

                    //Deja todo en "blanco", para meter más producto y no repetir.
                    txtCodigo.setText("");
                    txtNombre.setText("");
                    spinPrecio.setValue(0);
                    spinCantidad.setValue(0);
                    txtDescripcion.setText("");

                }
                //Extraemos el id de la sucursal y lo agregamos aparte
                String sucursal = "" + (jcomBoxSucursal.getSelectedIndex() + 1);
                EjecutarOperaciones.agregarProducto(listaProductos, sucursal, tipoProd);
                //Limpiamos la lista despues de agregar los datos a la base de datos.
                listaProductos.clear();
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcomBoxSucursal;
    private javax.swing.JComboBox<String> jcomBoxTipoProducto;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblSucursal;
    private javax.swing.JSpinner spinCantidad;
    private javax.swing.JSpinner spinPrecio;
    private javax.swing.JTextPane txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1b2tiendafrutas;

import java.util.List;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author ESFOT
 */
public class RegistroFrutas extends javax.swing.JFrame {
    List<Cliente> listaCedulas = new ArrayList<Cliente>();
    DefaultComboBoxModel listaCedulasModel = 
        new DefaultComboBoxModel(listaCedulas.toArray());
    
    List<Frutas> listaFrutas = new ArrayList<Frutas>();
    DefaultComboBoxModel listaFrutasModel = 
        new DefaultComboBoxModel(listaFrutas.toArray());
    /**
     * Creates new form RegistroFrutas
     */
    public RegistroFrutas() {
        initComponents();
        this.setTitle("Tienda de Frutas");
        
        String [] listaFrutasTienda = new String[]{"Manzana","Pera","Sandia","Papaya"};
        Frutas f1= new Frutas(listaFrutasTienda[0],0.30 ,1);
        Frutas f2= new Frutas(listaFrutasTienda[1],0.40 ,2);
        Frutas f3= new Frutas(listaFrutasTienda[2],0.80 ,3);
        Frutas f4= new Frutas(listaFrutasTienda[3],0.50 ,4);
        listaFrutasModel = new DefaultComboBoxModel(listaFrutasTienda);
        cmbFrutas.setModel(listaFrutasModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCliente = new javax.swing.JLabel();
        lblFrutas = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        lblListaFrutas = new javax.swing.JLabel();
        lblCodigoFruta = new javax.swing.JLabel();
        txtCedulaCliente = new javax.swing.JTextField();
        txtNombreCliente = new javax.swing.JTextField();
        txtNombreFruta = new javax.swing.JTextField();
        txtCodigoFruta = new javax.swing.JTextField();
        lblNombreFruta = new javax.swing.JLabel();
        lblPrecioFruta = new javax.swing.JLabel();
        txtPrecioFruta = new javax.swing.JTextField();
        cmbFrutas = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        btnRegistrarPedido = new javax.swing.JButton();
        lblPedidosRegistrados = new javax.swing.JLabel();
        lblListaCed = new javax.swing.JLabel();
        cmbCedulas = new javax.swing.JComboBox<>();
        btnMostrarPedido = new javax.swing.JButton();
        lblInfCliente = new javax.swing.JLabel();
        lblPedCliente = new javax.swing.JLabel();
        lblInfoNombre = new javax.swing.JLabel();
        lblInfoCedula = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaPedidosCliente = new javax.swing.JTextArea();
        lblPedidosTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCliente.setText("Cliente");

        lblFrutas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblFrutas.setText("Frutas");

        lblNombre.setText("Nombre:");

        lblCedula.setText("Cédula:");

        lblListaFrutas.setText("Lista de frutas");

        lblCodigoFruta.setText("Código:");

        lblNombreFruta.setText("Nombre:");

        lblPrecioFruta.setText("Precio:");

        cmbFrutas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbFrutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFrutasActionPerformed(evt);
            }
        });

        jButton1.setText("Añadir fruta al pedido");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnRegistrarPedido.setText("REGISTRAR PEDIDO");
        btnRegistrarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPedidoActionPerformed(evt);
            }
        });

        lblPedidosRegistrados.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPedidosRegistrados.setText("Pedidos Registrados");

        lblListaCed.setText("Lista de cédulas");

        cmbCedulas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnMostrarPedido.setText("Mostrar pedido");
        btnMostrarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarPedidoActionPerformed(evt);
            }
        });

        lblInfCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblInfCliente.setText("Información Cliente");

        lblPedCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPedCliente.setText("Pedidos del cliente");

        lblInfoNombre.setText("NOMBRE ");

        lblInfoCedula.setText("CEDULA");

        txtAreaPedidosCliente.setColumns(20);
        txtAreaPedidosCliente.setRows(5);
        jScrollPane1.setViewportView(txtAreaPedidosCliente);

        lblPedidosTotal.setText("TOTAL ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(btnRegistrarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblPrecioFruta))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblNombreFruta))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblInfoNombre)
                                            .addComponent(lblInfoCedula))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblPedidosTotal)
                                        .addGap(126, 126, 126))
                                    .addComponent(lblPedidosRegistrados)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblCliente)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblNombre)
                                                        .addComponent(lblCedula))
                                                    .addGap(18, 18, 18)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtCedulaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                                        .addComponent(txtNombreCliente))))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(lblListaCed)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(cmbCedulas, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(lblInfCliente)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(33, 33, 33)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblPedCliente)
                                                    .addComponent(btnMostrarPedido)
                                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblCodigoFruta, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lblFrutas, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lblListaFrutas, javax.swing.GroupLayout.Alignment.TRAILING))))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombreFruta, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(txtCodigoFruta, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(txtPrecioFruta, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(cmbFrutas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCliente)
                    .addComponent(lblFrutas))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(lblListaFrutas)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbFrutas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedula)
                    .addComponent(lblCodigoFruta)
                    .addComponent(txtCedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoFruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreFruta)
                    .addComponent(txtNombreFruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecioFruta)
                    .addComponent(txtPrecioFruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(10, 10, 10)
                .addComponent(btnRegistrarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblPedidosRegistrados)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblListaCed)
                    .addComponent(cmbCedulas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrarPedido))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInfCliente)
                    .addComponent(lblPedCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblInfoNombre)
                        .addGap(18, 18, 18)
                        .addComponent(lblInfoCedula))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblPedidosTotal)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Frutas newFruta;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nombreFruta = txtNombreFruta.getText();
        int codigoFruta = Integer.valueOf(txtCodigoFruta.getText());
        double precioFruta = Double.valueOf(txtPrecioFruta.getText());
        
        boolean validarFruta = false;
        
        if(!nombreFruta.equals("") && !txtCodigoFruta.getText().equals("") && !txtPrecioFruta.getText().equals("")){
           newFruta = new Frutas(nombreFruta,precioFruta,codigoFruta);
           for(Frutas fruta :listaFrutas){
               if(fruta.getNombre().equals(newFruta.getNombre())){
                   validarFruta = true;
                   break;
               }
           }
           if(!validarFruta){
               listaFrutas.add(newFruta);
               listaFrutasModel.addElement(newFruta);
               JOptionPane.showMessageDialog(rootPane, "Fruta agregada exitosamente");
           }else{
               JOptionPane.showMessageDialog(rootPane, "Esta fruta ya esta en la tienda");
           }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Llene todos los campos para ingresar la fruta");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmbFrutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFrutasActionPerformed
        
    }//GEN-LAST:event_cmbFrutasActionPerformed
    Cliente newCliente;
    private void btnRegistrarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPedidoActionPerformed
        String nombreCliente = txtNombreCliente.getText();
        int cedulaCliente = Integer.valueOf(txtCedulaCliente.getText());
        boolean validarCedula = false;
        String [] registroCliente = new String[]{};
        if(!nombreCliente.equals("") && !txtCedulaCliente.getText().equals("")){
            newCliente = new Cliente(nombreCliente,cedulaCliente);
            for(Cliente c : listaCedulas){
                if(c.getCedula()== newCliente.getCedula()){
                    validarCedula = true;
                    break;
                }
            }
            if(!validarCedula){
                listaCedulas.add(newCliente);
                listaCedulasModel.addElement(newCliente);
            }else{
                JOptionPane.showMessageDialog(rootPane, "Cliente ya existe");
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Llene todos los campos para ingresar el cliente");
        }
    }//GEN-LAST:event_btnRegistrarPedidoActionPerformed

    private void btnMostrarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarPedidoActionPerformed
        String cedulaCliente = cmbCedulas.getSelectedItem().toString();
        
        
    }//GEN-LAST:event_btnMostrarPedidoActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroFrutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroFrutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroFrutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroFrutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroFrutas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostrarPedido;
    private javax.swing.JButton btnRegistrarPedido;
    private javax.swing.JComboBox<String> cmbCedulas;
    private javax.swing.JComboBox<String> cmbFrutas;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblCodigoFruta;
    private javax.swing.JLabel lblFrutas;
    private javax.swing.JLabel lblInfCliente;
    private javax.swing.JLabel lblInfoCedula;
    private javax.swing.JLabel lblInfoNombre;
    private javax.swing.JLabel lblListaCed;
    private javax.swing.JLabel lblListaFrutas;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreFruta;
    private javax.swing.JLabel lblPedCliente;
    private javax.swing.JLabel lblPedidosRegistrados;
    private javax.swing.JLabel lblPedidosTotal;
    private javax.swing.JLabel lblPrecioFruta;
    private javax.swing.JTextArea txtAreaPedidosCliente;
    private javax.swing.JTextField txtCedulaCliente;
    private javax.swing.JTextField txtCodigoFruta;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNombreFruta;
    private javax.swing.JTextField txtPrecioFruta;
    // End of variables declaration//GEN-END:variables
}

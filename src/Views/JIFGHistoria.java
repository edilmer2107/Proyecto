
package Views;

import Controllers.GHistoria;
import Entidades.Historia;
import Models.Tabla_Historia;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class JIFGHistoria extends javax.swing.JInternalFrame {
    private static JIFGHistoria instancia;
    
    Tabla_Historia mtE = new Tabla_Historia();

    private JIFGHistoria() {
    initComponents();
    tablaHistoria();
    this.tblLista.setModel(mtE);
     
    
    txtBuscar.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
        public void insertUpdate(javax.swing.event.DocumentEvent e) {
            filtrar();
        }

        public void removeUpdate(javax.swing.event.DocumentEvent e) {
            filtrar();
        }

        public void changedUpdate(javax.swing.event.DocumentEvent e) {
            filtrar();
        }
    });
}

    
    public static JIFGHistoria getInstancia(){
        if(instancia == null || instancia.isClosed()){
            instancia = new JIFGHistoria();
        }
        return instancia;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnVerDatos1 = new javax.swing.JButton();
        btnEliminar1 = new javax.swing.JButton();
        btnSalir1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLista = new javax.swing.JTable();

        setTitle("HISTORIA");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado "));

        btnVerDatos1.setBackground(new java.awt.Color(0, 51, 255));
        btnVerDatos1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnVerDatos1.setText("Ver Datos");
        btnVerDatos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerDatos1ActionPerformed(evt);
            }
        });

        btnEliminar1.setBackground(new java.awt.Color(204, 0, 0));
        btnEliminar1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnEliminar1.setText("Eliminar");
        btnEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar1ActionPerformed(evt);
            }
        });

        btnSalir1.setBackground(new java.awt.Color(0, 153, 0));
        btnSalir1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnSalir1.setText("Salir");
        btnSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir1ActionPerformed(evt);
            }
        });

        tblLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblLista);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVerDatos1, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addComponent(btnEliminar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVerDatos1)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar1)
                        .addGap(284, 284, 284)
                        .addComponent(btnSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 92, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 450, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnVerDatos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerDatos1ActionPerformed
        
    }//GEN-LAST:event_btnVerDatos1ActionPerformed

    private void btnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar1ActionPerformed
        
    }//GEN-LAST:event_btnEliminar1ActionPerformed

    private void btnSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalir1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar1;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JButton btnVerDatos1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblLista;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

    
    private void tablaHistoria() {
        ArrayList arrHistoria = null;
    try {
        //1 Extraer datos de la BD - cliente
        GHistoria bdHistoria = new GHistoria();
        arrHistoria = bdHistoria.listar();
        
        //2 Enviar los datos obtenido al modelo Tabla Clientes
        mtE.setListTabla(arrHistoria);
        mtE.fireTableDataChanged();

        if (arrHistoria.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se encontraron registros de historias médicas");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al cargar datos: " + e.getMessage());
        e.printStackTrace();
    }
}
private void filtrar() {
    String texto = txtBuscar.getText().trim();
    if (!texto.isEmpty()) {
        try {
            GHistoria gh = new GHistoria();
            ArrayList<Historia> resultados = new ArrayList<>();
            for (Historia h : gh.buscarPorNombreODni(texto)) {
                    resultados.add(h);
            }

            mtE.setListTabla(resultados);
            tblLista.setModel(mtE);
            tblLista.repaint();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al buscar: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        tablaHistoria();
    }
}
}


package Views;

import Controllers.GEspecialidad;
import Controllers.GMedico;
import Entidades.Especialidad;
import Entidades.Medico;
import Entidades.Paciente;
import Models.MC_Especialidad;
import Models.M_Medico;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class JIFGMedico extends javax.swing.JInternalFrame {
    private static JIFGMedico instancia;
    private int idActualizar = -1;
    private int indexElemSelec = -1;
    
    GMedico gestMedico = new GMedico();
    GEspecialidad gestEspe = new GEspecialidad();
    M_Medico mtM = new M_Medico();
    MC_Especialidad mcEs = new MC_Especialidad();
    
    private JIFGMedico() {
        
        initComponents();
        tablaMedico();
        comboEspecialidad();
        this.activarCrls(false);
    }
    public static JIFGMedico getInstancia(){
        if(instancia == null || instancia.isClosed()){
            instancia = new JIFGMedico();
        }
        return instancia;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cmboxEspecialidad = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLista = new javax.swing.JTable();
        btnVerDatos1 = new javax.swing.JButton();
        btnModificar1 = new javax.swing.JButton();
        btnEliminar1 = new javax.swing.JButton();
        btnSalir1 = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos "));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Nombres");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Apellidos");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("DNI");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Telefono");

        btnGuardar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnNuevo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel7.setText("Especialidad");

        cmboxEspecialidad.setModel(this.mcEs);

        jLabel5.setText("Correo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefono)
                            .addComponent(txtApellidos)
                            .addComponent(txtDni)
                            .addComponent(cmboxEspecialidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCorreo)))
                .addGap(0, 28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmboxEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnCancelar)
                    .addComponent(btnGuardar)))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado "));

        tblLista.setModel(this.mtM);
        jScrollPane2.setViewportView(tblLista);

        btnVerDatos1.setBackground(new java.awt.Color(0, 51, 255));
        btnVerDatos1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnVerDatos1.setText("Ver Datos");
        btnVerDatos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerDatos1ActionPerformed(evt);
            }
        });

        btnModificar1.setBackground(new java.awt.Color(204, 102, 0));
        btnModificar1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnModificar1.setText("Modificar");
        btnModificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificar1ActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnModificar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnSalir1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnEliminar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVerDatos1, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnVerDatos1)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar1)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar1)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            
            this.validarDatos();
            Medico objM = new Medico();
            
            objM.setApellidos( this.txtApellidos.getText() );
            objM.setNombres(this.txtNombres.getText() );
            objM.setDni(this.txtDni.getText() );
            objM.setTelefono(this.txtTelefono.getText() );
            objM.setCorreo(this.txtCorreo.getText());
            Especialidad te = this.mcEs.getSeleccionado();
            objM.setEspecialidad(te);
            
            if (idActualizar == -1) {
            // CREAR
            gestMedico.crear(objM);
        } else {
            // ACTUALIZAR
            objM.setId(idActualizar); // Recupera ID original
            gestMedico.actualizar(objM.getId(), objM);
            idActualizar = -1;
        }
            this.tablaMedico();
            this.limpiarFormulario();
            this.activarCrls(false);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        this.limpiarFormulario();
        this.activarCrls(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.activarCrls(false);
        this.limpiarFormulario();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnVerDatos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerDatos1ActionPerformed
        int indiceSeleccionado = this.tblLista.getSelectedRow();
        if(indiceSeleccionado >= 0){
            Medico objL = this.mtM.getMedico(indiceSeleccionado);
            JOptionPane.showMessageDialog(this, objL.verDatos(), "DATOS DEL MEDICO", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_btnVerDatos1ActionPerformed

    private void btnModificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificar1ActionPerformed
        int indiceSeleccionado = this.tblLista.getSelectedRow();
    if (indiceSeleccionado < 0)return;
    try{
        Medico objM = (Medico) this.mtM.getMedico(indiceSeleccionado);
        
        this.txtNombres.setText(objM.getNombres());
        this.txtApellidos.setText(objM.getApellidos());
        this.txtDni.setText(objM.getDni());
        this.txtTelefono.setText(objM.getTelefono());
        this.txtCorreo.setText(objM.getCorreo());
        this.mcEs.setSeleccionado(objM.getEspecialidad());
        this.idActualizar = objM.getId();
        
        this.activarCrls(true);
    }catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al intentar cargar medico: " + e.getMessage());
    }
    }//GEN-LAST:event_btnModificar1ActionPerformed

    private void btnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar1ActionPerformed
        try {
        int fila = this.tblLista.getSelectedRow();
        if (fila < 0) {
            JOptionPane.showMessageDialog(this, "Seleccione un medico para eliminar");
            return;
        }

        Medico objM = (Medico) this.mtM.getMedico(fila);
        int confirm = JOptionPane.showConfirmDialog(this, "¿Está seguro de eliminar al medico?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
        this.gestMedico.eliminar(objM.getId());
        this.tablaMedico();
        this.limpiarFormulario();
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: NO se pudo eliminar el medico\n" + e.getMessage());
    }
    }//GEN-LAST:event_btnEliminar1ActionPerformed

    private void btnSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalir1ActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            String str = txtBuscar.getText();
            if(!str.isEmpty()){
                buscarPorDni(str);
            }else {
            JOptionPane.showMessageDialog(this, "Ingrese un DNI para buscar", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
            this.activarCrls(false);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar1;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar1;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JButton btnVerDatos1;
    private javax.swing.JComboBox<String> cmboxEspecialidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblLista;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
private void limpiarFormulario(){
        this.idActualizar = -1;
        this.txtNombres.setText("");
        this.txtApellidos.setText("");
        this.txtDni.setText("");
        this.txtTelefono.setText("");
        this.txtCorreo.setText("");
        this.cmboxEspecialidad.setEnabled(false);
        this.indexElemSelec = -1;
    }
    
    private void activarCrls(boolean valor){
        this.txtNombres.setEnabled(valor);
        this.txtApellidos.setEnabled(valor);
        this.txtDni.setEnabled(valor);
        this.txtTelefono.setEnabled(valor);
        this.txtCorreo.setEnabled(valor);
        this.btnGuardar.setEnabled(valor);
        this.cmboxEspecialidad.setEnabled(valor);
    }
    private void tablaMedico() {
        ArrayList arrMedico = null;
        try {
            //1 Extraer datos de la BD - cliente
            GMedico bdMedico = new GMedico();
            arrMedico = bdMedico.listar();

            //2 Enviar los datos obtenido al modelo Tabla Clientes
            mtM.setListMedico(arrMedico);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    private void comboEspecialidad() {
        try {
            
           this.mcEs.setListEspe(this.gestEspe.listar());
        } catch (Exception e) {
        
        }
    }
    private void buscarPorDni(String dni) {
    try {
        Medico medico = gestMedico.buscarPorDni(dni); // Asegúrate de que este método exista en GPaciente
        
        JOptionPane.showMessageDialog(this, medico.verDatos(), "DATOS DEL PACIENTE", JOptionPane.PLAIN_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al buscar paciente: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    private void validarDatos() throws Exception {
    // Validar nombres
    if (txtNombres.getText().trim().isEmpty()) {
        throw new Exception("El campo 'Nombres' no puede estar vacío.");
    }

    // Validar apellidos
    if (txtApellidos.getText().trim().isEmpty()) {
        throw new Exception("El campo 'Apellidos' no puede estar vacío.");
    }

    // Validar DNI
    String dni = txtDni.getText().trim();
    if (dni.isEmpty()) {
        throw new Exception("El campo 'DNI' no puede estar vacío.");
    }
    if (!dni.matches("\\d{8}")) {
        throw new Exception("El DNI debe tener exactamente 8 dígitos numéricos.");
    }

    // Validar teléfono
    String telefono = txtTelefono.getText().trim();
    if (telefono.isEmpty()) {
        throw new Exception("El campo 'Teléfono' no puede estar vacío.");
    }
    if (!telefono.matches("\\d{9}")) {
        throw new Exception("El teléfono debe tener exactamente 9 dígitos numéricos.");
    }

    // Validar correo
    String correo = txtCorreo.getText().trim();
    if (correo.isEmpty()) {
        throw new Exception("El campo 'Correo' no puede estar vacío.");
    }
    if (!correo.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
        throw new Exception("El correo electrónico no tiene un formato válido.");
    }

    // Validar especialidad seleccionada
    Especialidad especialidadSeleccionada = this.mcEs.getSeleccionado();
    if (especialidadSeleccionada == null) {
        throw new Exception("Debe seleccionar una especialidad.");
    }
}

}

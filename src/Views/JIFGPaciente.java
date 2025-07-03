
package Views;

import Controllers.GPaciente;
import Entidades.Paciente;
import Models.M_Paciente;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;


public class JIFGPaciente extends javax.swing.JInternalFrame {
    private static JIFGPaciente instancia;
    
    private boolean estaEditado = false;
    private int indiceSeleccionado = -1;
    private  int idActualizar = -1;
    GPaciente gestPaciente = new GPaciente();
    M_Paciente mtp = new M_Paciente();
    

    private JIFGPaciente() {
        initComponents();
        this.activarCtrls(false);
        this.tablaPaciente();
        
    }
    public static JIFGPaciente getInstancia(){
        if(instancia == null || instancia.isClosed()){
            instancia = new JIFGPaciente();
        }
        return instancia;
    }
  
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnVerDatos = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLista = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        rbtnMasculino = new javax.swing.JRadioButton();
        rbtnFemenino = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtLugar = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtApoderado = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtEstadiCivil = new javax.swing.JTextField();
        txtFechaR = new javax.swing.JTextField();
        txtFechaNacimiento = new com.toedter.calendar.JDateChooser();

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado"));

        btnVerDatos.setBackground(new java.awt.Color(0, 51, 255));
        btnVerDatos.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnVerDatos.setText("Ver Datos");
        btnVerDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerDatosActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(204, 102, 0));
        btnModificar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(204, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(0, 153, 0));
        btnSalir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        tblLista.setModel(this.mtp);
        jScrollPane1.setViewportView(tblLista);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVerDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnVerDatos)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Nombres");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Apellidos");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("DNI");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Telefono");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Direccion");

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

        jLabel7.setText("Sexo");

        rbtnMasculino.setText("Masculino");

        rbtnFemenino.setText("Femenino");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Fecha Nacimiento");

        jLabel9.setText("Lugar de Nacimiento");

        jLabel10.setText("Estado Civil");

        jLabel11.setText("Apoderado");

        jLabel15.setText("Correo");

        jLabel17.setText("Fecha Registro");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(294, 294, 294))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellidos)
                            .addComponent(txtDni)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(rbtnMasculino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbtnFemenino)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefono)
                            .addComponent(txtCorreo))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel11)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtFechaR)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApoderado)
                            .addComponent(txtLugar)
                            .addComponent(txtEstadiCivil, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnMasculino)
                    .addComponent(jLabel7)
                    .addComponent(rbtnFemenino)
                    .addComponent(jLabel10)
                    .addComponent(txtEstadiCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApoderado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel4)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFechaR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnCancelar)
                    .addComponent(btnGuardar)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                .addGap(60, 60, 60))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public static String fechaActual(){
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        return formatoFecha.format(fecha);
    }
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            String str = txtBuscar.getText();
            if(!str.isEmpty()){
                buscarPorDni(str);
            }else {
            JOptionPane.showMessageDialog(this, "Ingrese un DNI para buscar", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
            this.activarCtrls(false);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnVerDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerDatosActionPerformed
        int indiceSeleccionado = this.tblLista.getSelectedRow();
        if(indiceSeleccionado >=0){
            Paciente objP = this.mtp.getPaciente(indiceSeleccionado);
            JOptionPane.showMessageDialog(this, objP.verDatos(), "DATOS DEL PACIENTE", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_btnVerDatosActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
         this.indiceSeleccionado=this.tblLista.getSelectedRow();
         if(this.indiceSeleccionado < 0)return;
         try {
                    Paciente paciente = (Paciente) this.mtp.getPaciente(indiceSeleccionado);
                    txtNombres.setText(paciente.getNombres());
                    txtApellidos.setText(paciente.getApellidos());
                    txtDni.setText(paciente.getDni());
                    txtTelefono.setText(paciente.getTelefono());
                    txtDireccion.setText(paciente.getDireccion());
                    txtCorreo.setText(paciente.getCorreo());
                    txtLugar.setText(paciente.getLugar_nacimiento());
                    txtEstadiCivil.setText(paciente.getEstado_civil());
                    txtApoderado.setText(paciente.getDatos_del_Apoderado());


                    // Sexo
                    if ("Masculino".equalsIgnoreCase(paciente.getSexo())) {
                        rbtnMasculino.setSelected(true);
                    } else if ("Femenino".equalsIgnoreCase(paciente.getSexo())) {
                        rbtnFemenino.setSelected(true);
                    }

                     if (paciente.getFecha_nacimento()!= null) {
                txtFechaNacimiento.setDate(java.sql.Date.valueOf(paciente.getFecha_nacimento()));
                }
                
            if (paciente.getFecha_registro()!= null) {
                txtFechaR.setText(paciente.getFecha_registro().toString()); // o formato personalizado
            }
            this.idActualizar = paciente.getId();
            
            this.activarCtrls(true);
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       try {
        int fila = this.tblLista.getSelectedRow();
        if(fila < 0){
            JOptionPane.showMessageDialog(this, "Seleccione un Paciente para eliminar");
            return;
        }

        Paciente objP = (Paciente) this.mtp.getPaciente(fila);

        int confirm = JOptionPane.showConfirmDialog(this, "¿Está seguro de eliminar al paciente?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            this.gestPaciente.eliminar(objP.getId()); // Solo cambia estado a 0
            this.tablaPaciente(); // Recarga solo pacientes con estado = 1
            this.limpiarFormulario(); 
            this.activarCtrls(false); 
        }

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: NO se pudo eliminar el Paciente\n" + e.getMessage());
    }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
           try {
        this.validarDatos(); // Llama a la validación

        Paciente objP = new Paciente();

        objP.setNombres(txtNombres.getText().trim());
        objP.setApellidos(txtApellidos.getText().trim());
        objP.setDni(txtDni.getText().trim());
        objP.setTelefono(txtTelefono.getText().trim());
        objP.setCorreo(txtCorreo.getText().trim());
        objP.setDireccion(txtDireccion.getText().trim());
        objP.setLugar_nacimiento(txtLugar.getText().trim());
        objP.setEstado_civil(txtEstadiCivil.getText().trim());
        objP.setDatos_del_Apoderado(txtApoderado.getText().trim());

        // Sexo
        if (rbtnMasculino.isSelected()) {
            objP.setSexo("Masculino");
        } else if (rbtnFemenino.isSelected()) {
            objP.setSexo("Femenino");
        }

        // Fechas
        if (txtFechaNacimiento.getDate() != null) {
            LocalDate fechaNacimiento = txtFechaNacimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            objP.setFecha_nacimento(fechaNacimiento);
        }

        objP.setFecha_registro(LocalDate.now());

        if (idActualizar == -1) {
            // CREAR
            gestPaciente.crear(objP);
        } else {
            // ACTUALIZAR
            objP.setId(idActualizar); // Recupera ID original
            gestPaciente.actualizar(objP.getId(), objP);
            idActualizar = -1;
        }

        tablaPaciente(); // Recarga
        limpiarFormulario();
        activarCtrls(false);
        JOptionPane.showMessageDialog(this, "Paciente guardado correctamente.");

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al guardar: " + e.getMessage());
    }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        this.limpiarFormulario();
        this.activarCtrls(true);
        txtFechaR.setText(JIFGPaciente.fechaActual());
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.activarCtrls(false);
        this.limpiarFormulario();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVerDatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtnFemenino;
    private javax.swing.JRadioButton rbtnMasculino;
    private javax.swing.JTable tblLista;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtApoderado;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEstadiCivil;
    private com.toedter.calendar.JDateChooser txtFechaNacimiento;
    private javax.swing.JTextField txtFechaR;
    private javax.swing.JTextField txtLugar;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    private void tablaPaciente(){
        ArrayList arrPaciente = null;
        try {
            //1 Extraer datos de la BD
            GPaciente bdPaciente = new GPaciente();
            arrPaciente = bdPaciente.listar();
            //2 Enviar los datos obtenido al modelo Tabla 
            mtp.setListPaciente(arrPaciente);
        } catch (Exception e) {
        }
    }
   private void limpiarFormulario() {
        this.txtNombres.setText(""); 
        this.txtApellidos.setText("");
        this.txtCorreo.setText("");
        this.txtDni.setText("");
        this.txtTelefono.setText("");
        this.txtDireccion.setText("");
        this.txtFechaR.setText("");
        this.txtFechaNacimiento.setDate(null);
        this.txtLugar.setText("");
        this.txtEstadiCivil.setText("");
        this.txtApoderado.setText("");
        this.rbtnFemenino.setSelected(false);
        this.rbtnMasculino.setSelected(false);
}
private void activarCtrls(boolean valor){
        this.txtNombres.setEnabled(valor);
        this.txtApellidos.setEnabled(valor);
        this.txtCorreo.setEnabled(valor);
        this.txtDni.setEnabled(valor);
        this.txtTelefono.setEnabled(valor);
        this.txtDireccion.setEnabled(valor);
        this.txtFechaR.setEnabled(valor);
        this.txtFechaNacimiento.setEnabled(valor);
        this.txtLugar.setEnabled(valor);
        this.txtEstadiCivil.setEnabled(valor);
        this.txtApoderado.setEnabled(valor);
        this.rbtnFemenino.setEnabled(valor);
        this.rbtnMasculino.setEnabled(valor);
        this.btnGuardar.setEnabled(valor);
    }

    private void buscarPorDni(String dni) {
    try {
        Paciente paciente = gestPaciente.buscarPorDni(dni); // Asegúrate de que este método exista en GPaciente
        
        JOptionPane.showMessageDialog(this, paciente.verDatos(), "DATOS DEL PACIENTE", JOptionPane.PLAIN_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al buscar paciente: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    private void validarDatos() throws Exception {
    // Validación de campos vacíos o nulos
    if (txtNombres.getText().trim().isEmpty())
        throw new Exception("El campo 'Nombres' no puede estar vacío.");

    if (txtApellidos.getText().trim().isEmpty())
        throw new Exception("El campo 'Apellidos' no puede estar vacío.");

    if (txtDni.getText().trim().isEmpty())
        throw new Exception("El campo 'DNI' no puede estar vacío.");
    else if (!txtDni.getText().matches("\\d{8}"))
        throw new Exception("El DNI debe tener 8 dígitos numéricos.");

    if (!rbtnMasculino.isSelected() && !rbtnFemenino.isSelected())
        throw new Exception("Debe seleccionar el sexo.");

    if (txtTelefono.getText().trim().isEmpty())
        throw new Exception("El campo 'Teléfono' no puede estar vacío.");
    else if (!txtTelefono.getText().matches("\\d{9}"))
        throw new Exception("El teléfono debe tener 9 dígitos.");

    if (txtCorreo.getText().trim().isEmpty())
        throw new Exception("El campo 'Correo' no puede estar vacío.");
    else if (!txtCorreo.getText().matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$"))
        throw new Exception("El correo no tiene un formato válido.");

    if (txtDireccion.getText().trim().isEmpty())
        throw new Exception("El campo 'Dirección' no puede estar vacío.");

    if (txtLugar.getText().trim().isEmpty())
        throw new Exception("El campo 'Lugar de nacimiento' no puede estar vacío.");

    if (txtEstadiCivil.getText().trim().isEmpty())
        throw new Exception("El campo 'Estado civil' no puede estar vacío.");

    if (txtApoderado.getText().trim().isEmpty())
        throw new Exception("El campo 'Apoderado' no puede estar vacío.");

    if (txtFechaNacimiento.getDate() == null)
        throw new Exception("Debe seleccionar la 'Fecha de nacimiento'.");

    // Validar que la fecha no sea futura
    LocalDate fechaNacimiento = txtFechaNacimiento.getDate()
            .toInstant()
            .atZone(ZoneId.systemDefault())
            .toLocalDate();
    if (fechaNacimiento.isAfter(LocalDate.now()))
        throw new Exception("La 'Fecha de nacimiento' no puede ser una fecha futura.");
}
}
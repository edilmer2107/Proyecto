
package Views;

import Controllers.GHistoria;
import Entidades.Historia;
import Models.M_Historia;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import Controllers.GPaciente;
import Controllers.GMedico;
import Controllers.GEspecialidad;
import Entidades.Paciente;
import Entidades.Medico;
import Entidades.Especialidad;
import Models.MC_Especialidad;
import Models.M_Medico;
import javax.swing.DefaultComboBoxModel;


public class JIFGMedicinaGeneral extends javax.swing.JInternalFrame {
    private static JIFGMedicinaGeneral instancia;
    
    private ArrayList<Paciente> listpPacientes = new ArrayList<>();
    
    private boolean estaEditado = false;
    private int indiceSeleccionado = -1;
    private  int idActualizar = -1;
    GHistoria gestMedicina = new GHistoria();
    M_Historia mtM = new M_Historia(); 
    M_Historia mtE = mtM; // ✅ Solución para que NetBeans no lance error

        
    private JIFGMedicinaGeneral() {
    initComponents();
    tblLista.setModel(mtM);

    
    this.activarCtrls(false);
    this.tablaMedicinaGeneral();
    cargarPacientes();
    cargarMedicos();
    cargarAreas();

     txtBuscar1.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
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


    public static JIFGMedicinaGeneral getInstancia(){
        if(instancia == null || instancia.isClosed()){
            instancia = new JIFGMedicinaGeneral();
        }
        return instancia;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMotivo = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        cmboxArea = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cmboxPaciente = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        cmboxMedico = new javax.swing.JComboBox<>();
        btnBuscar1 = new javax.swing.JButton();
        txtBuscar1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnVerDatos = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblLista = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();

        setTitle("AREA MEDICINA GENERAL");

        txtMotivo.setColumns(20);
        txtMotivo.setRows(5);
        jScrollPane1.setViewportView(txtMotivo);

        txtObservaciones.setColumns(20);
        txtObservaciones.setRows(5);
        jScrollPane2.setViewportView(txtObservaciones);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel3.setText("Area");

        cmboxPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmboxPacienteActionPerformed(evt);
            }
        });

        jLabel1.setText("Paciente");

        jLabel2.setText("Medico Responsable");

        jLabel4.setText("Motivo Consulta");

        jLabel5.setText("Observaciones");

        jLabel6.setText("Fecha");

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

        cmboxMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmboxMedicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cmboxArea, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmboxPaciente, 0, 212, Short.MAX_VALUE)
                                    .addComponent(cmboxMedico, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(75, 75, 75))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmboxPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(cmboxMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmboxArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnCancelar)
                    .addComponent(btnGuardar)))
        );

        btnBuscar1.setText("Buscar");
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
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

        tblLista.setModel(this.mtE);
        jScrollPane3.setViewportView(tblLista);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 2, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(txtBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(54, 54, 54))
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar1)
                    .addComponent(txtBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public static String fechaActual(){
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        return formatoFecha.format(fecha);
    }
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
    try {
        
        // === Validaciones antes de guardar ===

        if (cmboxPaciente.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un paciente.", "Validación", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (cmboxMedico.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un médico responsable.", "Validación", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (cmboxArea.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un área o especialidad.", "Validación", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (txtMotivo.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el motivo de consulta.", "Validación", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (txtObservaciones.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar las observaciones.", "Validación", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Solo si pasa todas las validaciones, se continúa:
        Historia historia = new Historia();
       

        historia.setMotivoConsulta(txtMotivo.getText().trim());
        historia.setObservaciones(txtObservaciones.getText().trim());

        // Obtener objeto Paciente del ComboBox
        Paciente paciente = (Paciente) cmboxPaciente.getSelectedItem();
        Medico medico = (Medico) cmboxMedico.getSelectedItem();
        Especialidad area = (Especialidad) cmboxArea.getSelectedItem();

        historia.setPaciente(paciente);
        historia.setMedico(medico);
        historia.setEspecialidad(area);

        historia.setFechaRegistro(LocalDate.now());

        if (idActualizar == -1) {
            // Crear nueva historia
            gestMedicina.crear(historia);
        } else {
            // Actualizar historia existente
            historia.setId(idActualizar);
            gestMedicina.actualizar(idActualizar, historia);
            idActualizar = -1;
        }

        tablaMedicinaGeneral();
        limpiarFormulario();
        activarCtrls(false);

        JOptionPane.showMessageDialog(this, "Historia guardada correctamente.");

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al guardar historia: " + e.getMessage());
        e.printStackTrace();
    }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        this.limpiarFormulario();
        this.activarCtrls(true);
        txtFecha.setText(JIFGPaciente.fechaActual());
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.activarCtrls(false);
        this.limpiarFormulario();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
   
    }//GEN-LAST:event_btnBuscar1ActionPerformed

    private void btnVerDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerDatosActionPerformed
        int indiceSeleccionado = this.tblLista.getSelectedRow();
        if(indiceSeleccionado >=0){
            Historia objP = this.mtM.getHistoria(indiceSeleccionado);
            JOptionPane.showMessageDialog(this, objP.verDatos(), "DATOS DEL PACIENTE", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_btnVerDatosActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
    int fila = tblLista.getSelectedRow();
    if (fila == -1) {
        JOptionPane.showMessageDialog(this, "Selecciona una fila.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        return;
    }

    Historia h = mtM.getHistoria(fila);
    System.out.println("MODIFICAR: Historia seleccionada con ID: " + h.getId());

    cmboxPaciente.setSelectedItem(h.getPaciente());
    cmboxMedico.setSelectedItem(h.getMedico());
    cmboxArea.setSelectedItem(h.getEspecialidad());
    txtFecha.setText(h.getFecha().toString());
    txtMotivo.setText(h.getMotivo_consulta());
    txtObservaciones.setText(h.getObservaciones());

    idActualizar = h.getId();
    estaEditado = true;

    activarCtrls(true);



    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
    int fila = tblLista.getSelectedRow();
if (fila == -1) {
    JOptionPane.showMessageDialog(this, "Selecciona una fila.", "Advertencia", JOptionPane.WARNING_MESSAGE);
    return;
}

Historia h = mtM.getHistoria(fila);
int rpta = JOptionPane.showConfirmDialog(this, "¿Deseas eliminar esta historia?", "Confirmar", JOptionPane.YES_NO_OPTION);
if (rpta == JOptionPane.YES_OPTION) {
    try {
        gestMedicina.eliminar(h.getId());
        JOptionPane.showMessageDialog(this, "Eliminado correctamente.");
        tablaMedicinaGeneral(); // recarga la tabla
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
    }
}


    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void cmboxPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmboxPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmboxPacienteActionPerformed

    private void cmboxMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmboxMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmboxMedicoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
         
    String dni = txtBuscar.getText().trim();
    if (!dni.isEmpty()) {
        buscarPorDni(dni); 
    } else {
        JOptionPane.showMessageDialog(null, "Ingrese un DNI para buscar", "Advertencia", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_btnBuscarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVerDatos;
    private javax.swing.JComboBox<String> cmboxArea;
    private javax.swing.JComboBox<String> cmboxMedico;
    private javax.swing.JComboBox<String> cmboxPaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblLista;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtBuscar1;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextArea txtMotivo;
    private javax.swing.JTextArea txtObservaciones;
    // End of variables declaration//GEN-END:variables

private void tablaMedicinaGeneral() {
    try {
        GHistoria gest = new GHistoria();
        ArrayList<Historia> lista = gest.listarPorEspecialidad(3); // ID 3 = Medicina General

        if (lista != null && !lista.isEmpty()) {
            mtM.setListHistoria(lista);
            tblLista.setModel(mtM);
            tblLista.repaint();
        } else {
            JOptionPane.showMessageDialog(this, 
                "No se encontraron registros de historias médicas en Medicina General", 
                "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, 
            "Error al cargar historias: " + e.getMessage(), 
            "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
}
   private void limpiarFormulario() {
   
    txtMotivo.setText("");
    txtObservaciones.setText("");
    txtFecha.setText("");
    cmboxPaciente.setSelectedIndex(0);
    cmboxMedico.setSelectedIndex(0);
    cmboxArea.setSelectedIndex(0);
    txtBuscar.setText("");
}
private void activarCtrls(boolean valor){
      
    txtMotivo.setEnabled(valor);
    txtObservaciones.setEnabled(valor);
    cmboxPaciente.setEnabled(valor);
    cmboxMedico.setEnabled(valor);
    cmboxArea.setEnabled(valor);
    txtFecha.setEnabled(false); // La fecha no se edita
    btnGuardar.setEnabled(valor);
    btnCancelar.setEnabled(valor);
    btnNuevo.setEnabled(!valor);


    }

    /*private void buscarPorDni(String dni) {
    try {
        Paciente paciente = gestEnferme.buscarPorDni(dni); // Asegúrate de que este método exista en GPaciente
        
       
        
        //JOptionPane.showMessageDialog(this, paciente.verDatos(), "DATOS DEL PACIENTE", JOptionPane.PLAIN_MESSAGE);
        
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al buscar paciente: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}
*/
private void cargarPacientes() {
    try {
        GPaciente gp = new GPaciente();
        listpPacientes = gp.listar();  // Lista de objetos

        cmboxPaciente.removeAllItems();
        for (Paciente p : listpPacientes) {
            cmboxPaciente.addItem(p.getNombres() + " " + p.getApellidos());
        }
    } catch (Exception e) {
        // …
    }
}


private void cargarMedicos() {
    try {
        GMedico gm = new GMedico();
        ArrayList<Medico> lista = gm.listarPorEspecialidad(3); // ✅ Solo médicos de Medicina General (ID 3)

        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        for (Medico m : lista) {
            modelo.addElement(m.getNombres() + " " + m.getApellidos()); // O simplemente modelo.addElement(m);
        }
        cmboxMedico.setModel(modelo);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al cargar médicos: " + e.getMessage());
    }
}


private void cargarAreas() {
    try {
        GEspecialidad ge = new GEspecialidad();
        ArrayList<Especialidad> lista = ge.listar(); // Asegúrate que tu clase lo tenga

        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        for (Especialidad e : lista) {
            if (e.getId() == 3) { // SOLO la especialidad Medicina General
                modelo.addElement(e); // agrega el objeto, no texto
            }
        }
        cmboxArea.setModel(modelo);
        cmboxArea.setEnabled(false);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al cargar áreas: " + e.getMessage());
    }
}


private void buscarPorDni(String dni) {
    try {
        GPaciente gestPaciente = new GPaciente();
        Paciente paciente = gestPaciente.buscarPorDni(dni);

        if (paciente != null) {
            // Limpiar lista y combo
            listpPacientes.clear();
            cmboxPaciente.removeAllItems();

            // Agregar solo el paciente encontrado
            listpPacientes.add(paciente);
            cmboxPaciente.addItem(paciente.getNombres() + " " + paciente.getApellidos());
            cmboxPaciente.setSelectedIndex(0); // Lo selecciona directamente

        } else {
            JOptionPane.showMessageDialog(this, "No se encontró paciente con ese DNI", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al buscar paciente: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}


private void filtrar() {
    String texto = txtBuscar1.getText().trim();
    if (!texto.isEmpty()) {
        try {
            GHistoria gh = new GHistoria();
            ArrayList<Historia> resultados = new ArrayList<>();
            for (Historia h : gh.buscarPorNombreODni(texto)) {
                if (h.getEspecialidad().getId() == 3) { // Solo Medicina General
                    resultados.add(h);
                }
            }

            mtM.setListHistoria(resultados);
            tblLista.setModel(mtM);
            tblLista.repaint();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al buscar: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        tablaMedicinaGeneral();
    }
}


}

   

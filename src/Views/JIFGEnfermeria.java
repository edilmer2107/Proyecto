
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
import Models.MC_Paciente;
import Models.M_Medico;
import javax.swing.DefaultComboBoxModel;


public class JIFGEnfermeria extends javax.swing.JInternalFrame {
    private static JIFGEnfermeria instancia;
    private ArrayList<Paciente> listaPacientes = new ArrayList<>();

    private boolean estaEditado = false;
    private int indiceSeleccionado = -1;
    private  int idActualizar = -1;
    GHistoria gestEnferme = new GHistoria();
    M_Historia mtE = new M_Historia();
    MC_Paciente mCP = new MC_Paciente();

    private ArrayList<Paciente> listpPacientes = new ArrayList<>();
    private ArrayList<Medico> listaMedicos = new ArrayList<>();
    
    private JIFGEnfermeria() {
        initComponents();

        
        this.activarCtrls(false);
        this.tablaEnfermeria();
    // estos métodos llenan los ComboBox con datos desde la BD
        
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
    public static JIFGEnfermeria getInstancia(){
        if(instancia == null || instancia.isClosed()){
            instancia = new JIFGEnfermeria();
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
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                            .addComponent(jLabel6))))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(200, 418, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscar)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmboxPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cmboxMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmboxArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNuevo)
                            .addComponent(btnCancelar)
                            .addComponent(btnGuardar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
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
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 27, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnVerDatos)
                .addGap(26, 26, 26)
                .addComponent(btnModificar)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
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
                                .addComponent(txtBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
        if (cmboxPaciente.getSelectedIndex() == -1 ||
            cmboxMedico.getSelectedIndex() == -1 ||
            cmboxArea.getSelectedIndex() == -1 ||
            txtMotivo.getText().trim().isEmpty() ||
            txtObservaciones.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Validación", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Historia historia = new Historia();
        historia.setMotivoConsulta(txtMotivo.getText().trim());
        historia.setObservaciones(txtObservaciones.getText().trim());

        // ✅ Recuperamos el objeto real desde la lista
        Paciente paciente = listpPacientes.get(cmboxPaciente.getSelectedIndex());
        Medico medico = listaMedicos.get(cmboxMedico.getSelectedIndex());

        GEspecialidad ge = new GEspecialidad();
        Especialidad area = ge.buscarPorNombre("Enfermería");

        historia.setPaciente(paciente);
        historia.setMedico(medico);
        historia.setEspecialidad(area);
        historia.setFechaRegistro(LocalDate.now());

        if (idActualizar == -1) {
            gestEnferme.crear(historia);
        } else {
            historia.setId(idActualizar);
            gestEnferme.actualizar(idActualizar, historia);
            idActualizar = -1;
        }

        tablaEnfermeria();
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
 /*
    String texto = txtBuscar1.getText().trim();
System.out.println("Valor de texto: [" + texto + "]");


    if (!texto.isEmpty()) {
        try {
            GHistoria gh = new GHistoria();
            ArrayList<Historia> resultados = gh.buscarPorNombreODni(texto);

            if (!resultados.isEmpty()) {
                mtE.setListHistoria(resultados); // este actualiza el modelo de tabla
                tblLista.setModel(mtE);          // lo recarga en la tabla
                tblLista.repaint();              // refresca la vista
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró ninguna historia con ese nombre o DNI.");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al buscar: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Ingrese un DNI o nombre para buscar.");
    }
 */   

    }//GEN-LAST:event_btnBuscar1ActionPerformed

    private void btnVerDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerDatosActionPerformed
        int indiceSeleccionado = this.tblLista.getSelectedRow();
        if(indiceSeleccionado >=0){
            Historia objP = this.mtE.getHistoria(indiceSeleccionado);
            JOptionPane.showMessageDialog(this, objP.verDatos(), "DATOS DEL PACIENTE", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_btnVerDatosActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
    int filaSeleccionada = tblLista.getSelectedRow();
    
    if (filaSeleccionada < 0) {
        JOptionPane.showMessageDialog(this, "Seleccione una fila para modificar", "Aviso", JOptionPane.WARNING_MESSAGE);
        return;
    }

    Historia historia = mtE.getHistoria(filaSeleccionada); // Obtener la historia desde el modelo

    if (historia != null) {
        idActualizar = historia.getId(); // Guardar el ID para actualizar luego
        cmboxPaciente.setSelectedItem(historia.getPaciente());
        cmboxMedico.setSelectedItem(historia.getMedico());
        cmboxArea.setSelectedItem(historia.getEspecialidad());
        txtMotivo.setText(historia.getMotivo_consulta());
        txtObservaciones.setText(historia.getObservaciones());
        txtFecha.setText(historia.getFecha().toString());

        activarCtrls(true); // Habilita los controles
    } else {
        JOptionPane.showMessageDialog(this, "No se pudo obtener la historia seleccionada", "Error", JOptionPane.ERROR_MESSAGE);
    }


    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
    int filaSeleccionada = tblLista.getSelectedRow();

    if (filaSeleccionada < 0) {
        JOptionPane.showMessageDialog(this, "Seleccione un registro para eliminar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Confirmación antes de eliminar
    int confirmacion = JOptionPane.showConfirmDialog(this,
            "¿Está seguro de que desea eliminar esta historia médica?",
            "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

    if (confirmacion == JOptionPane.YES_OPTION) {
        try {
            // Obtener la historia seleccionada del modelo
            Historia historiaSeleccionada = mtE.getHistoria(filaSeleccionada);

            // Llamar al método eliminar del controlador
            gestEnferme.eliminar(historiaSeleccionada.getId());

            // Actualizar la tabla
            tablaEnfermeria();

            // Limpiar formulario por si acaso se estaba editando
            limpiarFormulario();

            JOptionPane.showMessageDialog(this, "Historia eliminada correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al eliminar historia: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
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
private void tablaEnfermeria() {
    try {
        GHistoria bdEnfermeria = new GHistoria();
        ArrayList<Historia> arrEnferme = bdEnfermeria.listarPorEspecialidad(2); // Solo ENFERMERÍA

        if (arrEnferme != null && !arrEnferme.isEmpty()) {
            mtE.setListHistoria(arrEnferme);
            tblLista.setModel(mtE);
            tblLista.repaint();
        } else {
            JOptionPane.showMessageDialog(this, 
                "No se encontraron registros de historias médicas de Enfermería", 
                "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, 
            "Error al cargar datos: " + e.getMessage(), 
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
        listpPacientes = gp.listar(); // Guardamos todos los pacientes en la lista

        cmboxPaciente.removeAllItems(); // Limpiar el combo

        for (Paciente p : listpPacientes) {
            cmboxPaciente.addItem(p.getNombres() + " " + p.getApellidos()); // solo mostramos el nombre
        }

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al cargar pacientes: " + e.getMessage());
        e.printStackTrace();
    }
}

private void cargarMedicos() {
    try {
        GMedico gm = new GMedico();
        listaMedicos = gm.listarPorEspecialidad(2); // ✅ Solo médicos de ENFERMERÍA por ID

        cmboxMedico.removeAllItems();
        for (Medico m : listaMedicos) {
            cmboxMedico.addItem(m.getNombres() + " " + m.getApellidos());
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al cargar médicos: " + e.getMessage());
    }
}




private void cargarAreas() {
    try {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement("Enfermería");
        cmboxArea.setModel(modelo);
        cmboxArea.setEnabled(false); // Desactiva el combo
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al cargar área: " + e.getMessage());
    }
}


private void buscarPorDni(String dni) {
    try {
        System.out.println("Buscando DNI: " + dni); // Para verificar en consola

        GPaciente gestPaciente = new GPaciente();
        Paciente paciente = gestPaciente.buscarPorDni(dni);

        if (paciente != null) {
            System.out.println("Paciente encontrado: " + paciente.getNombres());
            
            JOptionPane.showMessageDialog(this, paciente.verDatos(), "DATOS DEL PACIENTE", JOptionPane.PLAIN_MESSAGE);
            
             // Crear una nueva lista con solo ese paciente
            ArrayList<Paciente> lista = new ArrayList<>();
            lista.add(paciente);

            // Actualizar el modelo del combo
            mCP.setListaPacientes(lista);

            // Seleccionar el paciente automáticamente
            mCP.setSelectedItem(paciente);
            
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
                if (h.getEspecialidad().getId() == 2) { // Solo Enfermería
                    resultados.add(h);
                }
            }

            mtE.setListHistoria(resultados);
            tblLista.setModel(mtE);
            tblLista.repaint();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al buscar: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        tablaEnfermeria(); // Si está vacío, recarga Enfermería
    }
}

}

   

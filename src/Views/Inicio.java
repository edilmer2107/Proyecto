
package Views;

import javax.swing.JInternalFrame;

public class Inicio extends javax.swing.JFrame {

    public Inicio() {
        initComponents();
        this.setLocation(0,0);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem4 = new javax.swing.JMenuItem();
        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        PACIENTES = new javax.swing.JMenu();
        mnlmPaciente = new javax.swing.JMenuItem();
        MÉDICOS = new javax.swing.JMenu();
        mnItmMedico = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnItmEnfermeria = new javax.swing.JMenuItem();
        mnItmMedicinaGeneral = new javax.swing.JMenuItem();
        mnItmObstetricia = new javax.swing.JMenuItem();
        mnItmOdontologia = new javax.swing.JMenuItem();
        mnItmPsicologia = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        mnItmHistoria = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnItmReportesDiarios = new javax.swing.JMenuItem();
        mnItmReportesSemanales = new javax.swing.JMenuItem();
        mnItmReportesMensuales = new javax.swing.JMenuItem();
        mnItmReportesMotivos = new javax.swing.JMenuItem();
        mnItmReporteArea = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PACIENTES.setMnemonic('e');
        PACIENTES.setText("PACIENTES");

        mnlmPaciente.setMnemonic('y');
        mnlmPaciente.setText("Paciente");
        mnlmPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnlmPacienteActionPerformed(evt);
            }
        });
        PACIENTES.add(mnlmPaciente);

        menuBar.add(PACIENTES);

        MÉDICOS.setText("MEDICO");

        mnItmMedico.setText("Registrar Medico");
        mnItmMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItmMedicoActionPerformed(evt);
            }
        });
        MÉDICOS.add(mnItmMedico);

        menuBar.add(MÉDICOS);

        jMenu2.setText("AREAS");

        mnItmEnfermeria.setText("Enfermería");
        mnItmEnfermeria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItmEnfermeriaActionPerformed(evt);
            }
        });
        jMenu2.add(mnItmEnfermeria);

        mnItmMedicinaGeneral.setText("Medicina General");
        mnItmMedicinaGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItmMedicinaGeneralActionPerformed(evt);
            }
        });
        jMenu2.add(mnItmMedicinaGeneral);

        mnItmObstetricia.setText("Obstetricia");
        mnItmObstetricia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItmObstetriciaActionPerformed(evt);
            }
        });
        jMenu2.add(mnItmObstetricia);

        mnItmOdontologia.setText("Odontología");
        mnItmOdontologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItmOdontologiaActionPerformed(evt);
            }
        });
        jMenu2.add(mnItmOdontologia);

        mnItmPsicologia.setText("Psicología");
        mnItmPsicologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItmPsicologiaActionPerformed(evt);
            }
        });
        jMenu2.add(mnItmPsicologia);

        menuBar.add(jMenu2);

        jMenu1.setText("HISTORIAS");

        mnItmHistoria.setText("Historias");
        mnItmHistoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItmHistoriaActionPerformed(evt);
            }
        });
        jMenu1.add(mnItmHistoria);

        menuBar.add(jMenu1);

        jMenu3.setText("REPORTES");

        mnItmReportesDiarios.setText("Reportes diarios");
        mnItmReportesDiarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItmReportesDiariosActionPerformed(evt);
            }
        });
        jMenu3.add(mnItmReportesDiarios);

        mnItmReportesSemanales.setText("Reportes semanales");
        mnItmReportesSemanales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItmReportesSemanalesActionPerformed(evt);
            }
        });
        jMenu3.add(mnItmReportesSemanales);

        mnItmReportesMensuales.setText("Reportes Mensuales");
        mnItmReportesMensuales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItmReportesMensualesActionPerformed(evt);
            }
        });
        jMenu3.add(mnItmReportesMensuales);

        mnItmReportesMotivos.setText("Reportes por consultas ");
        mnItmReportesMotivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItmReportesMotivosActionPerformed(evt);
            }
        });
        jMenu3.add(mnItmReportesMotivos);

        mnItmReporteArea.setText("Reportes por área");
        mnItmReporteArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItmReporteAreaActionPerformed(evt);
            }
        });
        jMenu3.add(mnItmReporteArea);

        menuBar.add(jMenu3);

        helpMenu.setMnemonic('h');
        helpMenu.setText("AYUDA");

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Contents");
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnlmPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnlmPacienteActionPerformed
        JIFGPaciente jif = JIFGPaciente.getInstancia();
       mostrarVentana(jif);
    }//GEN-LAST:event_mnlmPacienteActionPerformed

    private void mnItmMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItmMedicoActionPerformed
        JIFGMedico jif = JIFGMedico.getInstancia();
        mostrarVentana(jif);
    }//GEN-LAST:event_mnItmMedicoActionPerformed

    private void mnItmHistoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItmHistoriaActionPerformed
        JIFGHistoria jif = JIFGHistoria.getInstancia();
        mostrarVentana(jif);
    }//GEN-LAST:event_mnItmHistoriaActionPerformed

    private void mnItmEnfermeriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItmEnfermeriaActionPerformed
        JIFGEnfermeria jif = JIFGEnfermeria.getInstancia().getInstancia();
        mostrarVentana(jif);
    }//GEN-LAST:event_mnItmEnfermeriaActionPerformed

    private void mnItmMedicinaGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItmMedicinaGeneralActionPerformed
        JIFGMedicinaGeneral jif = JIFGMedicinaGeneral.getInstancia();
        mostrarVentana(jif);
    }//GEN-LAST:event_mnItmMedicinaGeneralActionPerformed

    private void mnItmObstetriciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItmObstetriciaActionPerformed
        JIFGObstetricia jif = JIFGObstetricia.getInstancia().getInstancia();
        mostrarVentana(jif);
    }//GEN-LAST:event_mnItmObstetriciaActionPerformed

    private void mnItmOdontologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItmOdontologiaActionPerformed
        JIFGOdontologia jif = JIFGOdontologia.getInstancia().getInstancia();
        mostrarVentana(jif);
    }//GEN-LAST:event_mnItmOdontologiaActionPerformed

    private void mnItmPsicologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItmPsicologiaActionPerformed
        JIFGPSicologia jif = JIFGPSicologia.getInstancia().getInstancia();
        mostrarVentana(jif);
    }//GEN-LAST:event_mnItmPsicologiaActionPerformed

    private void mnItmReportesDiariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItmReportesDiariosActionPerformed
        JIFGReportesDiarios jif = JIFGReportesDiarios.getInstancia();
        mostrarVentana(jif);
    }//GEN-LAST:event_mnItmReportesDiariosActionPerformed

    private void mnItmReportesSemanalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItmReportesSemanalesActionPerformed
        JIFGReportesSemanales jif = JIFGReportesSemanales.getInstancia();
        mostrarVentana(jif);
    }//GEN-LAST:event_mnItmReportesSemanalesActionPerformed

    private void mnItmReportesMensualesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItmReportesMensualesActionPerformed
        JIFGReportesMensuales jif = JIFGReportesMensuales.getInstancia();
        mostrarVentana(jif);
    }//GEN-LAST:event_mnItmReportesMensualesActionPerformed

    private void mnItmReportesMotivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItmReportesMotivosActionPerformed
        JIFGReportesMotivoConsulta jif = JIFGReportesMotivoConsulta.getInstancia();
        mostrarVentana(jif);
    }//GEN-LAST:event_mnItmReportesMotivosActionPerformed

    private void mnItmReporteAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItmReporteAreaActionPerformed
        JIFGReportesArea jif = JIFGReportesArea.getInstancia();
        mostrarVentana(jif);
    }//GEN-LAST:event_mnItmReporteAreaActionPerformed

   
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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MÉDICOS;
    private javax.swing.JMenu PACIENTES;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem mnItmEnfermeria;
    private javax.swing.JMenuItem mnItmHistoria;
    private javax.swing.JMenuItem mnItmMedicinaGeneral;
    private javax.swing.JMenuItem mnItmMedico;
    private javax.swing.JMenuItem mnItmObstetricia;
    private javax.swing.JMenuItem mnItmOdontologia;
    private javax.swing.JMenuItem mnItmPsicologia;
    private javax.swing.JMenuItem mnItmReporteArea;
    private javax.swing.JMenuItem mnItmReportesDiarios;
    private javax.swing.JMenuItem mnItmReportesMensuales;
    private javax.swing.JMenuItem mnItmReportesMotivos;
    private javax.swing.JMenuItem mnItmReportesSemanales;
    private javax.swing.JMenuItem mnlmPaciente;
    // End of variables declaration//GEN-END:variables
private void mostrarVentana(JInternalFrame jif){
        if(!jif.isVisible()){
            desktopPane.add(jif);
            jif.setVisible(true);
        }else{
            try {
                jif.setSelected(true);
                jif.toFront();
            } catch (Exception e) {
                System.out.println("Error: "+e.getMessage());
            }
        }
}
}

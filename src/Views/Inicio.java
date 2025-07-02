
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

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        PACIENTES = new javax.swing.JMenu();
        mnlmPaciente = new javax.swing.JMenuItem();
        MÉDICOS = new javax.swing.JMenu();
        mnItmMedico = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

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
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 998, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem mnItmMedico;
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

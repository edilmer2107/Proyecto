
package Views;

import Controllers.GHistoria;
import Entidades.Historia;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;


public class JIFGReportesArea extends javax.swing.JInternalFrame {
private static JIFGReportesArea instancia;

    public static JIFGReportesArea getInstancia() {
        if (instancia == null || instancia.isClosed()) {
            instancia = new JIFGReportesArea();
        }
        return instancia;
    }
    
    private JIFGReportesArea() {
        initComponents();
        reportePorArea();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaTexto = new javax.swing.JTextArea();
        btnSalir1 = new javax.swing.JButton();

        areaTexto.setColumns(20);
        areaTexto.setRows(5);
        jScrollPane1.setViewportView(areaTexto);

        btnSalir1.setBackground(new java.awt.Color(0, 153, 0));
        btnSalir1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnSalir1.setText("Salir");
        btnSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalir1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalir1ActionPerformed

private void reportePorArea() {
    try {
        GHistoria gestor = new GHistoria();
        ArrayList<Historia> lista = gestor.listar();

        Map<String, Long> conteoEspecialidades = new HashMap<>();

        for (Historia h : lista) {
            String nombreEsp = h.getEspecialidad().getTipoE();
            conteoEspecialidades.put(nombreEsp, conteoEspecialidades.getOrDefault(nombreEsp, 0L) + 1);
        }

        if (conteoEspecialidades.isEmpty()) {
            areaTexto.setText("No hay registros para generar reporte.");
            return;
        }

        // Encontrar área con más atenciones
        String areaTop = Collections.max(conteoEspecialidades.entrySet(), Map.Entry.comparingByValue()).getKey();

        StringBuilder sb = new StringBuilder();
        sb.append("📊 Reporte por ÁREA (Especialidad)\n\n");

        for (Map.Entry<String, Long> entry : conteoEspecialidades.entrySet()) {
            sb.append("🔹 ").append(entry.getKey()).append(": ").append(entry.getValue()).append(" atenciones");
            if (entry.getKey().equals(areaTop)) {
                sb.append(" 🏆 (Mayor cantidad)");
            }
            sb.append("\n");
        }

        areaTexto.setText(sb.toString());

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al generar reporte por área: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaTexto;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

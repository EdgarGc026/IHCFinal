package view;

import java.util.ArrayList;
import models.Pregunta;

public class ventanaQuiz extends javax.swing.JFrame {
    //Variables necesarias
    public static ArrayList<Pregunta> preguntas;
    Pregunta pregunta = null;
    int posicion = 0;
    
    /**
     * Creates new form ventanaEjercicios
     */
    public ventanaQuiz() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("¿Quien quiere ser millonario");
        
        
        /*
        btnTerminarExamen.setEnabled(false);
        
        if(DatosQuiz.preguntas.size() > 0){
            setPreguntasRespuestas();
            
            btnRegresar.setEnabled(false);
            
            if(DatosQuiz.preguntas.size() == 1){
                btnTerminarExamen.setEnabled(true);
            }else{
                btnTerminarExamen.setEnabled(false);
            }
        }else{
            btnTerminarExamen.setEnabled(false);
            btnRegresar.setEnabled(false);
            btnAvanzar.setEnabled(false);
        }
        */
    }
     
    /*
    private void setPreguntasRespuestas(){
        btnGrupoRespuesta.clearSelection();
        
        Pregunta pregunta = DatosQuiz.preguntas.get(posicion);
        
        lblPreguntaMostrada.setText(pregunta.Text);
        
        rbtnOpcionRespuesta1.setText(pregunta.respuestas.get(0).Text);
        rbtnOpcionRespuesta1.setSelected(pregunta.respuestas.get(0).Selected);
        rbtnOpcionRespuesta1.requestFocus();
        
        rbtnOpcionRespuesta2.setText(pregunta.respuestas.get(1).Text);
        rbtnOpcionRespuesta2.setSelected(pregunta.respuestas.get(1).Selected);

        rbtnOpcionRespuesta3.setText(pregunta.respuestas.get(2).Text);
        rbtnOpcionRespuesta3.setSelected(pregunta.respuestas.get(2).Selected);

        rbtnOpcionRespuesta4.setText(pregunta.respuestas.get(3).Text);
        rbtnOpcionRespuesta4.setSelected(pregunta.respuestas.get(3).Selected);
    }
        */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrupoRespuesta = new javax.swing.ButtonGroup();
        lblIndicacionesEjercicio = new javax.swing.JLabel();
        rbtnOpcionRespuesta1 = new javax.swing.JRadioButton();
        rbtnOpcionRespuesta2 = new javax.swing.JRadioButton();
        rbtnOpcionRespuesta3 = new javax.swing.JRadioButton();
        rbtnOpcionRespuesta4 = new javax.swing.JRadioButton();
        lblPreguntaMostrada = new javax.swing.JLabel();
        lblNombreFrame = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        btnAvanzar = new javax.swing.JButton();
        btnTerminarExamen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblIndicacionesEjercicio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblIndicacionesEjercicio.setText("Selecciona las respuestas correctas, solo una la correcta");

        btnGrupoRespuesta.add(rbtnOpcionRespuesta1);

        btnGrupoRespuesta.add(rbtnOpcionRespuesta2);

        btnGrupoRespuesta.add(rbtnOpcionRespuesta3);

        btnGrupoRespuesta.add(rbtnOpcionRespuesta4);

        lblPreguntaMostrada.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblPreguntaMostrada.setText("¿Cuanto es 2+ 2?");

        lblNombreFrame.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblNombreFrame.setText("Cuestionario");

        btnRegresar.setText("<<Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnAvanzar.setText("Avanzar>>");

        btnTerminarExamen.setText("Terminar Examen");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 548, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRegresar)
                        .addGap(18, 18, 18)
                        .addComponent(btnAvanzar)
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnTerminarExamen)
                        .addGap(96, 96, 96))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rbtnOpcionRespuesta4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtnOpcionRespuesta1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtnOpcionRespuesta2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtnOpcionRespuesta3, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(lblPreguntaMostrada))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(lblIndicacionesEjercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblNombreFrame)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblNombreFrame)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblIndicacionesEjercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(lblPreguntaMostrada)
                .addGap(54, 54, 54)
                .addComponent(rbtnOpcionRespuesta1)
                .addGap(18, 18, 18)
                .addComponent(rbtnOpcionRespuesta2)
                .addGap(18, 18, 18)
                .addComponent(rbtnOpcionRespuesta3)
                .addGap(18, 18, 18)
                .addComponent(rbtnOpcionRespuesta4)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresar)
                    .addComponent(btnAvanzar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTerminarExamen)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaQuiz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvanzar;
    private javax.swing.ButtonGroup btnGrupoRespuesta;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnTerminarExamen;
    private javax.swing.JLabel lblIndicacionesEjercicio;
    private javax.swing.JLabel lblNombreFrame;
    private javax.swing.JLabel lblPreguntaMostrada;
    private javax.swing.JRadioButton rbtnOpcionRespuesta1;
    private javax.swing.JRadioButton rbtnOpcionRespuesta2;
    private javax.swing.JRadioButton rbtnOpcionRespuesta3;
    private javax.swing.JRadioButton rbtnOpcionRespuesta4;
    // End of variables declaration//GEN-END:variables
}

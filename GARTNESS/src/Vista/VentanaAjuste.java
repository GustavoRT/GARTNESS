/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import java.awt.Color;
import java.awt.event.ActionListener;

/**
 *
 * @author GART
 */
public class VentanaAjuste  extends javax.swing.JFrame {

    /**
     * Creates new form VentanaAjuste
     */
    public VentanaAjuste() {
     
        System.out.println("lanzando dialogo personalizado ...");
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jBColorFondo = new javax.swing.JButton();
        jBColorBotones = new javax.swing.JButton();
        jTfTitulo = new javax.swing.JTextField();
        jBnOk = new javax.swing.JButton();
        jBnCancelar = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 350));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("TITULO VENTANA");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("COLOR FONDO");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("COLOR BOTONES");

        jBColorFondo.setText("COLOR FONDO");

        jBColorBotones.setText("COLOR BOTONES");

        jBnOk.setText("OK");

        jBnCancelar.setText("CANCEL");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTfTitulo)
                    .addComponent(jBColorFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBColorBotones, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBnOk)
                .addGap(52, 52, 52)
                .addComponent(jBnCancelar)
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jBColorFondo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jBColorBotones))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBnOk)
                    .addComponent(jBnCancelar))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBColorBotones;
    private javax.swing.JButton jBColorFondo;
    private javax.swing.JButton jBnCancelar;
    private javax.swing.JButton jBnOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTfTitulo;
    // End of variables declaration//GEN-END:variables

    
    public String getTextoFieldTitulo() {
        return jTfTitulo.getText();
    }
    
        /**
    * Doy control selectivo, sólo a la capacidad de escuchar.
    */
    public void clicBtnOk(ActionListener l){
        jBnOk.addActionListener(l);
    }
    
            /**
    * Doy control selectivo, sólo a la capacidad de escuchar.
    */
    public void clicBtnColorFondo(ActionListener l){
        jBColorFondo.addActionListener(l);
    }

            /**
    * Doy control selectivo, sólo a la capacidad de escuchar.
    */
    public void clicBtnCancel(ActionListener l){
        jBnCancelar.addActionListener(l);
    }
    
   /**
    * Doy control selectivo, sólo a la capacidad de escuchar.
    */
    public void clicBtnColorFondoBotones(ActionListener l){
        jBColorBotones.addActionListener(l);
    }

}

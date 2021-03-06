/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.clientes.vista;

import co.unicauca.clientes.modelo.ClientesDB;
import java.text.DecimalFormat;
import java.util.Observable;
import java.util.Observer;
import javax.swing.SwingConstants;

/**
 *
 * @author Fernando Campo
 */
public class GUIEstadisticasPorSexoGrafico extends javax.swing.JFrame implements Observer{

    /**
     * Creates new form GUIEstadisticasPorSexoGrafico
     */
    public GUIEstadisticasPorSexoGrafico(int h, int v) {
        initComponents();
        setLocation(h, v);
        setVisible(true);
        jPFondo.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPFondo = new javax.swing.JPanel();
        lblMujeres = new javax.swing.JLabel();
        lblPorcentajeMujeres = new javax.swing.JLabel();
        jPBarMujer = new javax.swing.JProgressBar();
        lblHombres = new javax.swing.JLabel();
        lblPorcentajeHombres = new javax.swing.JLabel();
        jPBarHombre = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(303, 330));

        jPFondo.setPreferredSize(new java.awt.Dimension(360, 330));

        lblMujeres.setText("Mujeres");

        lblPorcentajeMujeres.setText("0%");

        jPBarMujer.setForeground(new java.awt.Color(255, 153, 102));
        jPBarMujer.setOrientation(1);
        jPBarMujer.setValue(50);
        jPBarMujer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPBarMujer.setName("barHombres"); // NOI18N

        lblHombres.setText("Hombres");

        lblPorcentajeHombres.setText("0%");

        jPBarHombre.setForeground(new java.awt.Color(255, 153, 102));
        jPBarHombre.setOrientation(1);
        jPBarHombre.setValue(50);
        jPBarHombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPBarHombre.setName("barHombres"); // NOI18N

        javax.swing.GroupLayout jPFondoLayout = new javax.swing.GroupLayout(jPFondo);
        jPFondo.setLayout(jPFondoLayout);
        jPFondoLayout.setHorizontalGroup(
            jPFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPFondoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPFondoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblHombres))
                    .addComponent(jPBarHombre, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPFondoLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lblPorcentajeHombres)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addGroup(jPFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPFondoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblMujeres))
                    .addComponent(jPBarMujer, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPFondoLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lblPorcentajeMujeres)))
                .addGap(31, 31, 31))
        );
        jPFondoLayout.setVerticalGroup(
            jPFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPFondoLayout.createSequentialGroup()
                .addComponent(lblPorcentajeHombres)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPBarHombre, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHombres))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPFondoLayout.createSequentialGroup()
                .addComponent(lblPorcentajeMujeres)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPBarMujer, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMujeres))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(GUIEstadisticasPorSexoGrafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIEstadisticasPorSexoGrafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIEstadisticasPorSexoGrafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIEstadisticasPorSexoGrafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIEstadisticasPorSexoGrafico(400,500).setVisible(true);
            }
        });
    }
    @Override
     public void update(Observable obs, Object obj) {
      ClientesDB cliDB = (ClientesDB) obs;
        this.setTitle("Profesión: " + cliDB.getProfesion());
        graficar(cliDB.getTotalHombres(), cliDB.getTotalMujeres());
     }

    private void graficar(int prmTotalHombre, int prmTotalMujeres){
        jPFondo.setVisible(true);
        Double porcentajeHombres=calcularPorcentajeH(prmTotalHombre, prmTotalMujeres);
        Double porcentajeMujeres=100-porcentajeHombres;
        DecimalFormat formato = new DecimalFormat("#.##");
        lblPorcentajeHombres.setText(formato.format(porcentajeHombres)+"%");
        lblPorcentajeMujeres.setText(formato.format(porcentajeMujeres)+"%");
        jPBarHombre.setValue(porcentajeHombres.intValue());
        jPBarMujer.setValue(porcentajeMujeres.intValue());
    }
    private Double calcularPorcentajeH(int prmTotalHombres, int prmTotalMujeres){
        double total=prmTotalHombres+prmTotalMujeres;
        return (prmTotalHombres*100)/total;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar jPBarHombre;
    private javax.swing.JProgressBar jPBarMujer;
    private javax.swing.JPanel jPFondo;
    private javax.swing.JLabel lblHombres;
    private javax.swing.JLabel lblMujeres;
    private javax.swing.JLabel lblPorcentajeHombres;
    private javax.swing.JLabel lblPorcentajeMujeres;
    // End of variables declaration//GEN-END:variables
}

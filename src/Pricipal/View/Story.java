/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pricipal.View;

import java.awt.event.KeyEvent;

/**
 *
 * @author JCALLE
 */
public class Story extends javax.swing.JFrame {

    /**
     * Creates new form Historia
     */
    public Story() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Desde que Zeus, Poseidón y Hades vencieron a su padre Cronos, la decisión de Zeus de tomar el liderazgo del Olimpo y asignarle el inframundo a Hades a generado gran rencor por parte de su hermano. Al no estar satisfecho con esa decisión Hades opta por atacar a su hermano para intentar tomar el poder del Olimpo. Hades encarga a alguno de sus demonios robar la espada de Zeus, la espada más poderosa de todas, ya que era la espada que pertenecía a su padre. Al dejar a Zeus sin esta espada dejaba a Hades con cierta ventaja a la hora de atacar, pero cuando intenta hacerlo los demás dioses y semidioses defienden a Zeus y hades no logra su objetivo de tomar el control del Olimpo, pero en un momento de distracción, uno de sus demonios logra tomar la espada y llevársela a Hades; al verse rodeado Hades destruye la espada en 7 partes y en su huida las esparce en el camino hacia el inframundo. Al ver que Zeus queda vulnerable ante otro posible ataque los demás dioses y semidioses deciden acompañar a Zeus al inframundo y enfrentar a Hades para que no vuelva intentar tomar el poder nuevamente y tomar los pedazos de la espada para reconstruirla y asi poder vencer a Hades, pero en el camino se encontraran con diferentes monstros y demonios que harán lo posible para no dejarlos continuar.");
        jLabel2.setMaximumSize(new java.awt.Dimension(700, 700));
        jLabel2.setMinimumSize(new java.awt.Dimension(700, 700));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 160, 6345, 14);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Means/historia.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(24, 0, 900, 634);

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
            java.util.logging.Logger.getLogger(Story.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Story.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Story.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Story.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Story().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}

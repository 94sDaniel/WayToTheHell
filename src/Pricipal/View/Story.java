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
     * Creates new form Story
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(null);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arabic Typesetting", 0, 13)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Desde que Zeus, Poseidón y Hades vencieron a su padre Cronos,\n la decisión de Zeus de tomar el liderazgo del Olimpo y asignarle \nel inframundo a Hades a generado gran rencor por parte de su hermano. \nAl no estar satisfecho con esa decisión Hades opta por atacar a su \nhermano para intentar tomar el poder del Olimpo. Hades encarga a alguno \nde sus demonios robar la espada de Zeus, la espada más poderosa de todas,\n ya que era la espada que pertenecía a su padre. Al dejar a Zeus sin esta \nespada dejaba a Hades con cierta ventaja a la hora de atacar, pero cuando \nintenta hacerlo los demás dioses y semidioses defienden a Zeus y hades no \nlogra su objetivo de tomar el control del Olimpo, pero en un momento de \ndistracción, uno de sus demonios logra tomar la espada y llevársela a Hades; \nal verse rodeado Hades destruye la espada en 7 partes y en su huida las \nesparce en el camino hacia el inframundo. Al ver que Zeus queda vulnerable \nante otro posible ataque los demás dioses y semidioses deciden acompañar a \nZeus al inframundo y enfrentar a Hades para que no vuelva intentar tomar el\n poder nuevamente y tomar los pedazos de la espada para reconstruirla y asi\n poder vencer a Hades, pero en el camino se encontraran con diferentes monstros y demonios que harán lo posible para no dejarlos continuar.");
        jTextArea1.setFocusable(false);
        jTextArea1.setOpaque(false);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(170, 80, 630, 350);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Means/historia.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1095, 634);
        jLabel1.getAccessibleContext().setAccessibleName("Story");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
        int keypressed = evt.getKeyCode();
        if (keypressed == KeyEvent.VK_ENTER) {
            GUI jFrame = new GUI();
            jFrame.setVisible(true);
        }
    }//GEN-LAST:event_formKeyPressed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Story().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}

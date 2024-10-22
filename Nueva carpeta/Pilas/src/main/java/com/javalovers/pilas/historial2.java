/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.javalovers.pilas;

import javax.swing.JOptionPane;

/**
 *
 * @author SCIS2-16
 */
public class historial2 extends javax.swing.JFrame {
   Pila<String> pila = new Pila<>();
    Pila<String> temporal = new Pila<>();

    public historial2() {
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

        atras = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();
        estoy = new javax.swing.JButton();
        hsitorial = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        atras.setText("atras");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        siguiente.setText("siguiente");
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });

        estoy.setText("estoy");
        estoy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estoyActionPerformed(evt);
            }
        });

        hsitorial.setText("historial");
        hsitorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hsitorialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(estoy)
                    .addComponent(atras))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(siguiente)
                    .addComponent(hsitorial))
                .addGap(81, 81, 81))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atras)
                    .addComponent(siguiente))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estoy)
                    .addComponent(hsitorial))
                .addContainerGap(134, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        if(pila.isEmpty()){
            JOptionPane.showMessageDialog(null, "no a entrado a ninguna pagina");
        }
        else if(pila.size()==1){
             JOptionPane.showMessageDialog(null, "eres el primero");
        }
        else{
        temporal.push(pila.peekretorno());
        pila.pop();}
        
    }//GEN-LAST:event_atrasActionPerformed

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        String a = JOptionPane.showInputDialog("de el nobre a donde iras");
        if(a.trim().isEmpty()){
         JOptionPane.showMessageDialog(null, "ingrese el nombre de la pagina para continuar");
        }else{
        pila.push(a);
        temporal.push(a);}
    }//GEN-LAST:event_siguienteActionPerformed

    private void estoyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estoyActionPerformed
        if(pila.isEmpty()){
            JOptionPane.showMessageDialog(null, "no a entrado a ninguna pagina");
        }
        else{
        JOptionPane.showMessageDialog(null, "El ultimo elemento es: " + pila.peek());}
    }//GEN-LAST:event_estoyActionPerformed

    private void hsitorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hsitorialActionPerformed
        temporal.imprimir();
    }//GEN-LAST:event_hsitorialActionPerformed

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
            java.util.logging.Logger.getLogger(historial2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(historial2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(historial2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(historial2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new historial2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JButton estoy;
    private javax.swing.JButton hsitorial;
    private javax.swing.JButton siguiente;
    // End of variables declaration//GEN-END:variables
}

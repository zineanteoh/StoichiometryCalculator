/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackschool.purity.ui;

import com.hackschool.ui.Purity;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author teohzinean
 */
public class purityPercent extends javax.swing.JFrame {

    /**
     * Creates new form purityPercent
     */
    public purityPercent() {
        initComponents();
        getContentPane().setBackground(new Color(61,165,217));
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        StoichiometryCalclator = new javax.swing.JLabel();
        ByTeamWriteCodes = new javax.swing.JLabel();
        Icon = new javax.swing.JLabel();
        mainPanel2 = new javax.swing.JPanel();
        back = new javax.swing.JButton();
        enterButton = new javax.swing.JButton();
        calculate4 = new javax.swing.JLabel();
        pmTextField = new javax.swing.JTextField();
        calculate7 = new javax.swing.JLabel();
        imTextField = new javax.swing.JTextField();
        calculate5 = new javax.swing.JLabel();
        calculate8 = new javax.swing.JLabel();
        calculate2 = new javax.swing.JLabel();
        calculate3 = new javax.swing.JLabel();
        calculate9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(61, 165, 217));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        StoichiometryCalclator.setFont(new java.awt.Font("Nanum Gothic", 1, 24)); // NOI18N
        StoichiometryCalclator.setForeground(new java.awt.Color(255, 255, 255));
        StoichiometryCalclator.setText("Stoichiometry Calculator");
        header.add(StoichiometryCalclator, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 20, -1, -1));

        ByTeamWriteCodes.setBackground(new java.awt.Color(255, 255, 255));
        ByTeamWriteCodes.setFont(new java.awt.Font("Nanum Gothic", 1, 14)); // NOI18N
        ByTeamWriteCodes.setForeground(new java.awt.Color(255, 255, 255));
        ByTeamWriteCodes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ByTeamWriteCodes.setText("By team WriteCodes");
        header.add(ByTeamWriteCodes, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 52, -1, -1));

        Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon.png"))); // NOI18N
        header.add(Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 20, -1, -1));

        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 391, 94));

        mainPanel2.setBackground(new java.awt.Color(61, 165, 217));
        mainPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setBackground(new java.awt.Color(61, 165, 217));
        back.setForeground(new java.awt.Color(61, 165, 217));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                backMouseReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backMouseEntered(evt);
            }
        });
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        mainPanel2.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 40, 41));

        enterButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/enterButton_Default.png"))); // NOI18N
        enterButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                enterButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                enterButtonMouseReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                enterButtonMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enterButtonMouseEntered(evt);
            }
        });
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonActionPerformed(evt);
            }
        });
        mainPanel2.add(enterButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 86, 42));

        calculate4.setBackground(new java.awt.Color(255, 255, 255));
        calculate4.setFont(new java.awt.Font("Nanum Gothic", 1, 20)); // NOI18N
        calculate4.setForeground(new java.awt.Color(255, 255, 255));
        calculate4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        calculate4.setText("Impure Mass : ");
        mainPanel2.add(calculate4, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 255, 200, 35));

        pmTextField.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        pmTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        pmTextField.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                pmTextFieldPropertyChange(evt);
            }
        });
        mainPanel2.add(pmTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 150, 42));

        calculate7.setBackground(new java.awt.Color(255, 255, 255));
        calculate7.setFont(new java.awt.Font("Nanum Gothic", 1, 20)); // NOI18N
        calculate7.setForeground(new java.awt.Color(255, 255, 255));
        calculate7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        calculate7.setText("Pure Mass : ");
        mainPanel2.add(calculate7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 200, 35));

        imTextField.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        imTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        mainPanel2.add(imTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 150, 42));

        calculate5.setBackground(new java.awt.Color(255, 255, 255));
        calculate5.setFont(new java.awt.Font("Nanum Gothic", 1, 24)); // NOI18N
        calculate5.setForeground(new java.awt.Color(255, 255, 255));
        calculate5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        calculate5.setText("With Pure & Impure Mass");
        mainPanel2.add(calculate5, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 120, 350, 35));

        calculate8.setBackground(new java.awt.Color(255, 255, 255));
        calculate8.setFont(new java.awt.Font("Nanum Gothic", 1, 18)); // NOI18N
        calculate8.setForeground(new java.awt.Color(255, 255, 255));
        calculate8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        calculate8.setText("g");
        mainPanel2.add(calculate8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 50, 30));

        calculate2.setBackground(new java.awt.Color(255, 255, 255));
        calculate2.setFont(new java.awt.Font("Nanum Gothic", 1, 36)); // NOI18N
        calculate2.setForeground(new java.awt.Color(255, 255, 255));
        calculate2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        calculate2.setText("Calculate");
        mainPanel2.add(calculate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 300, 35));

        calculate3.setBackground(new java.awt.Color(255, 255, 255));
        calculate3.setFont(new java.awt.Font("Nanum Gothic", 1, 36)); // NOI18N
        calculate3.setForeground(new java.awt.Color(255, 255, 255));
        calculate3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        calculate3.setText("Purity Percentage");
        mainPanel2.add(calculate3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 300, 35));

        calculate9.setBackground(new java.awt.Color(255, 255, 255));
        calculate9.setFont(new java.awt.Font("Nanum Gothic", 1, 18)); // NOI18N
        calculate9.setForeground(new java.awt.Color(255, 255, 255));
        calculate9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        calculate9.setText("g");
        mainPanel2.add(calculate9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 50, 30));

        getContentPane().add(mainPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 391, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMousePressed
        // TODO add your handling code here:
        ImageIcon ii = new ImageIcon(getClass().getResource("/Images/back_pressed.png"));
        back.setIcon(ii);
    }//GEN-LAST:event_backMousePressed

    private void backMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseReleased
        // TODO add your handling code here:
        ImageIcon ii = new ImageIcon(getClass().getResource("/Images/back_hover.png"));
        back.setIcon(ii);
    }//GEN-LAST:event_backMouseReleased

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
        // TODO add your handling code here:
        ImageIcon ii = new ImageIcon(getClass().getResource("/Images/back.png"));
        back.setIcon(ii);
    }//GEN-LAST:event_backMouseExited

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
        // TODO add your handling code here:
        ImageIcon ii = new ImageIcon(getClass().getResource("/Images/back_hover.png"));
        back.setIcon(ii);
    }//GEN-LAST:event_backMouseEntered

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        Purity goPurity = new Purity();
        goPurity.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void enterButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterButtonMousePressed
        // TODO add your handling code here:
        ImageIcon ii = new ImageIcon(getClass().getResource("/Images/enterButton_Pressed.png"));
        enterButton.setIcon(ii);
    }//GEN-LAST:event_enterButtonMousePressed

    private void enterButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterButtonMouseReleased
        // TODO add your handling code here:
        ImageIcon ii = new ImageIcon(getClass().getResource("/Images/enterButton_Hover.png"));
        enterButton.setIcon(ii);
    }//GEN-LAST:event_enterButtonMouseReleased

    private void enterButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterButtonMouseExited
        // TODO add your handling code here:
        ImageIcon ii = new ImageIcon(getClass().getResource("/Images/enterButton_Default.png"));
        enterButton.setIcon(ii);
    }//GEN-LAST:event_enterButtonMouseExited

    private void enterButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterButtonMouseEntered
        // TODO add your handling code here:
        ImageIcon ii = new ImageIcon(getClass().getResource("/Images/enterButton_Hover.png"));
        enterButton.setIcon(ii);
    }//GEN-LAST:event_enterButtonMouseEntered

    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButtonActionPerformed
        // TODO add your handling code here:

        if(pmTextField.getText().matches(".*\\d.*") && imTextField.getText().matches(".*\\d.*")) {
            Float pm = Float.parseFloat(pmTextField.getText());
            Float im = Float.parseFloat(imTextField.getText());

            Float purity = (pm/im) * 100;

            JOptionPane.showMessageDialog(this, "= " + purity + "%");

        } else {
            JOptionPane.showMessageDialog(this, "Invalid Input, Please enter the values properly!");
        }
    }//GEN-LAST:event_enterButtonActionPerformed

    private void pmTextFieldPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_pmTextFieldPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_pmTextFieldPropertyChange

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
            java.util.logging.Logger.getLogger(purityPercent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(purityPercent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(purityPercent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(purityPercent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new purityPercent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ByTeamWriteCodes;
    private javax.swing.JLabel Icon;
    private javax.swing.JLabel StoichiometryCalclator;
    private javax.swing.JButton back;
    private javax.swing.JLabel calculate2;
    private javax.swing.JLabel calculate3;
    private javax.swing.JLabel calculate4;
    private javax.swing.JLabel calculate5;
    private javax.swing.JLabel calculate7;
    private javax.swing.JLabel calculate8;
    private javax.swing.JLabel calculate9;
    private javax.swing.JButton enterButton;
    private javax.swing.JPanel header;
    private javax.swing.JTextField imTextField;
    private javax.swing.JPanel mainPanel2;
    private javax.swing.JTextField pmTextField;
    // End of variables declaration//GEN-END:variables
}

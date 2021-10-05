/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Backend.Algorithms;
import javax.swing.ImageIcon;

/**
 *
 * @author Neeraavr
 */
public class OLL_Trainer extends javax.swing.JFrame {
    
    public static String OLL_algs_path = "data\\OLL";
    
    private void OLL_Buttons(){
        OLL_AntiSune.setIcon(new ImageIcon("src\\main\\resources\\LL_Algs\\OLL\\AntiSune.png"));
        OLL_H.setIcon(new ImageIcon("src\\main\\resources\\LL_Algs\\OLL\\H.png"));
        OLL_L.setIcon(new ImageIcon("src\\main\\resources\\LL_Algs\\OLL\\L.png"));
        OLL_Pi.setIcon(new ImageIcon("src\\main\\resources\\LL_Algs\\OLL\\Pi.png"));
        OLL_Sune.setIcon(new ImageIcon("src\\main\\resources\\LL_Algs\\OLL\\Sune.png"));
        OLL_T.setIcon(new ImageIcon("src\\main\\resources\\LL_Algs\\OLL\\T.png"));
        OLL_U.setIcon(new ImageIcon("src\\main\\resources\\LL_Algs\\OLL\\U.png"));        
    }
    public OLL_Trainer() {
        initComponents();
        
        
        OLL_Buttons();
        
        ImageIcon main = new ImageIcon("src/main/resources/UI_Images/main_Icon.png");
        this.setIconImage(main.getImage());        
        
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Back_Button = new javax.swing.JButton();
        OLL_Scramble_Field = new javax.swing.JTextField();
        OLL_AntiSune = new javax.swing.JButton();
        OLL_Solution_Field = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        OLL_Sune = new javax.swing.JButton();
        OLL_L = new javax.swing.JButton();
        OLL_T = new javax.swing.JButton();
        OLL_H = new javax.swing.JButton();
        OLL_U = new javax.swing.JButton();
        OLL_Pi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("OLL");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("OLL TRAINER");

        jLabel2.setText("AntiSune");

        jLabel3.setText("Sune");

        jLabel4.setText("H");

        jLabel5.setText("T");

        jLabel6.setText("L");

        jLabel7.setText("U");

        jLabel8.setText("Pi");

        Back_Button.setText("BACK");
        Back_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_ButtonActionPerformed(evt);
            }
        });

        OLL_AntiSune.setFocusable(false);
        OLL_AntiSune.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OLL_AntiSuneActionPerformed(evt);
            }
        });

        jLabel9.setText("Solution:");

        jLabel10.setText("Scramble:");

        OLL_Sune.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OLL_SuneActionPerformed(evt);
            }
        });

        OLL_L.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OLL_LActionPerformed(evt);
            }
        });

        OLL_T.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OLL_TActionPerformed(evt);
            }
        });

        OLL_H.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OLL_HActionPerformed(evt);
            }
        });

        OLL_U.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OLL_UActionPerformed(evt);
            }
        });

        OLL_Pi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OLL_PiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(OLL_AntiSune, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel4)
                                    .addComponent(OLL_H, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(OLL_Sune, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(OLL_T, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OLL_L, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(OLL_U, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))
                        .addGap(62, 62, 62))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(OLL_Pi, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(OLL_Solution_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Back_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(OLL_Scramble_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))))
                        .addGap(0, 64, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(OLL_L, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OLL_AntiSune, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .addComponent(OLL_Sune, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(OLL_T, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(OLL_H, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(OLL_U, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addComponent(OLL_Pi, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jLabel10)
                        .addGap(7, 7, 7)
                        .addComponent(OLL_Scramble_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OLL_Solution_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Back_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Back_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_ButtonActionPerformed
        this.dispose();
        Main_Menu mm = new Main_Menu();
        mm.setVisible(true);        
    }//GEN-LAST:event_Back_ButtonActionPerformed

    private void OLL_AntiSuneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OLL_AntiSuneActionPerformed
        OLL_Scramble_Field.setText(Algorithms.get_LL_Algorithms("AntiSune")[0]);
        OLL_Solution_Field.setText(Algorithms.get_LL_Algorithms("AntiSune")[1]);
    }//GEN-LAST:event_OLL_AntiSuneActionPerformed

    private void OLL_SuneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OLL_SuneActionPerformed
        OLL_Scramble_Field.setText(Algorithms.get_LL_Algorithms("Sune")[0]);
        OLL_Solution_Field.setText(Algorithms.get_LL_Algorithms("Sune")[1]);
    }//GEN-LAST:event_OLL_SuneActionPerformed

    private void OLL_LActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OLL_LActionPerformed
        OLL_Scramble_Field.setText(Algorithms.get_LL_Algorithms("L")[0]);
        OLL_Solution_Field.setText(Algorithms.get_LL_Algorithms("L")[1]);
    }//GEN-LAST:event_OLL_LActionPerformed

    private void OLL_HActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OLL_HActionPerformed
        OLL_Scramble_Field.setText(Algorithms.get_LL_Algorithms("H")[0]);
        OLL_Solution_Field.setText(Algorithms.get_LL_Algorithms("H")[1]);
    }//GEN-LAST:event_OLL_HActionPerformed

    private void OLL_TActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OLL_TActionPerformed
        OLL_Scramble_Field.setText(Algorithms.get_LL_Algorithms("T")[0]);
        OLL_Solution_Field.setText(Algorithms.get_LL_Algorithms("T")[1]);
    }//GEN-LAST:event_OLL_TActionPerformed

    private void OLL_UActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OLL_UActionPerformed
        OLL_Scramble_Field.setText(Algorithms.get_LL_Algorithms("U")[0]);
        OLL_Solution_Field.setText(Algorithms.get_LL_Algorithms("U")[1]);
    }//GEN-LAST:event_OLL_UActionPerformed

    private void OLL_PiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OLL_PiActionPerformed
        OLL_Scramble_Field.setText(Algorithms.get_LL_Algorithms("Pi")[0]);
        OLL_Solution_Field.setText(Algorithms.get_LL_Algorithms("Pi")[1]);
    }//GEN-LAST:event_OLL_PiActionPerformed

    
//        public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Main_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Main_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Main_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Main_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new OLL_Trainer().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_Button;
    private javax.swing.JButton OLL_AntiSune;
    private javax.swing.JButton OLL_H;
    private javax.swing.JButton OLL_L;
    private javax.swing.JButton OLL_Pi;
    private javax.swing.JTextField OLL_Scramble_Field;
    private javax.swing.JTextField OLL_Solution_Field;
    private javax.swing.JButton OLL_Sune;
    private javax.swing.JButton OLL_T;
    private javax.swing.JButton OLL_U;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}


package UI;

import Backend.Algorithms;
import Backend.Time_Manager;
import java.util.TimerTask;
import java.util.Timer;



public class Timer_Screen extends javax.swing.JFrame {
    public static int count = 0;
    static Timer seconds_timer;
    public static int ms_Passed = 0;
    public static  boolean is_Running = false;
    public static  int MilliSecondsPassed = 0;
    public static  int SecondsPassed = 0;
    public static  int MinutesPassed = 0;
    public Timer_Screen() {
        int scramble_Number = (int)(Math.random()*(16-1+1));
        
        initComponents();
        
                    average_Text_Field.setText(Time_Manager.get_average_of(Time_Manager.get_Num_Times()));
                    Ao5_Text_Field.setText(Time_Manager.get_average_of(5));
                    Ao12_Text_Field.setText(Time_Manager.get_average_of(12));        
        
        Latest_Times_Field.setText(Time_Manager.get_Times());
        
        Scramble_Field.setText(Algorithms.get_Scramble(scramble_Number));
        
        
        
        
        
        
        
        
        
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Latest_Times_Field = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        Solve_Time_Field = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Scramble_Field = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        average_Text_Field = new javax.swing.JTextField();
        Ao5_Text_Field = new javax.swing.JTextField();
        Ao12_Text_Field = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

        Latest_Times_Field.setEditable(false);
        Latest_Times_Field.setColumns(20);
        Latest_Times_Field.setRows(5);
        Latest_Times_Field.setFocusable(false);
        jScrollPane1.setViewportView(Latest_Times_Field);

        jLabel2.setText("Latest Times");

        Solve_Time_Field.setEditable(false);
        Solve_Time_Field.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Solve_Time_Field.setFocusable(false);

        jLabel3.setText("Solve Time:");

        Scramble_Field.setFocusable(false);

        jLabel4.setText("Scramble:");

        jButton1.setText("BACK");
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Average: ");

        jLabel5.setText("Ao5:");

        jLabel6.setText("Ao12:");

        average_Text_Field.setFocusable(false);

        Ao5_Text_Field.setFocusable(false);

        Ao12_Text_Field.setFocusable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(85, 85, 85)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Solve_Time_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3))
                                        .addGap(0, 94, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(Scramble_Field)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(31, 31, 31)
                                .addComponent(Ao5_Text_Field))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(25, 25, 25)
                                .addComponent(Ao12_Text_Field))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(average_Text_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(average_Text_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Ao5_Text_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Ao12_Text_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Solve_Time_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Scramble_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        if (!is_Running ) {
            is_Running = true;
            if (evt.getKeyCode() == evt.VK_SPACE) {

                seconds_timer = new Timer();
                TimerTask task = new TimerTask() {
                    @Override
                    public void run() {
                        ms_Passed++;
                        MilliSecondsPassed++;
                        Solve_Time_Field.setText(MinutesPassed + ":" + SecondsPassed + ":" + MilliSecondsPassed);
                        if (MilliSecondsPassed == 1000) {
                            MilliSecondsPassed = 0;
                            SecondsPassed++;
                        }

                        if (SecondsPassed == 60) {
                            MilliSecondsPassed = 0;
                            SecondsPassed = 0;
                            MinutesPassed++;
//                System.out.println(MinutesPassed + ":" + SecondsPassed + ":" + MilliSecondsPassed);
                        }

                    }
                };
                seconds_timer.scheduleAtFixedRate(task, 0, 1);

            }

        }
        else{
            is_Running = false;
        }
    }//GEN-LAST:event_formKeyReleased

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        count++;
        int scramble_Number = (int)(Math.random()*(16-1+1));
        if (is_Running) {
            
            if (MilliSecondsPassed > 0 | SecondsPassed > 0 | MinutesPassed > 0) {
                if (evt.getKeyCode() == evt.VK_SPACE) {
                    MilliSecondsPassed = 0;
                    SecondsPassed = 0;
                    MinutesPassed = 0;
                    seconds_timer.cancel();
                    String final_Time = Time_Manager.convert_To_Stopwatch(ms_Passed);
                    System.out.println(final_Time);
                    Time_Manager.add_Time(final_Time);
                    Scramble_Field.setText(Algorithms.get_Scramble(scramble_Number));
                    Latest_Times_Field.setText(Time_Manager.get_Times());
                    ms_Passed = 0;
                    average_Text_Field.setText(Time_Manager.get_average_of(Time_Manager.get_Num_Times()));
                    
                    if(count % 5 == 0){
                    Ao5_Text_Field.setText(Time_Manager.get_average_of(5));
                    }
                    else{
                        
                    }
                    if(count%12 == 0){
                    Ao12_Text_Field.setText(Time_Manager.get_average_of(12));
                    }
                    else{
                        
                    }
                }
            }
        }
    }//GEN-LAST:event_formKeyPressed
    
//    public static void main(String args[]) {
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
//                new Timer_Screen().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Ao12_Text_Field;
    private javax.swing.JTextField Ao5_Text_Field;
    private javax.swing.JTextArea Latest_Times_Field;
    private javax.swing.JTextField Scramble_Field;
    private javax.swing.JTextField Solve_Time_Field;
    private javax.swing.JTextField average_Text_Field;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

package UI;

import Backend.Cube_Related_stuff;
import java.awt.event.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;

public class Basic_Timer_Screen extends javax.swing.JFrame {

    static Timer seconds_timer;
    static int MilliSecondsPassed = 0;
    static int SecondsPassed = 0;
    static int MinutesPassed = 0;
    static boolean isRunning = false;

    public Basic_Timer_Screen() {
        initComponents();
        Scramble_Algorithm.setText(Cube_Related_stuff.Scramble_Algorithm());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        timeLabel = new javax.swing.JLabel();
        Scramble_Algorithm = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

        timeLabel.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        timeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLabel.setText("0 : 00 : 000");
        timeLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(Scramble_Algorithm, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(Scramble_Algorithm, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(149, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased

        if (!isRunning ) {
            isRunning = true;
            if (evt.getKeyCode() == KeyEvent.VK_SPACE) {

                seconds_timer = new Timer();
                TimerTask task = new TimerTask() {
                    @Override
                    public void run() {
                        MilliSecondsPassed++;
                        timeLabel.setText(MinutesPassed + ":" + SecondsPassed + ":" + MilliSecondsPassed);
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
            isRunning = false;
        }
    }//GEN-LAST:event_formKeyReleased

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

        if (isRunning) {
            
            if (MilliSecondsPassed > 0 | SecondsPassed > 0 | MinutesPassed > 0) {
                if (evt.getKeyCode() == KeyEvent.VK_SPACE) {
                    MilliSecondsPassed = 0;
                    SecondsPassed = 0;
                    MinutesPassed = 0;
                    seconds_timer.cancel();
                    Scramble_Algorithm.setText(Cube_Related_stuff.Scramble_Algorithm());
                }
            }
        }

    }//GEN-LAST:event_formKeyPressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Basic_Timer_Screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Scramble_Algorithm;
    private javax.swing.JLabel timeLabel;
    // End of variables declaration//GEN-END:variables
}
package UI;

import java.awt.event.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;

public class Basic_Timer_Screen extends javax.swing.JFrame {
    
    Timer seconds_timer = new Timer();

    public Basic_Timer_Screen() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Time = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

        Time.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        Time.setText("          0 : 00 : 000");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(Time, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(Time, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(206, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    static int MilliSecondsPassed = 0;
    static int SecondsPassed = 0;
    static int MinutesPassed = 0;
    
    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_SPACE){
            
        
    Timer timer = new Timer();
    TimerTask task = new TimerTask(){
        @Override
        public void run(){
            MilliSecondsPassed++;
            Time.setText(MinutesPassed + ":" + SecondsPassed + ":" + MilliSecondsPassed);
            if(MilliSecondsPassed == 1000){
                MilliSecondsPassed = 0;
                SecondsPassed++;
//                System.out.println(MinutesPassed + ":" + SecondsPassed + ":" + MilliSecondsPassed);
            }
            
            if(SecondsPassed == 60){
                MilliSecondsPassed = 0;
                SecondsPassed = 0;
                MinutesPassed++;
//                System.out.println(MinutesPassed + ":" + SecondsPassed + ":" + MilliSecondsPassed);
            }
            
            
        }
    };
    
    seconds_timer.scheduleAtFixedRate(task, 0 , 1);
     
        }
    }//GEN-LAST:event_formKeyReleased
    
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        
        TimerTask dispose = new TimerTask(){
            public void run(){
                //do nothing
            }
        };
        
        if(MilliSecondsPassed > 0 | SecondsPassed > 0 | MinutesPassed > 0){
            if(evt.getKeyCode() == KeyEvent.VK_SPACE){    
           MilliSecondsPassed = 0;
           SecondsPassed = 0;
           MinutesPassed = 0;
           seconds_timer.cancel();
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
    private javax.swing.JLabel Time;
    // End of variables declaration//GEN-END:variables
}

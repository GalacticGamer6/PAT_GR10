package UI;

import Backend.Algorithms;
import Backend.Time_Manager;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TimerTask;
import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;



public class Timer_Screen extends javax.swing.JFrame {
    
    Time_Manager tm = new Time_Manager();
    public static int count = 0;
    static Timer timer;
    public static int ms_Passed = 0;
    public static  boolean is_Running = false;
    
    public Timer_Screen() {
        
        int scramble_Number = (int)(Math.random()*(16-1+1));
        
        initComponents();
        
        average_Text_Field.setText(Time_Manager.get_average_of(Time_Manager.get_Num_Times())); 
        
        Latest_Times_Field.setText(Time_Manager.get_Times());
        
        Scramble_Field.setText(Algorithms.get_Scramble(scramble_Number));
        
        Solve_Time_Field.setText("0 : 00 : 000");
        
        
        ImageIcon main = new ImageIcon("src/main/resources/UI_Images/main_Icon.png");
        this.setIconImage(main.getImage());
        setLocationRelativeTo(null);
        
        ImageIcon timer = new ImageIcon("src/main/resources/UI_Images/timer_icon.png");
        timer_icon.setIcon(timer);
        
        
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
        back_Button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        average_Text_Field = new javax.swing.JTextField();
        clear_Button = new javax.swing.JButton();
        timer_icon = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Timer");
        setResizable(false);
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
        Latest_Times_Field.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        Latest_Times_Field.setRows(5);
        Latest_Times_Field.setFocusable(false);
        jScrollPane1.setViewportView(Latest_Times_Field);

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel2.setText("Latest Times");

        Solve_Time_Field.setEditable(false);
        Solve_Time_Field.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        Solve_Time_Field.setFocusable(false);

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel3.setText("Solve Time:");

        Scramble_Field.setFocusable(false);

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel4.setText("Scramble:");

        back_Button.setText("BACK");
        back_Button.setFocusable(false);
        back_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_ButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel1.setText("Average: ");

        average_Text_Field.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        average_Text_Field.setFocusable(false);

        clear_Button.setText("CLEAR");
        clear_Button.setFocusable(false);
        clear_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_ButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel5.setText("SPACE to Start and Stop timer");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(clear_Button))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(85, 85, 85)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Solve_Time_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(average_Text_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(timer_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(141, 141, 141))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(Scramble_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back_Button)
                        .addGap(177, 177, 177)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(220, 220, 220)))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(average_Text_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(timer_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Solve_Time_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Scramble_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back_Button)
                    .addComponent(clear_Button)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_ButtonActionPerformed
        this.dispose();
        Main_Menu mm = new Main_Menu();
        mm.setVisible(true);
    }//GEN-LAST:event_back_ButtonActionPerformed

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        if (!is_Running ) {
            is_Running = true;
            if (evt.getKeyCode() == evt.VK_SPACE) {

                timer = new Timer();
                TimerTask task = new TimerTask() {
                    @Override
                    public void run() {
                        ms_Passed++;
                        Solve_Time_Field.setText(tm.convert_To_Stopwatch(ms_Passed));
                    }
                };
                timer.scheduleAtFixedRate(task, 0, 1);

            }

        }
        else{
            is_Running = false;
        }
    }//GEN-LAST:event_formKeyReleased

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

        if (is_Running) {
            if (ms_Passed > 0) {
                //code ot actually stop the timer and add time
                if (evt.getKeyCode() == evt.VK_SPACE) {
                    timer.cancel();
                    tm.add_Time(tm.convert_To_Stopwatch(ms_Passed));
                    count++;
                    System.out.println(count);
                    
                    //Just doing some visual updates
                    int scramble_Num = (int)(Math.random()*(16-1+1));
                    Scramble_Field.setText(Algorithms.get_Scramble(scramble_Num));
                    Latest_Times_Field.setText(Time_Manager.get_Times());
                    average_Text_Field.setText(tm.get_average_of(tm.get_Num_Times()));
                 
                    
                    //initializing ms passed
                    ms_Passed = 0;              
                 }
            }
        }
    }//GEN-LAST:event_formKeyPressed

    
    
        
    private void clear_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_ButtonActionPerformed
        Time_Manager.clear_Times();
        Latest_Times_Field.setText(Time_Manager.get_Times());
        average_Text_Field.setText("0:00:000");               
        Solve_Time_Field.setText("0:00:000");
        count = 0; // making sure to only calculate averages once we are back to 5 / 12 solves
    }//GEN-LAST:event_clear_ButtonActionPerformed
    
    

    
    
    
    
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Latest_Times_Field;
    private javax.swing.JTextField Scramble_Field;
    private javax.swing.JTextField Solve_Time_Field;
    private javax.swing.JTextField average_Text_Field;
    private javax.swing.JButton back_Button;
    private javax.swing.JButton clear_Button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel timer_icon;
    // End of variables declaration//GEN-END:variables
}

package UI;

import Backend.Algorithms;
import Backend.Time_Manager;
import java.util.TimerTask;
import java.util.Timer;
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
                    Ao5_Text_Field.setText(Time_Manager.get_average_of(5));
                    Ao12_Text_Field.setText(Time_Manager.get_average_of(12));        
        
        Latest_Times_Field.setText(Time_Manager.get_Times());
        
        Scramble_Field.setText(Algorithms.get_Scramble(scramble_Number));
        
        Solve_Time_Field.setText("0 : 00 : 000");
        
        
        ImageIcon main = new ImageIcon("src/main/resources/UI_Images/main_Icon.png");
        this.setIconImage(main.getImage());
        setLocationRelativeTo(null);
        
        
        
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        average_Text_Field = new javax.swing.JTextField();
        Ao5_Text_Field = new javax.swing.JTextField();
        Ao12_Text_Field = new javax.swing.JTextField();
        clear_Button = new javax.swing.JButton();

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

        back_Button.setText("BACK");
        back_Button.setFocusable(false);
        back_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_ButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Average: ");

        jLabel5.setText("Ao5:");

        jLabel6.setText("Ao12:");

        average_Text_Field.setFocusable(false);

        Ao5_Text_Field.setFocusable(false);

        Ao12_Text_Field.setFocusable(false);

        clear_Button.setText("CLEAR");
        clear_Button.setFocusable(false);
        clear_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_ButtonActionPerformed(evt);
            }
        });

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
                            .addComponent(back_Button)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clear_Button)))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back_Button)
                    .addComponent(clear_Button))
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
                    
                    //just setting some averages
                    if(count >= 5){
                        Ao5_Text_Field.setText(tm.get_average_of(5));
                        if(count>=12){
                            Ao12_Text_Field.setText(tm.get_average_of(12));
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_formKeyPressed

    private void clear_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_ButtonActionPerformed
        Time_Manager.clear_Times();
        Latest_Times_Field.setText(Time_Manager.get_Times());
                    average_Text_Field.setText("0:00:000");
                    Ao5_Text_Field.setText("0:00:000");
                    Ao12_Text_Field.setText("0:00:000");                     
        Solve_Time_Field.setText("0:00:000");
        count = 0; // making sure to only calculate averages once we are back to 5 / 12 solves
    }//GEN-LAST:event_clear_ButtonActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Ao12_Text_Field;
    private javax.swing.JTextField Ao5_Text_Field;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

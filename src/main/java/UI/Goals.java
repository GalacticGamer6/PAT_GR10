










/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;
import Backend.goal_Manager;
import java.awt.Image;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

/**
 *
 * @author Neeraavr
 */
public class Goals extends javax.swing.JFrame {

    /**
     * Creates new form Goals
     */
    public Goals() {
        
        initComponents();
//loading up some images
        ImageIcon main = new ImageIcon("src/main/resources/UI_Images/main_Icon.png");
        this.setIconImage(main.getImage());        
        
        goals_List.setModel(update_Goals_Lm());
        
        completed_List.setModel(update_Completed_Goals_Lm());
         Goals_Label.setIcon(new ImageIcon("src/main/resources/UI_Images/goals_image_Icon.png"));
    }
    
    
    
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Goals_Label = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        goals_List = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        completed_List = new javax.swing.JList<>();
        to_Completed_Button = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Back_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Goals");
        setAutoRequestFocus(false);
        setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 10)); // NOI18N

        Goals_Label.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        goals_List.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(goals_List);

        completed_List.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        completed_List.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(completed_List);

        to_Completed_Button.setText(">>");
        to_Completed_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                to_Completed_ButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("TO DO:");

        jLabel3.setText("COMPLETED:");

        Back_button.setText("BACK");
        Back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(to_Completed_Button)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Back_button, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Goals_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Goals_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(to_Completed_Button)
                        .addGap(137, 137, 137)))
                .addComponent(Back_button, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_buttonActionPerformed
        this.dispose();
        Main_Menu mm = new Main_Menu();
        mm.setVisible(true);
        //having the main menu reappear upon back button being pressed
    }//GEN-LAST:event_Back_buttonActionPerformed

    private void to_Completed_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_to_Completed_ButtonActionPerformed
        String selected_Goal = goals_List.getSelectedValue();
        ImageIcon goal_Icon = new ImageIcon("src/main/resources/UI_Images/goals_image_Icon.png");
        
       String goal = goals_List.getSelectedValue();

                       
                       switch(goal) //checking for whether the user has selected an actualy goal to move over and not just a heading
                       {
                           case "--------------------------------------------" : JOptionPane.showMessageDialog(rootPane, "Please select a goal!");
                                                                                               break;
                           case"New":
                           case"Sub 1:30:000":
                           case"Sub 1:00:000":
                           case"Sub 0:40:000":
                           case"Sub 0:20:000": JOptionPane.showMessageDialog(rootPane, "Please select a goal!");
                                                        break;
                           default:   int ans = JOptionPane.showConfirmDialog(rootPane, "Are you sure you've completed this goal?", "Confirmation", WIDTH, HEIGHT,goal_Icon);
                           
                                        switch(ans)//Moving the goal over or not depending on what the user choses
                                        {
                                                            //moves the goal over
                                            case 0:    JOptionPane.showMessageDialog(rootPane, "Goal Successfully Completed!");
                                                          goal_Manager.complete_Goal(selected_Goal);                                
                                                          goals_List.setModel(update_Goals_Lm());   //setting the List elements the listmodel from the update goals anf completed goals methods.
                                                          completed_List.setModel(update_Completed_Goals_Lm());
                                                          break;
                                                          
                                            case 1:    JOptionPane.showMessageDialog(rootPane, "Dont give up!!");
                                                          break;
                                        }
                       }
                     
    }//GEN-LAST:event_to_Completed_ButtonActionPerformed
   
    
       //simple method to update goals
        public static ListModel update_Goals_Lm(){
                DefaultListModel goals_Lm = new DefaultListModel();
                String [] goals = goal_Manager.get_Goals();
                for(int i = 0; i < goals.length ;i++){
                    goals_Lm.addElement(goals[i]);
                }
                return goals_Lm;
        }
        //simple methid to update completed goals
        public static ListModel update_Completed_Goals_Lm(){
                DefaultListModel completed_Goals_Lm = new DefaultListModel();
                String [] completed_Goals = goal_Manager.get_Completed_Goals();
                for(int i = 0; i < completed_Goals.length ;i++){
                    completed_Goals_Lm.addElement(completed_Goals[i]);
                }
                return completed_Goals_Lm;
        }        
    
    
    /**
     * @param args the command line arguments
     */
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
//                new Goals().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_button;
    private javax.swing.JLabel Goals_Label;
    private javax.swing.JList<String> completed_List;
    private javax.swing.JList<String> goals_List;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton to_Completed_Button;
    // End of variables declaration//GEN-END:variables
}

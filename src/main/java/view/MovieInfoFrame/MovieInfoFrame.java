/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.MovieInfoFrame;

import control.ControlData;
import javax.swing.ImageIcon;
import model.Movies.Movie;

/**
 *
 * @author adrianealtiche
 */
public class MovieInfoFrame extends javax.swing.JFrame {

    /**
     * Creates new form MovieInfoNew
     */
    private String date;
    private String time;
    
    public MovieInfoFrame() {
        initComponents();
        
        
    }

    public void changeMovie(Movie movie)
    {
        jLabel8.setText(movie.getTitle());
        jLabel9.setText("MTRCB Rating: " + movie.getMtcrbRating());
        jLabel11.setText("Genre: " + movie.getGenre());
        
        movieLabel.setIcon(new ImageIcon("src/main/resources/ShowingFrame/Thumbnail/" + movie.getThumbnailName()));
        movieLabel.scale();
        
        jLabel17.setText(movie.getSypnosis());
    }

    public String getDate()
    {
        return (String) dateComboBox.getSelectedItem();
    }

    public String getTime()
    {
        return (String) timeComboBox.getSelectedItem();
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        chooseSeatsLabel = new view_components.ULabel();
        dateComboBox = new javax.swing.JComboBox<>();
        timeComboBox = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        movieLabel = new view_components.ScaleableLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel1.setBackground(new java.awt.Color(11, 0, 26));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1329, 2983, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MovieInfoFrame/seeblack.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-170, 10, 340, 130));

        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(237, 58, 133)));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 1050, 70));

        jLabel7.setFont(new java.awt.Font("YuGothic", 1, 52)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(225, 225, 225));
        jLabel7.setText("COMING SOON");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 450, 80));

        jLabel8.setBackground(new java.awt.Color(237, 58, 133));
        jLabel8.setFont(new java.awt.Font("YuGothic", 3, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(237, 58, 133));
        jLabel8.setText("AVENGERS: END GAME");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 640, 80));

        jLabel9.setFont(new java.awt.Font("YuGothic", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(225, 225, 225));
        jLabel9.setText("MTRCB Rating: PG-13");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 290, 80));

        jLabel10.setFont(new java.awt.Font("YuGothic", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(225, 225, 225));
        jLabel10.setText("Running Time: 3h : 1m");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 290, 80));

        jLabel12.setFont(new java.awt.Font("YuGothic", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(225, 225, 225));
        jLabel12.setText("Stars: Robert Downey Jr. ");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, 650, 80));

        jLabel15.setFont(new java.awt.Font("YuGothic", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(225, 225, 225));
        jLabel15.setText("Chris Evans");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 440, 290, 80));

        jLabel16.setFont(new java.awt.Font("YuGothic", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(225, 225, 225));
        jLabel16.setText("Mark Ruffalo");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 470, 290, 80));

        jLabel11.setFont(new java.awt.Font("YuGothic", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(225, 225, 225));
        jLabel11.setText("Genre: Action - Adventure ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 260, 590, 80));

        jLabel13.setFont(new java.awt.Font("YuGothic", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(225, 225, 225));
        jLabel13.setText("Director: Anthony Russo   ");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 330, 380, 80));

        jLabel14.setFont(new java.awt.Font("YuGothic", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(225, 225, 225));
        jLabel14.setText("Joe Russo");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 360, 290, 80));

        jLabel17.setFont(new java.awt.Font("YuGothic", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(225, 225, 225));
        jLabel17.setText("After the devastating events of Avengers: Infinity War (2018), the universe is in ruins.  ");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 680, 1030, 70));

        jLabel18.setFont(new java.awt.Font("YuGothic", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(225, 225, 225));
        jLabel18.setText("With the help of remaining allies, the Avengers assemble once more in order to reverse Thanos' ");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 720, 1110, 70));

        jLabel4.setFont(new java.awt.Font("YuGothic", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(225, 225, 225));
        jLabel4.setText("actions and restore balance to the universe. ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 760, 1110, 70));

        chooseSeatsLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MovieInfoFrame/VIEW.png"))); // NOI18N
        chooseSeatsLabel.setDestFrame("SeatFrame");
        jPanel1.add(chooseSeatsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 910, 430, 80));

        dateComboBox.setBackground(new java.awt.Color(237, 58, 133));
        dateComboBox.setFont(new java.awt.Font("YuGothic", 1, 13)); // NOI18N
        dateComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT DATE", "DECEMBER 1, 2023", "DECEMBER 2, 2023", "DECEMBER 3, 2023", "DECEMBER 4, 2024" }));
        dateComboBox.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                dateComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(dateComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 920, 220, -1));

        timeComboBox.setBackground(new java.awt.Color(237, 58, 133));
        timeComboBox.setFont(new java.awt.Font("YuGothic", 1, 13)); // NOI18N
        timeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SCHEDULE", "1:45 PM RESERVED SEATING", "4:10 PM RESERVED SEATING", "6:30 PM RESERVED SEATING", "8:45 PM RESERVED SEATING", " " }));
        timeComboBox.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                timeComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(timeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 960, 220, -1));

        jPanel2.setBackground(new java.awt.Color(237, 58, 133));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("YuGothic", 1, 50)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MOVIE SCREEN");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 1410, 1310, 50));
        jPanel1.add(movieLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 270, 370));

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 850));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dateComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateComboBoxActionPerformed

    private void timeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(MovieInfoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MovieInfoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MovieInfoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MovieInfoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MovieInfoFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private view_components.ULabel chooseSeatsLabel;
    private javax.swing.JComboBox<String> dateComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private view_components.ScaleableLabel movieLabel;
    private javax.swing.JComboBox<String> timeComboBox;
    // End of variables declaration//GEN-END:variables
}

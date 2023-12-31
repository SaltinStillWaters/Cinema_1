/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.Gcash;

import control.ControlSeats;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import model.theater_seats.Seat;
import model.theater_seats.Seats;
import model.theater_seats.TheaterSeat;
import view_components.USeat;

/**
 *
 * @author adrianealtiche
 */
public class Gcash extends javax.swing.JFrame {
    /**
     * Creates new form Gcash
     */
    public Gcash() {
        initComponents();
        this.setResizable(false); // Disable resize frame
        setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        refNumTField = new javax.swing.JTextField();
        uLabel2 = new view_components.ULabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(11, 0, 26));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        refNumTField.setText("Reference Number");
        refNumTField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                refNumTFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                refNumTFieldFocusLost(evt);
            }
        });
        jPanel1.add(refNumTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 520, 320, -1));

        uLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/getReceipt.png"))); // NOI18N
        uLabel2.setDestFrame("Receipt");
        uLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(uLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 570, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GCASH/seeblack gcah.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, 10, 340, 130));

        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(237, 58, 133)));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 1050, 70));

        jLabel7.setFont(new java.awt.Font("YuGothic", 1, 52)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(225, 225, 225));
        jLabel7.setText("PAYMENT");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 560, 80));

        jLabel1.setFont(new java.awt.Font("YuGothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INPUT FOR CONFIRMATION");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 460, 370, 60));

        jLabel2.setFont(new java.awt.Font("YuGothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SCAN FOR PAYMENT");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 280, 60));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GCASH/qr final.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-480, -220, 1870, 980));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 860));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void refNumTFieldFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_refNumTFieldFocusGained
    {//GEN-HEADEREND:event_refNumTFieldFocusGained
        JTextField textField = (JTextField) evt.getSource();
    
        // Check if the mouse click occurred on the JTextField
        if (textField.getText().equals("Reference Number")) 
        {
            // Clear the text when the JTextField is clicked
            textField.setText("");
        }
    }//GEN-LAST:event_refNumTFieldFocusGained

    private void refNumTFieldFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_refNumTFieldFocusLost
    {//GEN-HEADEREND:event_refNumTFieldFocusLost
        JTextField textField = (JTextField) evt.getSource();
                if (textField.getText().trim().isEmpty()) 
                {
                    textField.setText("Reference Number");
                }
    }//GEN-LAST:event_refNumTFieldFocusLost

    private void uLabel2MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_uLabel2MouseClicked
    {//GEN-HEADEREND:event_uLabel2MouseClicked
        //init Seats
        ControlSeats ctrlSeats = ControlSeats.getInstance();
        TheaterSeat tSeatCurr = ctrlSeats.getCurrTheaterSeat();
        TheaterSeat tSeat = ctrlSeats.getTheaterSeats().getTheaterSeat(tSeatCurr);   //reference for the Model.TheaterSeat
        
        
        ArrayList<ArrayList<Seat>> seats = tSeat.getSeats().getSeats();
        
        for (int row = 0; row < Seats.rows; ++row)
        {
            ArrayList<Seat> seatArray = seats.get(row);
            
            for (int col = 0; col < Seats.cols; ++col)
            {
                Seat seat = seatArray.get(col);
               
                
                if (seat.getState().equals("selected"))
                {
                    seat.setState("reserved");
                }
                
            }
            
        }
    }//GEN-LAST:event_uLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(Gcash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gcash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gcash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gcash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gcash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField refNumTField;
    private view_components.ULabel uLabel2;
    // End of variables declaration//GEN-END:variables
}

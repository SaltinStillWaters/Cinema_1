/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.ContactUs;

/**
 *
 * @author adrianealtiche
 */
public class ContactUs extends javax.swing.JFrame {

    /**
     * Creates new form ContactUs
     */
    public ContactUs() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        uLabel1 = new view_components.ULabel();
        uLabel2 = new view_components.ULabel();
        uLabel3 = new view_components.ULabel();
        uLabel4 = new view_components.ULabel();
        uLabel5 = new view_components.ULabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel2.setBackground(new java.awt.Color(11, 0, 26));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 10, 52));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ContactUs/logoContactUs/seenemalogocontactus.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, 40, 680, 110));

        uLabel1.setForeground(new java.awt.Color(225, 225, 225));
        uLabel1.setText("CONTACT US");
        uLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanel1.add(uLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, -1, -1));

        uLabel2.setForeground(new java.awt.Color(225, 225, 225));
        uLabel2.setText("SEE SCHEDULE");
        uLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanel1.add(uLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        uLabel3.setForeground(new java.awt.Color(225, 225, 225));
        uLabel3.setText("FEATURE");
        uLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanel1.add(uLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        uLabel4.setForeground(new java.awt.Color(225, 225, 225));
        uLabel4.setText("NOW SHOWING");
        uLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanel1.add(uLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        uLabel5.setForeground(new java.awt.Color(225, 225, 225));
        uLabel5.setText("COMING SOON");
        uLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanel1.add(uLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, -1, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 990));

        jLabel4.setFont(new java.awt.Font("YuGothic", 1, 52)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(225, 225, 225));
        jLabel4.setText("CONTACT US");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 450, 80));

        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(237, 58, 133)));
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 1050, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ContactUs/info.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 540, 360));

        jScrollPane2.setViewportView(jPanel2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, -20, 1470, 830));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ContactUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContactUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContactUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContactUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContactUs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private view_components.ULabel uLabel1;
    private view_components.ULabel uLabel2;
    private view_components.ULabel uLabel3;
    private view_components.ULabel uLabel4;
    private view_components.ULabel uLabel5;
    // End of variables declaration//GEN-END:variables
}

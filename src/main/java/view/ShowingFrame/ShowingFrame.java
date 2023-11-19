/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.ShowingFrame;

/**
 *
 * @author adrianealtiche
 */
public class ShowingFrame extends javax.swing.JFrame {
   
   
    public ShowingFrame() {
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

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        uLabel1 = new view_components.ULabel();
        uLabel4 = new view_components.ULabel();
        uLabel5 = new view_components.ULabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        uMovieLabel1 = new view_components.UMovieLabel();
        uMovieLabel2 = new view_components.UMovieLabel();
        uMovieLabel3 = new view_components.UMovieLabel();
        uMovieLabel4 = new view_components.UMovieLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        uMovieLabel5 = new view_components.UMovieLabel();
        uMovieLabel6 = new view_components.UMovieLabel();
        uMovieLabel7 = new view_components.UMovieLabel();
        uMovieLabel8 = new view_components.UMovieLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 10, 52));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ShowingFrame/see.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-140, 10, 680, 110));

        uLabel1.setForeground(new java.awt.Color(225, 225, 225));
        uLabel1.setText("CONTACT US");
        uLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanel1.add(uLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        uLabel4.setForeground(new java.awt.Color(225, 225, 225));
        uLabel4.setText("NOW SHOWING");
        uLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanel1.add(uLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        uLabel5.setForeground(new java.awt.Color(225, 225, 225));
        uLabel5.setText("COMING SOON");
        uLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanel1.add(uLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 848));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel2.setBackground(new java.awt.Color(11, 0, 26));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("YuGothic", 1, 52)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(225, 225, 225));
        jLabel4.setText("NOW SHOWING");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 450, 80));

        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(237, 58, 133)));
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 1050, 70));

        uMovieLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ShowingFrame/Thumbnail/it.png"))); // NOI18N
        uMovieLabel1.setText("uMovieLabel1");
        uMovieLabel1.setMovieTitle("It");
        jPanel2.add(uMovieLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 120, 310, 400));

        uMovieLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ShowingFrame/Thumbnail/topgun.png"))); // NOI18N
        uMovieLabel2.setText("uMovieLabel1");
        uMovieLabel2.setMovieTitle("Top Gun : Maverick");
        jPanel2.add(uMovieLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 700, 310, 400));

        uMovieLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ShowingFrame/Thumbnail/endgame.png"))); // NOI18N
        uMovieLabel3.setText("uMovieLabel1");
        uMovieLabel3.setMovieTitle("Avengers: Endgame");
        jPanel2.add(uMovieLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 310, 400));

        uMovieLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ShowingFrame/Thumbnail/jurassicworld.png"))); // NOI18N
        uMovieLabel4.setText("uMovieLabel1");
        uMovieLabel4.setMovieTitle("Jurassic World");
        jPanel2.add(uMovieLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, 310, 400));

        jLabel7.setFont(new java.awt.Font("YuGothic", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(225, 225, 225));
        jLabel7.setText("IT");
        jLabel7.setToolTipText("");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 540, -1, -1));

        jLabel8.setFont(new java.awt.Font("YuGothic", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(225, 225, 225));
        jLabel8.setText("INSIDE OUT");
        jLabel8.setToolTipText("");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 540, -1, -1));

        jLabel9.setFont(new java.awt.Font("YuGothic", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(225, 225, 225));
        jLabel9.setText("TOP GUN: MAVERICK");
        jLabel9.setToolTipText("");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 1110, -1, -1));

        jLabel10.setFont(new java.awt.Font("YuGothic", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(225, 225, 225));
        jLabel10.setText("JURASSIC WORLD");
        jLabel10.setToolTipText("");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 540, -1, -1));

        uMovieLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ShowingFrame/Thumbnail/insideout.png"))); // NOI18N
        uMovieLabel5.setText("uMovieLabel1");
        uMovieLabel5.setMovieTitle("Inside Out");
        jPanel2.add(uMovieLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 310, 400));

        uMovieLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ShowingFrame/Thumbnail/titanic.png"))); // NOI18N
        uMovieLabel6.setText("uMovieLabel1");
        uMovieLabel6.setMovieTitle("Titanic");
        jPanel2.add(uMovieLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 700, 310, 400));

        uMovieLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ShowingFrame/Thumbnail/the karate kid.png"))); // NOI18N
        uMovieLabel7.setText("uMovieLabel1");
        uMovieLabel7.setMovieTitle("The Karate Kid");
        jPanel2.add(uMovieLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 700, 310, 400));

        uMovieLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ShowingFrame/Thumbnail/caroline.png"))); // NOI18N
        uMovieLabel8.setText("uMovieLabel1");
        uMovieLabel8.setMovieTitle("Caroline");
        jPanel2.add(uMovieLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 700, 310, 400));

        jLabel11.setFont(new java.awt.Font("YuGothic", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(225, 225, 225));
        jLabel11.setText("AVENGERS: END GAME");
        jLabel11.setToolTipText("");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 540, -1, -1));

        jLabel12.setFont(new java.awt.Font("YuGothic", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(225, 225, 225));
        jLabel12.setText("TITANIC");
        jLabel12.setToolTipText("");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 1110, -1, -1));

        jLabel13.setFont(new java.awt.Font("YuGothic", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(225, 225, 225));
        jLabel13.setText("THE KARATE KID");
        jLabel13.setToolTipText("");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 1110, -1, -1));

        jLabel14.setFont(new java.awt.Font("YuGothic", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(225, 225, 225));
        jLabel14.setText("CAROLINE");
        jLabel14.setToolTipText("");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 1110, -1, -1));

        jScrollPane2.setViewportView(jPanel2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, -10, 1220, 861));

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
            java.util.logging.Logger.getLogger(ShowingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowingFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private view_components.ULabel uLabel1;
    private view_components.ULabel uLabel4;
    private view_components.ULabel uLabel5;
    private view_components.UMovieLabel uMovieLabel1;
    private view_components.UMovieLabel uMovieLabel2;
    private view_components.UMovieLabel uMovieLabel3;
    private view_components.UMovieLabel uMovieLabel4;
    private view_components.UMovieLabel uMovieLabel5;
    private view_components.UMovieLabel uMovieLabel6;
    private view_components.UMovieLabel uMovieLabel7;
    private view_components.UMovieLabel uMovieLabel8;
    // End of variables declaration//GEN-END:variables
}

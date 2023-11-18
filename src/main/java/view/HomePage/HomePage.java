/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.HomePage;

import java.awt.Color;
import java.awt.Image;
import java.awt.geom.RoundRectangle2D;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

/**
 *
 * @author turin
 */
public class HomePage extends javax.swing.JFrame {

         int positionX = 0, positionY = 0;
         
    
    /**
     * Creates new form HomePage 
     */
    public HomePage() {
        setUndecorated(true);
        initComponents();
        //scalableLabel2.scale();
        //scalableLabel2.setOpaque(true);
        //scalableLabel2.setBackground(new Color(255, 255, 255, 128));
        
        this.setResizable(false); // Disable resize frame
        setLocationRelativeTo(null);
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 80, 80));
       
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        Line1 = new javax.swing.JLabel();
        uHome = new view_components.ULabel();
        uLogin = new view_components.ULabel();
        uSignup = new view_components.ULabel();
        Title_Label = new javax.swing.JLabel();
        Line = new javax.swing.JLabel();
        Gif1 = new javax.swing.JLabel();
        Blur0 = new javax.swing.JLabel();
        Blur1 = new javax.swing.JLabel();
        Blur2 = new javax.swing.JLabel();
        Blur3 = new javax.swing.JLabel();
        Blur4 = new javax.swing.JLabel();
        Blur5 = new javax.swing.JLabel();
        Blur6 = new javax.swing.JLabel();
        Blur7 = new javax.swing.JLabel();
        kGradientPanel3 = new com.k33ptoo.components.KGradientPanel();
        bDescrp = new javax.swing.JLabel();
        bDescrp2 = new javax.swing.JLabel();
        blur1 = new javax.swing.JLabel();
        gif1 = new javax.swing.JLabel();
        blur2 = new javax.swing.JLabel();
        text1 = new javax.swing.JLabel();
        blur3 = new javax.swing.JLabel();
        kGradientPanel4 = new com.k33ptoo.components.KGradientPanel();
        Descrp2 = new javax.swing.JLabel();
        Line3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        scalableLabel1 = new view_components.ScalableLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        kGradientPanel1.setkEndColor(new java.awt.Color(51, 0, 51));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 0, 0));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Line1.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        Line1.setForeground(new java.awt.Color(237, 237, 237));
        Line1.setText("__________");
        kGradientPanel1.add(Line1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, 200, 40));

        uHome.setForeground(new java.awt.Color(237, 237, 237));
        uHome.setText("<html>\n<p style = \"font-family:Yu Gothic Light Bold;\">\n<font size = \"3,5\">\nHOME\n</font size>\n</p>\n</html>\n");
        kGradientPanel1.add(uHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 280, -1, -1));

        uLogin.setForeground(new java.awt.Color(237, 237, 237));
        uLogin.setText("<html>\n<p style = \"font-family:Yu Gothic Light Bold;\">\n<font size = \"3.5\">\nLOGIN\n</font size>\n</p>\n</html>\n");
        uLogin.setDestFrame("Login");
        kGradientPanel1.add(uLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 280, -1, -1));

        uSignup.setForeground(new java.awt.Color(237, 237, 237));
        uSignup.setText("<html>\n<p style = \"font-family:Yu Gothic Light Bold;\">\n<font size = \"3.5\">\nSIGNUP\n</font size>\n</p>\n</html>\n");
        kGradientPanel1.add(uSignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 280, -1, -1));

        Title_Label.setFont(new java.awt.Font("Yu Gothic Light", 0, 48)); // NOI18N
        Title_Label.setForeground(new java.awt.Color(255, 255, 255));
        Title_Label.setText("SEENEMA");
        kGradientPanel1.add(Title_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, 240, 70));

        Line.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        Line.setForeground(new java.awt.Color(255, 255, 255));
        Line.setText("_________________");
        kGradientPanel1.add(Line, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 350, 350, -1));

        Gif1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomePage/Gif_1.gif"))); // NOI18N
        kGradientPanel1.add(Gif1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 1280, 720));

        Blur0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomePage/Gif_1Blur.gif"))); // NOI18N
        kGradientPanel1.add(Blur0, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 1270, 720));

        Blur1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomePage/Gif_1Blur.gif"))); // NOI18N
        kGradientPanel1.add(Blur1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1290, 720));

        Blur2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomePage/Gif_1Blur.gif"))); // NOI18N
        Blur2.setText("jLabel4");
        kGradientPanel1.add(Blur2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 1280, -1));

        Blur3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomePage/Gif_1Blur.gif"))); // NOI18N
        kGradientPanel1.add(Blur3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        Blur4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomePage/Gif_1Blur.gif"))); // NOI18N
        kGradientPanel1.add(Blur4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Blur5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomePage/Gif_1Blur.gif"))); // NOI18N
        kGradientPanel1.add(Blur5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, -1, -1));

        Blur6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomePage/Gif_1Blur.gif"))); // NOI18N
        kGradientPanel1.add(Blur6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, -1, -1));

        Blur7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomePage/Gif_1Blur.gif"))); // NOI18N
        kGradientPanel1.add(Blur7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        kGradientPanel3.setkEndColor(new java.awt.Color(51, 51, 51));
        kGradientPanel3.setkStartColor(new java.awt.Color(101, 87, 101));
        kGradientPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        kGradientPanel1.add(kGradientPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2550, 1420, 550));

        bDescrp.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        bDescrp.setForeground(new java.awt.Color(255, 255, 255));
        bDescrp.setText("<html>\n<center>\n<h style = \"text-align:justify\">\nLaser Projection Technology With SEENEMA anyone can have a great, enjoyable, and memorable movie experience. We also use the latest projection technology to showcase movies with crystal clear definition!\n</center>\n</h>\n</html>");
        kGradientPanel1.add(bDescrp, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 1960, 650, 240));

        bDescrp2.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        bDescrp2.setForeground(new java.awt.Color(255, 255, 255));
        bDescrp2.setText("<html> \n<center> \n<h style = \"text-align:justify\">\nDolby Atmos Transports you into the story with moving audio that flows all around you with breathtaking realism. Have a powerfully moving entertainment experience in our cinemas. \n</center>\n</h>\n </html>");
        kGradientPanel1.add(bDescrp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 2110, 510, 180));

        blur1.setFont(new java.awt.Font("Yu Gothic Light", 1, 23)); // NOI18N
        blur1.setForeground(new java.awt.Color(137, 129, 150));
        blur1.setText("<html>  <center> SEENEMA MUCH MORE THAN A BIG SCREEN </center> </html>");
        kGradientPanel1.add(blur1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 1970, 510, 50));

        gif1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomePage/Background.gif"))); // NOI18N
        kGradientPanel1.add(gif1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 1700, -1, -1));

        blur2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomePage/Background.gif"))); // NOI18N
        kGradientPanel1.add(blur2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1700, -1, -1));

        text1.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        text1.setForeground(new java.awt.Color(204, 204, 204));
        text1.setText("<html>\n<center>\nFeatures: • IMAX w/ Laser • Dolby Atmos • Laser Projection • MX4D Theater • VIP Theater\n</center>\n</html>");
        kGradientPanel1.add(text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 2180, 430, 102));

        blur3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomePage/Background.gif"))); // NOI18N
        kGradientPanel1.add(blur3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 1700, -1, -1));

        kGradientPanel4.setkEndColor(new java.awt.Color(51, 51, 51));
        kGradientPanel4.setkStartColor(new java.awt.Color(0, 0, 0));
        kGradientPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Descrp2.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        Descrp2.setForeground(new java.awt.Color(255, 255, 255));
        Descrp2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Descrp2.setText("<html>\n\n<p style = \"font-family:Yu Gothic Light Bold;\">\n<h style = \"text-align:justify\">\n <center>  IMAX with Laser is the next-generation in 4k laser projection systems, featuring a new optical engine and suite of proprietary IMAX technologies that delivers increased resolution, sharper and brighter images, deeper contrast as well as the widest range of colors available to filmmakers to present more distinct, exotic colors than ever before. The new system also features IMAX’s 12-channel sound technology that incorporates new side and overheard channels to deliver greater dynamic range and precision for ultimate audio immersion and sound you can feel. \n</h>\n</p>\n </center> \n</html>");
        Descrp2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        kGradientPanel4.add(Descrp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 420, 310));

        Line3.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        Line3.setForeground(new java.awt.Color(255, 255, 255));
        Line3.setText("____________________");
        kGradientPanel4.add(Line3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 410, 40));

        jLabel10.setFont(new java.awt.Font("sansserif", 1, 23)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(137, 129, 150));
        jLabel10.setText("<html>  <center> MUCH MORE THAN A BIG SCREEN </center> </html>");
        kGradientPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 3490, 390, 40));

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("<html>\n<center>\nLaser Projection Technology With Vista Cinemas anyone can have a great, enjoyable, and memorable movie experience. We also use the latest projection technology to showcase movies with crystal clear definition!\n</center>\n</html>");
        kGradientPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 3320, 340, 240));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomePage/Gif_Trailer.gif"))); // NOI18N
        kGradientPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, -1, -1));

        scalableLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomePage/Imax_Picture.png"))); // NOI18N
        scalableLabel1.setText("scalableLabel1");
        kGradientPanel4.add(scalableLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 230, 500, 170));

        kGradientPanel1.add(kGradientPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 850, 1420, 850));

        jScrollPane1.setViewportView(kGradientPanel1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 850));

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Blur0;
    private javax.swing.JLabel Blur1;
    private javax.swing.JLabel Blur2;
    private javax.swing.JLabel Blur3;
    private javax.swing.JLabel Blur4;
    private javax.swing.JLabel Blur5;
    private javax.swing.JLabel Blur6;
    private javax.swing.JLabel Blur7;
    private javax.swing.JLabel Descrp2;
    private javax.swing.JLabel Gif1;
    private javax.swing.JLabel Line;
    private javax.swing.JLabel Line1;
    private javax.swing.JLabel Line3;
    private javax.swing.JLabel Title_Label;
    private javax.swing.JLabel bDescrp;
    private javax.swing.JLabel bDescrp2;
    private javax.swing.JLabel blur1;
    private javax.swing.JLabel blur2;
    private javax.swing.JLabel blur3;
    private javax.swing.JLabel gif1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel3;
    private com.k33ptoo.components.KGradientPanel kGradientPanel4;
    private view_components.ScalableLabel scalableLabel1;
    private javax.swing.JLabel text1;
    private view_components.ULabel uHome;
    private view_components.ULabel uLogin;
    private view_components.ULabel uSignup;
    // End of variables declaration//GEN-END:variables

private void LabelColor (JLabel label){
    label.setBackground(new java.awt.Color(214,217,223));
    }
private void ResetColor (JLabel label){
    label.setBackground(new java.awt.Color(54,70,78));
    }

}
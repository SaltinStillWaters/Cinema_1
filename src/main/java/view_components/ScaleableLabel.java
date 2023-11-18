package view_components;

import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class ScaleableLabel extends JLabel
{
    public void scale()
    {
        ImageIcon imgIcon = (ImageIcon) this.getIcon();
        Image img = (imgIcon.getImage());
        
        Dimension dimension = this.getPreferredSize();
        Image imgScale = img.getScaledInstance(dimension.width, dimension.height, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        this.setIcon(scaledIcon);
    }
}

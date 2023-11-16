package view_components;

import view_components.interfaces.SwitchFrame;
import control.ClickedListener;
import javax.swing.JButton;


public class UButton extends JButton implements SwitchFrame
{
    private String destFrame;
    private String type;
    
    public UButton()
    {
        this.addMouseListener(new ClickedListener());
        destFrame = "";
        type = "";  //possible values: "back", "next", ""
    }

    public void setDestFrame(String destFrame)
    {
        this.destFrame = destFrame;
    }

    public void setType(String type)
    {
        this.type = type;
    }
    
    //Clickable Interface
        @Override
        public String getDestFrame()
        {
            return destFrame;
        }

        @Override
        public String getComponentType()
        {
            return type;
        }
}

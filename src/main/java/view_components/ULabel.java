package view_components;

import view_components.interfaces.SwitchFrame;
import control.ClickedListener;


public class ULabel extends ScaleableLabel implements SwitchFrame
{
    private String destFrame;
    private String type;
    
    public ULabel()
    {
        this.addMouseListener(new ClickedListener());
        destFrame = "";
        type = "";
    }

    public void setDestFrame(String destFrame)
    {
        this.destFrame = destFrame;
    }

    public void setType(String type)
    {
        this.type = type;
    }
    
    
    //CLickable Interface
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
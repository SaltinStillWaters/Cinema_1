package view_components;

import control.ClickedListener;
import javax.swing.ImageIcon;
import view_components.interfaces.ChangeState;
import model.theater_seats.Seat;


public class USeat extends ScaleableLabel implements ChangeState
{
    private Seat seat;
    public static int imageWidth;
    public static int imageHeight;
    
    static 
    {
        imageWidth = 25;
        imageHeight = 35;
    }
    
    public USeat()
    {
        this.addMouseListener(new ClickedListener());
    }
    
    public void setImage(String filename)
    {
        ImageIcon image = new ImageIcon(filename);
        this.setIcon(image);
    }
    
    public Seat getSeat()
    {
        return seat;
    }

    public void setSeat(Seat seat)
    {
        this.seat = seat;
    }

    
    @Override
    public void setState(String newState)
    {
        seat.setState(newState);
    }

    @Override
    public String getState()
    {
        return seat.getState();
    }
}

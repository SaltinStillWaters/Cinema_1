package view_components;

import javax.swing.ImageIcon;
import view_components.interfaces.ChangeState;
import javax.swing.JLabel;
import model.theater_seats.Seat;


public class USeat extends JLabel implements ChangeState
{
    private Seat seat;

    public USeat()
    {
        this.setImage("src/main/java/view/SeatFrame/seat_available.png");
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
    
    
}

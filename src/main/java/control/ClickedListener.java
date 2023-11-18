package control;
        
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import model.theater_seats.TheaterSeat;
import view_components.ScaleableLabel;
import view_components.UMovieLabel;
import view_components.USeat;
import view_components.interfaces.ChangeState;
import view_components.interfaces.SwitchFrame;

public class ClickedListener extends MouseAdapter
{

    @Override
    public void mouseClicked(MouseEvent e)
    {
        ControlData ctrlData = ControlData.getInstance();
        
        Object source = e.getSource();
        
        if (source instanceof SwitchFrame)
        {
            SwitchFrame component = (SwitchFrame) source;   //Component that triggered the event

            
            //Determine destFrame
            String destFrame = "";
            if (component.getComponentType().equals("next"))
            {
                destFrame = ctrlData.getNextFrame();
            }
            else if (component.getComponentType().equals("back"))
            {
                if (!ctrlData.getPrevFrame().isBlank())
                {
                    destFrame = ctrlData.getPrevFrame();
                }
            }
            else
            {
                 destFrame = component.getDestFrame();
            }
            
            ControlFrame.changeFrame(destFrame);
        }
        else if (source instanceof UMovieLabel)
        {
            ControlSeats ctrlSeats = ControlSeats.getInstance();
            
            UMovieLabel movieLabel = (UMovieLabel) source;
            
            TheaterSeat tSeat = ctrlSeats.getCurrTheaterSeat();
            tSeat.setMovieTitle(movieLabel.getMovieTitle());
        }
        else if (source instanceof ChangeState)
        {
            ChangeState component = (ChangeState) source;
            
            if (source instanceof USeat)
            {
                USeat uSeat = (USeat) source;
                
                if (component.getState().equals("available"))
                {
                    component.setState("selected");
                    
                    uSeat.setIcon(new ImageIcon("src/main/resources/SeatFrame/seat_selected.png"));
                    uSeat.setSize(USeat.imageWidth, USeat.imageHeight);
                    uSeat.scale();
                    
                }
                else if (component.getState().equals("selected"))
                {
                    component.setState("available");
                    
                    uSeat.setIcon(new ImageIcon("src/main/resources/SeatFrame/seat_available.png"));
                    uSeat.setSize(USeat.imageWidth, USeat.imageHeight);
                    uSeat.scale();
                }
            }
           
        }
        else
        {
            System.out.println("Mouse clicked is not a Clickable");
        }
        
    }
    
}
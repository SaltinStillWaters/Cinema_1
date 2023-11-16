package control;
        
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import model.theater_seats.TheaterSeat;
import view_components.UMovieLabel;
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
        else
        {
            System.out.println("Mouse clicked is not a Clickable");
        }
        
    }
    
}
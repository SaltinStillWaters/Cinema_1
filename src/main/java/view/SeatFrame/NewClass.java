package view.SeatFrame;

import control.ControlSeats;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import model.theater_seats.Seat;
import model.theater_seats.Seats;
import model.theater_seats.TheaterSeat;
import view_components.USeat;


public class NewClass extends javax.swing.JFrame
{
    private JPanel seatPanel;
    
    /**
     * Creates new form SeatFrame
     */
    
    public NewClass()
    {
        int seatHGap = 2;
        int seatVGap = 2;
        
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        this.setPreferredSize(new Dimension(800, 600));
                
        Dimension seatPanelDimension = new Dimension((USeat.imageWidth + seatHGap) * Seats.rows, (USeat.imageHeight  + seatVGap) * Seats.cols);
        
        seatPanel = new JPanel(new GridLayout(Seats.rows, Seats.cols, seatHGap, seatVGap));
        seatPanel.setPreferredSize(seatPanelDimension);


        //init Seats
        ControlSeats ctrlSeats = ControlSeats.getInstance();
        TheaterSeat tSeatCurr = ctrlSeats.getCurrTheaterSeat();
        TheaterSeat tSeat = ctrlSeats.getTheaterSeats().getTheaterSeat(tSeatCurr);   //reference for the Model.TheaterSeat
        
        Seats seats = tSeat.getSeats();
        ArrayList<ArrayList<Seat>> seatArray = seats.getSeats();
        ArrayList<ArrayList<USeat>> uSeatArray = new ArrayList<>();
        
        for (int x = 0; x < seatArray.size(); ++x)
        {
            ArrayList<Seat> seatTempArray = seatArray.get(x);
            ArrayList<USeat> uSeatTempArray = new ArrayList<>();
            for (int y = 0; y < seatTempArray.size(); ++y)
            {
                Seat seatTemp = seatTempArray.get(y);
                uSeatTempArray.add(new USeat());
                USeat uSeatTemp = uSeatTempArray.get(y);
                
                Dimension seatDimension = new Dimension(USeat.imageWidth, USeat.imageHeight);
                uSeatTemp.setPreferredSize(seatDimension);
                uSeatTemp.setSize(seatDimension);
                uSeatTemp.setIcon(new ImageIcon("src/main/resources/SeatFrame/seat_available.png"));
                uSeatTemp.scale();
                
                uSeatTemp.setSeat(seatTemp);
                seatPanel.add(uSeatTempArray.get(y));
            }
            
            uSeatArray.add(uSeatTempArray);
        }
        
        this.add(seatPanel);
        
        pack();
    }

}

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


public class NewClass_2 extends javax.swing.JFrame
{
    private JPanel seatPanel1;
    private JPanel seatPanel2;
    private JPanel seatPanel3;
    private JPanel seatPanel4;
    
    /**
     * Creates new form SeatFrame
     */
    
    public NewClass_2()
    {
        int seatHGap = 2;
        int seatVGap = 2;
        
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        this.setPreferredSize(new Dimension(800, 600));
                
        Dimension seatPanelDimension = new Dimension(((USeat.imageWidth + seatHGap) * Seats.rows) / 4, ((USeat.imageHeight  + seatVGap) * Seats.cols) / 4);
        
        seatPanel1 = new JPanel(new GridLayout(Seats.rows / 4, Seats.cols / 4, seatHGap, seatVGap));
        seatPanel1.setPreferredSize(seatPanelDimension);
        
        seatPanel2 = new JPanel(new GridLayout(Seats.rows / 4, Seats.cols / 4, seatHGap, seatVGap));
        seatPanel2.setPreferredSize(seatPanelDimension);
        
        seatPanel3 = new JPanel(new GridLayout(Seats.rows / 4, Seats.cols / 4, seatHGap, seatVGap));
        seatPanel3.setPreferredSize(seatPanelDimension);
        
        seatPanel4 = new JPanel(new GridLayout(Seats.rows / 4, Seats.cols / 4, seatHGap, seatVGap));
        seatPanel4.setPreferredSize(seatPanelDimension);

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
                uSeatTemp.setIcon(new ImageIcon("src/main/resources/SeatFrame/seat_available.png"));
                uSeatTemp.scale();
                
                uSeatTemp.setSeat(seatTemp);
                
                if (x < seatArray.size() / 2)
                {
                    if (y < seatTempArray.size() / 2)
                    {
                        seatPanel1.add(uSeatTempArray.get(y));
                    }
                    else
                    {
                        seatPanel2.add(uSeatTempArray.get(y));
                    }
                }
                else
                {
                    if (y < seatTempArray.size() / 2)
                    {
                        seatPanel3.add(uSeatTempArray.get(y));
                    }
                    else
                    {
                        seatPanel4.add(uSeatTempArray.get(y));
                    }
                }
                
            }
            
            uSeatArray.add(uSeatTempArray);
        }
        
        this.add(seatPanel1);
        this.add(seatPanel2);
        this.add(seatPanel3);
        this.add(seatPanel4);
        
        pack();
    }

}

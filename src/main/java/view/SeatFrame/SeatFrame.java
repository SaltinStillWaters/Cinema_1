package view.SeatFrame;

import control.ControlSeats;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import model.theater_seats.Seat;
import model.theater_seats.Seats;
import model.theater_seats.TheaterSeat;
import view_components.USeat;


import javax.swing.*;
import java.util.ArrayList;
import view_components.ULabel;

public class SeatFrame extends javax.swing.JFrame {
    private JPanel seatPanel1, seatPanel2, seatPanel3, seatPanel4;
    private JLabel seatSelectedLabel;
    private ULabel backButton;
    
    //seats
    private ArrayList<ArrayList<USeat>> uSeats;
    
    
    public SeatFrame() 
    {
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        this.setPreferredSize(new Dimension(840, 450));
        
        int seatHGap = 2;
        int seatVGap = 2;

        // Create four separate panels for each block
        seatPanel1 = new JPanel(new GridLayout(Seats.rows / 2, Seats.cols / 2, seatHGap, seatVGap));
        seatPanel2 = new JPanel(new GridLayout(Seats.rows / 2, Seats.cols / 2, seatHGap, seatVGap));
        seatPanel3 = new JPanel(new GridLayout(Seats.rows / 2, Seats.cols / 2, seatHGap, seatVGap));
        seatPanel4 = new JPanel(new GridLayout(Seats.rows / 2, Seats.cols / 2, seatHGap, seatVGap));

        
        //init USeats
        uSeats = new ArrayList<>();
        
        for (int row = 0; row < Seats.rows; ++row)
        {
            ArrayList<USeat> uSeatArray = new ArrayList<>();
            
            for (int col = 0; col < Seats.cols; ++col)
            {
                USeat uSeat = new USeat();
                uSeatArray.add(uSeat);
                            
                // Add seats to the appropriate panel
                if (row < Seats.rows / 2) 
                {
                    if (col < Seats.cols / 2) 
                    {
                        seatPanel1.add(uSeat);
                    } 
                    else 
                    {
                        seatPanel2.add(uSeat);
                    }
                } 
                else 
                {
                    if (col < Seats.cols / 2) 
                    {
                        seatPanel3.add(uSeat);
                    } else 
                    {
                        seatPanel4.add(uSeat);
                    }
                }
            }
            
            uSeats.add(uSeatArray);
        }
        

        // Add the four panels to the frame
        this.add(seatPanel1);
        this.add(seatPanel2);
        this.add(seatPanel3);
        this.add(seatPanel4);

        
        // seat selected summary
        JLabel categoryLabel = new JLabel();
        this.add(categoryLabel);
        
        seatSelectedLabel = new JLabel();
        this.add(seatSelectedLabel);
        
        
        backButton = new ULabel();
        backButton.setType("back");
        backButton.setText("back");
        this.add(backButton);
        
        pack();
      
    }
    
    public void constructSeats()
    {
        //init Seats
        ControlSeats ctrlSeats = ControlSeats.getInstance();
        TheaterSeat tSeatCurr = ctrlSeats.getCurrTheaterSeat();
        TheaterSeat tSeat = ctrlSeats.getTheaterSeats().getTheaterSeat(tSeatCurr);   //reference for the Model.TheaterSeat
        
        
        ArrayList<ArrayList<Seat>> seats = tSeat.getSeats().getSeats();
        
        for (int row = 0; row < Seats.rows; ++row)
        {
            ArrayList<USeat> uSeatArray = uSeats.get(row);
            ArrayList<Seat> seatArray = seats.get(row);
            
            for (int col = 0; col < Seats.cols; ++col)
            {
                USeat uSeat = uSeatArray.get(col);
                Seat seat = seatArray.get(col);
                
                uSeat.setSeat(seat);
                
                
                //set icon
                Dimension seatDimension = new Dimension(USeat.imageWidth, USeat.imageHeight);
                uSeat.setPreferredSize(seatDimension);
                uSeat.setSize(seatDimension);
                
                switch (seat.getState())
                {
                    case "available":
                        uSeat.setIcon(new ImageIcon("src/main/resources/SeatFrame/seat_available.png"));
                        break;
                        
                    case "selected":
                        uSeat.setIcon(new ImageIcon("src/main/resources/SeatFrame/seat_selected.png"));
                        break;
                        
                    case "reserved":
                        uSeat.setIcon(new ImageIcon("src/main/resources/SeatFrame/seat_reserved.png"));
                        break;
                        
                    default:
                        System.out.println("Seat state unknown SeatFrame.constructSeats()");;
                }
                
                uSeat.scale();
                
            }
            
            uSeats.add(uSeatArray);
        }
    }
    
    public void updateTextField()
    {
        String selectedSeats = "";
        
        for (int row = 0; row < Seats.rows; ++row)
        {
            ArrayList<USeat> uSeatArray = uSeats.get(row);
            
            for (int col = 0; col < Seats.cols; ++col)
            {
                USeat uSeat = uSeatArray.get(col);
                
                if (uSeat.getState().equals("selected"))
                {
                    selectedSeats += (uSeat.getSeat().getLocation() + ", ");
                }
            }
        }
        
        setTFieldText("Selected seats: " + selectedSeats);
    }
    
    public String getTFieldText()
    {
        return seatSelectedLabel.getText();
    }
    
    public void setTFieldText(String text)
    {
        seatSelectedLabel.setText(text);
    }
}
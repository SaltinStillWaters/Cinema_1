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


import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class SeatFrame extends javax.swing.JFrame {
    private JPanel seatPanel1, seatPanel2, seatPanel3, seatPanel4;
    private JTextField tField;
    
    public SeatFrame() 
    {
        int seatHGap = 2;
        int seatVGap = 2;

        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        this.setPreferredSize(new Dimension(800, 600));

        // Create four separate panels for each block
        seatPanel1 = new JPanel(new GridLayout(Seats.rows / 2, Seats.cols / 2, seatHGap, seatVGap));
        seatPanel2 = new JPanel(new GridLayout(Seats.rows / 2, Seats.cols / 2, seatHGap, seatVGap));
        seatPanel3 = new JPanel(new GridLayout(Seats.rows / 2, Seats.cols / 2, seatHGap, seatVGap));
        seatPanel4 = new JPanel(new GridLayout(Seats.rows / 2, Seats.cols / 2, seatHGap, seatVGap));

        //init Seats
        ControlSeats ctrlSeats = ControlSeats.getInstance();
        TheaterSeat tSeatCurr = ctrlSeats.getCurrTheaterSeat();
        TheaterSeat tSeat = ctrlSeats.getTheaterSeats().getTheaterSeat(tSeatCurr);   //reference for the Model.TheaterSeat

        Seats seats = tSeat.getSeats();
        ArrayList<ArrayList<Seat>> seatArray = seats.getSeats();
        ArrayList<ArrayList<USeat>> uSeatArray = new ArrayList<>();

        for (int x = 0; x < seatArray.size(); ++x) {
            for (int y = 0; y < seatArray.get(x).size(); ++y) {
                Seat seatTemp = seatArray.get(x).get(y);
                USeat uSeatTemp = new USeat();

                Dimension seatDimension = new Dimension(USeat.imageWidth, USeat.imageHeight);
                uSeatTemp.setPreferredSize(seatDimension);
                uSeatTemp.setSize(seatDimension);
                uSeatTemp.setIcon(new ImageIcon("src/main/resources/SeatFrame/seat_available.png"));
                uSeatTemp.scale();

                uSeatTemp.setSeat(seatTemp);

                // Add seats to the appropriate panel
                if (x < seatArray.size() / 2) {
                    if (y < seatArray.get(x).size() / 2) {
                        seatPanel1.add(uSeatTemp);
                    } else {
                        seatPanel2.add(uSeatTemp);
                    }
                } else {
                    if (y < seatArray.get(x).size() / 2) {
                        seatPanel3.add(uSeatTemp);
                    } else {
                        seatPanel4.add(uSeatTemp);
                    }
                }
            }
        }

        // Add the four panels to the frame
        this.add(seatPanel1);
        this.add(seatPanel2);
        this.add(seatPanel3);
        this.add(seatPanel4);

        tField = new JTextField();
        this.add(tField);
        pack();
        
        
    }
    
    public String getTFieldText()
    {
        return tField.getText();
    }
    
    public void setTFieldText(String text)
    {
        tField.setText(text);
    }
}
package view.SeatFrame;

import control.ControlSeats;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import model.theater_seats.Seat;
import model.theater_seats.Seats;
import model.theater_seats.TheaterSeat;
import view_components.USeat;

/**
 *
 * @author Salti
 */
public class SeatFrame extends javax.swing.JFrame
{

    /**
     * Creates new form SeatFrame
     */
    public SeatFrame()
    {
        initComponents();
        
//        Seat seat = new Seat("A1");
//        ImageIcon img = new ImageIcon("resources/SeatFrame/seat_available.png");
//        uSeat.setIcon(img);
//        this.add(uSeat);
//        
//        JLabel lbl = new JLabel(img);
//        this.add(lbl);
        //init Seats
//        ControlSeats ctrlSeats = ControlSeats.getInstance();
//        TheaterSeat tSeatCurr = ctrlSeats.getCurrTheaterSeat();
//        TheaterSeat tSeat = ctrlSeats.getTheaterSeats().getTheaterSeat(tSeatCurr);   //reference for the Model.TheaterSeat
//        
//        Seats seats = tSeat.getSeats();
//        ArrayList<ArrayList<Seat>> seatArray = seats.getSeats();
//        ArrayList<ArrayList<USeat>> uSeatArray = new ArrayList<>();
//        
//        for (int x = 0; x < seatArray.size(); ++x)
//        {
//            ArrayList<Seat> seatTempArray = seatArray.get(x);
//            ArrayList<USeat> uSeatTempArray = new ArrayList<>();
//            for (int y = 0; y < seatTempArray.size(); ++y)
//            {
//                Seat seatTemp = seatTempArray.get(y);
//                uSeatTempArray.add(new USeat(seatTemp));
//                
//                this.add(uSeatTempArray.get(y));
//            }
//            uSeatArray.add(uSeatTempArray);
//        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        uSeat1 = new view_components.USeat();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        uSeat1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SeatFrame/seat_available.png"))); // NOI18N
        uSeat1.setText("uSeat1");
        getContentPane().add(uSeat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 305, -1));

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 190, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private view_components.USeat uSeat1;
    // End of variables declaration//GEN-END:variables
}

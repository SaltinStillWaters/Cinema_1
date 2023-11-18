package model.theater_seats;

import java.util.ArrayList;


/**
 * Represents a set of seats in the cinema
 */
public class Seats 
{
    private ArrayList<ArrayList<Seat>> seats;
    public static int rows;
    public static int cols;
    
    static
    {
        rows = 20;
        cols = 15;
    }
    
    public Seats()
    {   
        seats = new ArrayList<>();
        
        for (int x = 0; x < rows; ++x)
        {     
            ArrayList<Seat> row = new ArrayList<>();
            String rowLocation = String.valueOf((char) (x + 'A'));
            
            for (int y = 0; y < cols; ++y)
            {
                String location = rowLocation + String.valueOf(y);
               
                row.add(new Seat(location));
            }
            seats.add(row);
        }
    }
    
    public Seat getSeat(String location)
    {
        int row = Integer.parseInt(location.substring(0, 1)) - 'A';
        int col = Integer.parseInt(location.substring(1));
        
        Seat seat;
        
        if (row >= Seats.rows || col >= Seats.cols)
        {
            seat = null;
        }
        else
        {
            seat = (seats.get(row)).get(col);
        }
        
        return seat;
    }
    
    public int getCols()
    {
        return cols;
    }

    public int getRows()
    {
        return rows;
    }

    public ArrayList<ArrayList<Seat>> getSeats()
    {
        return seats;
    }
    
    
}
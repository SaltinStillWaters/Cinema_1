package model.theater_seats;

import java.util.ArrayList;


public class Seats 
{
    private ArrayList<ArrayList<Seat>> seats;
    private static int rows;
    private static int cols;
    
    static
    {
        rows = 10;
        cols = 20;
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
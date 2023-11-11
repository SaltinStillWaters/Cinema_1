package model.theater_seats;

import java.util.ArrayList;


public class TheaterSeats 
{
    private ArrayList<TheaterSeat> theaterSeats;

    public TheaterSeats(ArrayList<TheaterSeat> theaterSeats)
    {
        this.theaterSeats = theaterSeats;
    }
    
    public TheaterSeat getTheaterSeat(String movieTitle, String date, String time)
    {
        TheaterSeat theaterSeat = null;
        
        for (TheaterSeat iter : theaterSeats)
        {
            if (movieTitle.equals(iter.getMovieTitle()))
            {
                if (date.equals(iter.getDate()))
                {
                    if (time.equals(iter.getTime()))
                    {
                        theaterSeat = iter;
                    }
                }
            }
        }
        
        return theaterSeat;
    }
}

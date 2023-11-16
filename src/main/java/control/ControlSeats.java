package control;

import model.theater_seats.TheaterSeat;
import model.theater_seats.TheaterSeats;


public class ControlSeats 
{
    private final TheaterSeats theaterSeats;
    private TheaterSeat currTheaterSeat;
    
    private static ControlSeats instance;
    
    
    public static ControlSeats getInstance()
    {
        if (instance == null)
        {
            instance = new ControlSeats();
        }
        
        return instance;
    }
    
    public ControlSeats()
    {
        theaterSeats = TheaterSeats.getInstance();
        currTheaterSeat = new TheaterSeat("movie title", "date", "time");
    }
    
    public TheaterSeats getTheaterSeats()
    {
        return theaterSeats;
    }

    public void setCurrTheaterSeat(TheaterSeat currTheatherSeat)
    {
        this.currTheaterSeat = currTheatherSeat;
    }

    public TheaterSeat getCurrTheaterSeat()
    {
        return currTheaterSeat;
    }
}

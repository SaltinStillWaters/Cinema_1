package model.theater_seats;

import java.util.ArrayList;


public class TheaterSeat
{
    private String movieTitle;
    private Seats seats;
    private String date;
    private String time;

    public TheaterSeat(String movieTitle, String date, String time)
    {
        this.movieTitle = movieTitle;
        this.date = date;
        this.time = time;
        
        this.seats = new Seats();
    }
    
    public TheaterSeat(ArrayList<String> info)
    {
        this.movieTitle = info.get(0);
        this.date = info.get(1);
        this.time = info.get(2);
        
        this.seats = new Seats();
    }

    public void setDate(String date)
    {
        this.date = date;
    }

    public void resetSeats()
    {
        seats.resetSelected();
    }
    
    public void setMovieTitle(String movieTitle)
    {
        this.movieTitle = movieTitle;
    }

    public void setTime(String time)
    {
        this.time = time;
    }
    
    
    public String getDate()
    {
        return date;
    }

    public String getMovieTitle()
    {
        return movieTitle;
    }

    public Seats getSeats()
    {
        return seats;
    }

    public String getTime()
    {
        return time;
    }

    @Override
    public String toString()
    {
        return  movieTitle + "\n" +
                date + "\n" +
                time + "\n";
    }
    
     
}

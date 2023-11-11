package model.theater_seats;


public class TheaterSeat
{
    private String movieTitle;
    private Seats seats;
    private String date;
    private String time;

    public TheaterSeat(String movieTitle, Seats seats, String date, String time)
    {
        this.movieTitle = movieTitle;
        this.seats = seats;
        this.date = date;
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
    
     
}

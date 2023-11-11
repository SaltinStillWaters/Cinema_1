package model.theater_seats;


public class Seat 
{
    private String state;
    private final String location;

    public Seat(String location)
    {
        this.state = "available";
        this.location = location;
    }

    public String getLocation()
    {
        return location;
    }

    public String getState()
    {
        return state;
    }

    public void setState(String state)
    {
        this.state = state;
    }
    
    
}
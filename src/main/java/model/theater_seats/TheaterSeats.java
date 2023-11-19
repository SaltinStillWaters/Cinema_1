package model.theater_seats;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;


public class TheaterSeats 
{
    private ArrayList<TheaterSeat> theaterSeats;
    private static TheaterSeats instance;
    
    public TheaterSeats()
    {
        theaterSeats = new ArrayList<>();
        
        ArrayList<String> infoHolder = new ArrayList<>();
        
        Path filePath = Paths.get("src/main/java/model/theater_seats/seatInfo.txt");
        try (Scanner scanner = new Scanner(filePath))
        {
            while (scanner.hasNextLine())
            {
                String line = scanner.nextLine();
                if (line.isEmpty())
                {
                    this.theaterSeats.add(new TheaterSeat(infoHolder));
                    infoHolder.clear();
                    continue;
                }
                infoHolder.add(line);
            }
            if (!infoHolder.isEmpty())
            {
                this.theaterSeats.add(new TheaterSeat(infoHolder));
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    
    public static TheaterSeats getInstance()
    {
        if (instance == null)
        {
            instance = new TheaterSeats();
        }
        
        return instance;
    }

    public void resetSeats()
    {
        for (TheaterSeat iter : theaterSeats)
        {
            iter.resetSeats();
        }
    }
    
    public TheaterSeat getTheaterSeat(TheaterSeat theaterSeat)
    {
        return getTheaterSeat(theaterSeat.getMovieTitle(), theaterSeat.getDate(), theaterSeat.getTime());
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

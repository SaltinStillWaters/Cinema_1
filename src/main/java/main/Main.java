package main;

import control.ControlData;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;
import model.Movies.Movie;


public class Main 
{
    public static void main(String args[])  
    {
        ControlData ctrlData = ControlData.getInstance();
         
        JFrame mainFrame = ctrlData.getFrameByName(ctrlData.getCurrFrame());
        mainFrame.setVisible(true);
        
         ArrayList<Movie> cinemaMovies = new ArrayList<>();
        ArrayList<String> categories = new ArrayList<>();
       
        Path filePath = Paths.get("src/main/java/model/Movies/moviesInfos.txt"); 
        try (Scanner scanner = new Scanner(filePath))
        {
            while (scanner.hasNextLine())
            {    
                String line = scanner.nextLine();
                if (line.isEmpty())
                {
                    Movie movie = new Movie(categories);             
                    cinemaMovies.add(movie);
                    categories.clear();
                    continue;
                }
                categories.add(line);
            }
            if(!categories.isEmpty()) //will add last movie if there is no empty line at the end of the file
            { 
                Movie lastMovie = new Movie(categories); 
                cinemaMovies.add(lastMovie);
            }
            
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        
    }   
}

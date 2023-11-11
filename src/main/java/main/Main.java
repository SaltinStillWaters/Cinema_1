package main;

import control.ControlData;
import model.Movies.Movie;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths; 
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;

public class Main 
{
    public static void main(String args[])  
    {
        ControlData ctrlData = ControlData.getInstance();
         
        JFrame mainFrame= ctrlData.getFrameByName(ctrlData.getCurrFrame());
        mainFrame.setVisible(true);
    
        ArrayList<Movie> cinemaMovies = new ArrayList<>();
        ArrayList<String> categories = new ArrayList<>();
        
        Path filePath = Paths.get("\\Users\\vianv\\Documents\\NetBeansProjects\\Cinema\\src\\main\\java\\Cine\\model\\MovieObjects.txt"); //how to shorten this?
        try (Scanner scanner = new Scanner(filePath)){
            while (scanner.hasNextLine()){    
                String line = scanner.nextLine();
                if (line.isEmpty()){
                    Movie movie = new Movie(categories);             
                    cinemaMovies.add(movie);
                    categories.clear();
                    continue;
                }
                categories.add(line);
            }
            
        } catch (IOException e){
            e.printStackTrace();
        }
    }   
}

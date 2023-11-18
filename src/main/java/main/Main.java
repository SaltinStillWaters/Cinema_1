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
    /**
     * Converts password string into asterisk string.
     * 
     * This method counts the length of the password input and replace
     * each character with asterisk.
     * 
     * @param password the password to be encrypted.
     * @return an asterisks String with the same length as the password input. 
     */
    public static String encryptPassword(String password){
        StringBuilder encryptedPw = new StringBuilder();
        for (int i = 0; i < password.length(); i++){
            encryptedPw.append("*");
        }
        return encryptedPw.toString();
    }
    
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
            if(!categories.isEmpty()) 
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

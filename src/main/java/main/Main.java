package main;

import control.ControlData;
import model.Movies.Movie;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths; 
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;
import model.Account;
import model.Accounts;
import model.theater_seats.TheaterSeats;


public class Main 
{
    public static void main(String args[])  
    {
        ControlData ctrlData = ControlData.getInstance();
         
        JFrame mainFrame= ctrlData.getFrameByName(ctrlData.getCurrFrame());
        mainFrame.setVisible(true);
       
        Scanner scanner = new Scanner(System.in);
        Accounts accounts = new Accounts();
        boolean createMoreAcc = true;
        while(createMoreAcc){
            System.out.print("Enter First Name: ");
            String firstName = scanner.nextLine();
            System.out.print("Enter Last Name: ");
            String lastName = scanner.nextLine();
            System.out.print("Enter Username: ");
            String userName = scanner.nextLine();
            System.out.print("Enter Password: ");
            String password = scanner.nextLine();
            System.out.print("Enter Email: ");
            String email = scanner.nextLine();
            System.out.print("Enter Phone Number: ");
            String phoneNumber = scanner.nextLine();
            
            Account newAcc = new Account(firstName, lastName, userName, password, email, phoneNumber);
            accounts.addAccount(newAcc);
            
            System.out.println("Account Created");
            System.out.print("Add another account: ");
            String createAnother = scanner.nextLine();
            
            createMoreAcc = createAnother.equalsIgnoreCase("yes");   
        }
        
        int choice;
        do{
        System.out.println("Log In");
        System.out.print("Username: ");
        String loginUsername = scanner.nextLine();
        System.out.print("Password: ");
        String loginPassword = scanner.nextLine();
        
        boolean loginResult = accounts.logIn(loginUsername, loginPassword);
        if (loginResult){
            System.out.println("Log In Successful!");
            System.out.print("Log In again (1) or exit (0): ");
                choice = scanner.nextInt();
                scanner.nextLine();
        }else {
            System.out.println("Invalid Input, Please try again...");
            choice = 1;
        }
        
        } while(choice != 0);
        
        /*ArrayList<Movie> cinemaMovies = new ArrayList<>();
        ArrayList<String> categories = new ArrayList<>();
       
        Path filePath = Paths.get("src/main/java/model/Movies/moviesInfo.txt"); 
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
        }*/
        
        /*for (Movie movies : cinemaMovies)
        {
            System.out.println(movies);
        }*/
        
        TheaterSeats.getInstance();

    }   
}

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
        
        
    }   
}

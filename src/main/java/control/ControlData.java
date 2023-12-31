package control;


import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.stream.Stream;
import java.util.stream.Collectors;

import javax.swing.JFrame;
import model.Movies.Movie;
import view.ComingSoon.ComingSoon;
import view.ContactUs.ContactUs;
import view.Gcash.Gcash;
import view.HomePage.HomePage;
import view.MovieInfoFrame.MovieInfoFrame;
import view.PaymentDetails.PaymentDetails;
import view.Receipt.Receipt;
import view.SeatFrame.SeatFrame;
import view.ShowingFrame.ShowingFrame;
import view.SignIn.SignIn;
import view.SignUp.SignUp;
import view.SignUpFrame.SignUpFrame;


public class ControlData
{
    //FIELDS
    private final HashMap<String, JFrame> frameByName;
    private final ArrayList<String> frameNames;
    private final ArrayList<JFrame> jFrames;
    
    private Deque<String> frameHistory;
    private static ControlData instance;
    private Movie currMovie;
    
    //INIT
    /**
     * Constructor for singleton ControlData.
     * For this reason, all Frame sub-classes need to be
     * declared here.
     * List Frame names in 'jFrames' and place their
     * names as Strings in 'frameNames'
     */
    public ControlData()
    {  
        //list frames here:
            frameNames  = Stream.of("ShowingFrame", "Gcash", "HomePage", "SeatFrame","ComingSoon", "ContactUs", "MovieInfoFrame",
                    "PaymentDetails", "Receipt", "SignIn", "SignUp", "SignUpFrame")
                    .collect(Collectors.toCollection(ArrayList<String>::new));

            jFrames     = Stream.of(new ShowingFrame(), new Gcash(), new HomePage(), new SeatFrame(), new ComingSoon(), new ContactUs(), new MovieInfoFrame(),
                     new PaymentDetails(), new Receipt(), new SignIn(), new SignUp(), new SignUpFrame())
                    .collect(Collectors.toCollection(ArrayList<JFrame>::new));
        
            
        frameByName = new HashMap<>();
        for (int x = 0; x < frameNames.size(); ++x)
        {
            frameByName.put(frameNames.get(x), jFrames.get(x));
        }
           
        
        frameHistory = new LinkedList<>();
        frameHistory.push(frameNames.get(0));
    }
    
    public static ControlData getInstance()
    {
        if (instance == null)
        {
            instance = new ControlData();
        }
        
        return instance;
    }

    public Movie getCurrMovie()
    {
        return currMovie;
    }

    public void setCurrMovie(Movie currMovie)
    {
        this.currMovie = currMovie;
    }
    
    
    //CUSTOM_METHODS
    public JFrame getFrameByName(String frame)
    {
        return frameByName.get(frame);
    }
    
    public String popFrameHistory()
    {
        if (frameHistory.isEmpty())
        {
            return null;
        }
        
        return frameHistory.pop();
    }
    
    public void pushFrameHistory(String frame)
    {
        frameHistory.push(frame);
    }
    
    public String getCurrFrame()
    {
        return frameHistory.peek();
    }
    
    public String getNextFrame()
    {
        String nextFrame = "";
        
        boolean isFound = false;
        for (String frame : frameNames)
        {
            if (isFound)
            {
                nextFrame = frame;
                break;
            }
            
            if (frame.equals(getCurrFrame()))
            {
                isFound = true;
            }
        }
       
       return nextFrame;
    }
    
    public String getPrevFrame()
    {
        if (frameHistory.isEmpty())
        {
            return "";
        }
        else
        {
            String top = frameHistory.pop();
            String prev = frameHistory.peek();
            frameHistory.push(top);

            return prev;
        }
    }
}
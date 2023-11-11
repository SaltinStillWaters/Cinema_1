package control;


import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.stream.Stream;
import java.util.stream.Collectors;

import javax.swing.JFrame;
import view.HomeFrame;
import view.NextFrame;



public class ControlData
{
    //FIELDS
    private final HashMap<String, JFrame> frameByName;
    private final ArrayList<String> frameNames;
    private final ArrayList<JFrame> jFrames;
    
    private Deque<String> frameHistory;
    private static ControlData instance;
    
    
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
            frameNames  = Stream.of("HomeFrame", "NextFrame")
                    .collect(Collectors.toCollection(ArrayList<String>::new));

            jFrames     = Stream.of(new HomeFrame(), new NextFrame())
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
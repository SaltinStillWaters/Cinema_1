package control;

import javax.swing.JFrame;


public class ControlFrame 
{
    private static ControlData ctrlData;

    static
    {
        ctrlData = ControlData.getInstance();
    }
    
    public static void changeFrame(String newFrame)
    {
        //Set Visibility
            JFrame currFrame = ctrlData.getFrameByName(ctrlData.getCurrFrame());
            currFrame.setVisible(false);

            JFrame destFrame = ctrlData.getFrameByName(newFrame);
            destFrame.setVisible(true);
        
        //Update frameHistory
            ctrlData.pushFrameHistory(newFrame);
    }
}
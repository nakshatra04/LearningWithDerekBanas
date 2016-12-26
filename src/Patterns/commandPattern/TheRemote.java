/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patterns.commandPattern;

/**
 *
 * @author naksh
 */
public class TheRemote {
    
    public static void main (String[] args)
    {
        TVRemote myRemote = null;
        RemoteButton button;
        ElectronicDevice myDevice = myRemote.getDevice();
        
        
        Command OnCommand= new TurnTV_On(myDevice);
        Command OffCommand = new TurnTV_Off(myDevice);
        Command VUCommand = new TurnTV_VolUp(myDevice);
        Command VDCommand = new TurnTV_VolDown(myDevice);
      
        // Button TV ON
        button = new RemoteButton(OnCommand);
        button.press();
        
        // Button TV Off
        
        button = new RemoteButton(OffCommand);
        button.press();
        
        // Button TV V Up
        
        button = new RemoteButton(VUCommand);
        button.press();
        button.press();
        button.press();
        button.press();
        
        // Button TV V Down
        
        button = new RemoteButton(VDCommand);
        button.press();
        button.press();
        
        
        
        
        
    }
    
}

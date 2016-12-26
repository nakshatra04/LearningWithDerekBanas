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
public class RemoteButton {
    
    Command theCommand;
    
    public RemoteButton (Command newCommand)
    {
        theCommand = newCommand;
    }
    public void press()
    {
        theCommand.execute();
    }
    
}

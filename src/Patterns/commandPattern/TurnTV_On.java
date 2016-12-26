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
public class TurnTV_On implements Command{

    
    ElectronicDevice device;
    public TurnTV_On(ElectronicDevice newDevice)
    {
        device = newDevice;
    }
    @Override    
    public void execute() {
        device.on();
    }   
}

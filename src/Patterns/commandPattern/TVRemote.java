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
public class TVRemote {
    public static ElectronicDevice getDevice()
    {
        return new TV();
    }
    
}
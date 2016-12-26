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
public class TV implements ElectronicDevice {

    private int volume = 0;
    @Override
    
    public void on() {
        System.out.println("TV turned ON");
    }

    @Override
    public void off() {
        System.out.println("TV turned Off");
    }

    @Override
    public void volUp() {
        volume ++;
        System.out.println("TV volUp at : "+ volume);
    }

    @Override
    public void volDown() {
    volume --;
        System.out.println("TV volDown at : "+ volume);
    }
    
    
    
}

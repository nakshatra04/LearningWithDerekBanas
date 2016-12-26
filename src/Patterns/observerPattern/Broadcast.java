/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patterns.observerPattern;

/**
 *
 * @author naksh
 */
public class Broadcast {
    
    
    public static void main (String[] args)
    {
        StockGrabber subject = new StockGrabber();
        StockObserver observer1 = new StockObserver(subject,"First");
        StockObserver observer2 = new StockObserver(subject,"Second");
        
        subject.setApplePrice(100.00);
        subject.setGooglePrice(200.00);
        subject.setIBMPrice(300.00);  
        subject.unregister(observer2);
        subject.setApplePrice(50.00);
        
    }
}

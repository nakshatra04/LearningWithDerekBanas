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
public class StockObserver implements Observer{

    private double applePrice = 0.0, googlePrice = 0.0,ibmPrice=0.0;
    StockGrabber stockGrabber;
    public String name;

    StockObserver(StockGrabber subject, String name) {
        stockGrabber = subject;
        this.name = name;
        System.out.println("Registering the Observer : " + this.name);
        stockGrabber.register(this);
        
        
    }
    @Override
    public void update(double ibmPrice, double aaplPrice, double googPrice) {
        
        this.applePrice = aaplPrice;
        this.googlePrice = googPrice;
        this.ibmPrice = ibmPrice;
        printAllPrice();
    }

    private void printAllPrice() {
        
        System.out.println(name + "\n IBM : " + ibmPrice + "\n GOOGLE : " + googlePrice
                            + "\n APPLE : " + applePrice+"\n");
    }    
    
    public String getOName()
    {
        return name;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patterns.observerPattern;

import java.util.ArrayList;

/**
 *
 * @author naksh
 */
public class StockGrabber implements Subject {
    
    private ArrayList <Observer> observers;
    private int index;
    private double applePrice = 0.0, googlePrice = 0.0,ibmPrice=0.0;
    
    
    public StockGrabber()
    {
        observers = new ArrayList<Observer>();
    }
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        index = observers.indexOf(o);
        System.out.print("Removed the observer : ");
        System.out.print(((StockObserver)o).getOName()+ "\n");
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer o:observers)
        {
            o.update(ibmPrice, applePrice, googlePrice);
        }
        
    }
    
    public void setApplePrice(double price)
    {
        applePrice = price;
        notifyObserver();
    }
    
    public void setGooglePrice(double price)
    {
        googlePrice = price;
        notifyObserver();
    }

    public void setIBMPrice(double price)
    {
        ibmPrice = price;
        notifyObserver();
    }
}

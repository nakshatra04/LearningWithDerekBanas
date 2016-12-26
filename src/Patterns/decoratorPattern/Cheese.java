/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patterns.decoratorPattern;

/**
 *
 * @author naksh
 */
public class Cheese extends ToppingDecorator {
    
    public Cheese(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding Cheese");
    }    
    public String getDescription()
    {
        return pizza.getDescription()+ ", Three Cheese";
    }
    public double getCost()
    {
        System.out.println("Cheese cost :" + 0.80);
        return pizza.getCost()+ 0.80;
    }
    
    
    
}

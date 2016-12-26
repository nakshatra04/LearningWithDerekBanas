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
public class ToppingDecorator implements Pizza{
    
     Pizza pizza;
    
    public ToppingDecorator(Pizza newPizza){
        pizza = newPizza;
        
    }
    public String getDescription()
    {
        return pizza.getDescription();
    }
    public double getCost()
    {
        return pizza.getCost();
    }
    
}

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
public class Sauce extends ToppingDecorator{
    
    public Sauce(Pizza newPizza) {
        super(newPizza);
        System.out.println("Starting with Dough");
        System.out.println("Adding Sauce");
    }
    
    public String getDescription()
    {
        return pizza.getDescription()+ ", Peesto Sauce";
    }
    public double getCost()
    {
        System.out.println("Sauce cost :" + 1.20);
        return pizza.getCost()+ 1.20;
    }
}

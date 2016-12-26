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
public class Veggie extends ToppingDecorator{
    
    public Veggie(Pizza newPizza)
    {
        super(newPizza);
        System.out.println("Adding All veggies");
    }
    
    public String getDescription()
    {
        return pizza.getDescription()+ ", All veggies";
    }
    public double getCost()
    {
        System.out.println("Sauce cost :" + 2.00);
        return pizza.getCost()+ 2.00;
    }
    
}

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
public class OrderPizza {
    
    public static void main (String[] args)
    {
        Pizza myPizza;
        myPizza = new Veggie(new Cheese(new Sauce(new BasePizza())));
        
        System.out.println("Inventory : " + myPizza.getDescription());
        System.out.println("Total Cost : " + myPizza.getCost());
    }
}

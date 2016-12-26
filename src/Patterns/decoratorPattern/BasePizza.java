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
public class BasePizza implements Pizza {
    
    @Override
    public String getDescription() {
        
        return "Thin Dough";
    }

    @Override
    public double getCost() {
        System.out.println("Base Cost : " + 3.99);
    return 3.99;
    }
    
}

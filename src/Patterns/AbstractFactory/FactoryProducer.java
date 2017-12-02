/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patterns.AbstractFactory;

/**
 *
 * @author naksh
 */
public class FactoryProducer {
    
    public static AbstractFactory getFactory(String choice){
        if (choice.equalsIgnoreCase("color"))
            return new ColorFactory();
        else if (choice.equalsIgnoreCase("shape"))
            return new ShapeFactory();
        else return null;
    }
    
}

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
public class Thefactory {
    
    public static void main(String[] args) {
        AbstractFactory factory;
        Shape shape;
        Color color;
        
        // making a shape factory
        factory = FactoryProducer.getFactory("shape");
        shape = factory.getShape("circle");
        shape.draw();
        
        //Color factory
        factory = FactoryProducer.getFactory("color");
        color = factory.getColor("red");
        color.fill();
        
    }
    
}

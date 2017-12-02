/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patterns.FactoryPattern.ExmpleTwo;

/**
 *
 * @author naksh
 */
public class ShapeFactory {
    Shape shape;
    
    public Shape getShape(String shapeStr){
        if (shapeStr.equalsIgnoreCase("CIRCLE"))
            return new Circle();
        else if (shapeStr.equalsIgnoreCase("SQUARE"))
            return new Square();
        else if (shapeStr.equalsIgnoreCase("Rectangle"))
            return new Rectangle();
        return null;
    }
    
}

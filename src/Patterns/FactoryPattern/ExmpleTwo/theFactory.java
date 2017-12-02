/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patterns.FactoryPattern.ExmpleTwo;

import java.util.Scanner;

/**
 *
 * @author naksh
 */
public class theFactory {
    
    public static void main(String[] args) {
        Shape shape;
        System.out.println("What type of shape you want");
        Scanner in = new Scanner(System.in);
        String theShape = null;
        if (in.hasNextLine()){

            theShape = in.nextLine();
        }
        ShapeFactory shapeFactory = new ShapeFactory();
        shape = shapeFactory.getShape(theShape);
        shape.draw(10);
    }
    
}

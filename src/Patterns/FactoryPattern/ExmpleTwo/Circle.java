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
public class Circle implements Shape{

    @Override
    public void draw(int x) {
        System.out.println("Creating a circle with Radius : " + x);
    }
    
}

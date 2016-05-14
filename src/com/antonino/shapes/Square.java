/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antonino.shapes;

/**
 *
 * @author cl5admin
 */
public class Square extends Shapes{
    private double side;

    public Square(double s) {
        this.side = s;
    }

    @Override
    public double getArea() {
        return side * side;
    }
        
}

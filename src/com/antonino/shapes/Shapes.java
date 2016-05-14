/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.antonino.shapes;

/**
 *
 * @author cicctfac1
 */
public abstract class Shapes {
    private int numOfSides;

    public Shapes() {
    }

    public Shapes(int numOfSides) {
        this.numOfSides = numOfSides;
    }

    public abstract double getArea();
}

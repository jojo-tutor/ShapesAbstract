package com.antonino.shapes;

public class Rectangle extends Shapes{
    // attributes
    private double length;
    private double width;

    // constructor
    public Rectangle(){
        super(4);
        this.length = 0.0f;
        this.width = 0.0f;
    }
    public Rectangle(double l,double w){
        super(4);
        this.length = l;
        this.width = w;
    }

    // methods
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

   
    @Override
    public String toString(){
        return "The Rectangle has "+this.length+" length, " +
              this.width+" width and " +
              this.getArea() + " area.";
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }
}
package com.antonino.shapes;

public class Circle extends Shapes{
    // attributes
    private double radius;

    // constructor
    public Circle(){
        super(0);
        this.radius = 0.0f;
    }
    public Circle(double r){
        super(0);
        this.radius = r;
    }

    // methods
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double r){
        this.radius = r;
    }

    @Override
    public String toString(){
        return "The Circle has "+this.radius+" radius and " +
              this.getArea() + " area.";
    }

    @Override
    public double getArea() {
       return Math.PI * (this.radius * this.radius);
    }
}
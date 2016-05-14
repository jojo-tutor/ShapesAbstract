package com.antonino.main;

import com.antonino.shapes.Circle;
import com.antonino.shapes.Rectangle;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
//        double r;
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Please enter radius : ");
//        r = scan.nextDouble();
//
//        Circle c = new Circle(r);
//
//        System.out.println(c);


        double l, w;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter length: ");
        l = scan.nextDouble();
        System.out.println("Please enter width: ");
        w = scan.nextDouble();

        Rectangle r = new Rectangle(l, w);

        System.out.println(r);

    }
}

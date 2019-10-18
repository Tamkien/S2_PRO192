/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

/**
 *
 * @author Expression Tamkien is undefined on line 12, column 14 in
 * Templates/Classes/Class.java.
 */
public class Tamgiac implements Sharp2D {

    private double a, b, c;

    private double P(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    public Tamgiac(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double chuvi() {
        if (a + b > c && a + c > b && b + c > a) {
            return this.a + this.b + this.c;
        } else {
            System.out.println("Not a triangle.");
            return 0;
        }

    }

    @Override
    public double dientich() {
        double p = P(a, b, c);
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));

    }
}

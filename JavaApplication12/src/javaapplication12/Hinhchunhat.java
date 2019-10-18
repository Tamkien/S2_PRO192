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
public class Hinhchunhat implements Sharp2D {

    private double a, b;

    public Hinhchunhat(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double chuvi() {
        return (a + b) * 2;
    }

    @Override
    public double dientich() {
        return a * b;
    }

}

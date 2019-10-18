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
public class Hinhtron implements Sharp2D {

    double r;

    public Hinhtron(double r) {
        this.r = r;
    }

    @Override
    public double chuvi() {
        return 2 * r * Math.PI;
    }

    @Override
    public double dientich() {
        return Math.PI * r * r;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question5;

/**
 *
 * @author Alekya Billakanti
 */
public class Circle {

    private double r1;
    public static final double PI = Math.PI;

    public Circle(double r1) {
        this.r1 = r1;
    }

    public double getArea() {
        return PI * r1 * r1;
    }

}

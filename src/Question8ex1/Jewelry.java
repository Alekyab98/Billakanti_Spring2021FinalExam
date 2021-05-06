/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8ex1;

/**
 *
 * @author Alekya Billakanti
 */
public class Jewelry {

    private String model;
    private int grams;

    public Jewelry(String model) {
        this.model = model;
    }

    public void setGrams(int grams) {
        if (grams <= 0) {
            throw new ArithmeticException("grams cannot be less than or equal to"
                    + "zero");
        }
        this.grams = grams;
    }

}

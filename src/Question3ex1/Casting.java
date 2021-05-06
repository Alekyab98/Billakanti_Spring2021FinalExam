/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3ex1;

/**
 *
 * @author Alekya Billakanti
 */
public class Casting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1 = 15;
        int num2 = 10;

        //Narrow casting
        double n1 = num1;
        double n2 = num2;

        int product = product(n1, n2);
        System.out.println("Product is: " + product);

    }

    public static int product(double num1, double num2) {
        double res = num1 * num2;

        //Down casting
        return (int) res;
    }

}

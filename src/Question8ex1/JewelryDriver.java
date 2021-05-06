/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Alekya Billakanti
 */
public class JewelryDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ArithmeticException, InputMismatchException {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the model:");
        String model = scan.next();
        Jewelry j = new Jewelry(model);
        System.out.println("Enter grams: ");
        int grams = scan.nextInt();
        j.setGrams(grams);

    }
}

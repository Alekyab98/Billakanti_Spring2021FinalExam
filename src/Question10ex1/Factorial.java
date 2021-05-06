/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10ex1;

import java.util.Scanner;

/**
 *
 * @author Alekya Billakanti
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer to find factorial of a number: ");
        int num = scan.nextInt();
        System.out.println("Factorial of number " + num + " is: " + fact(num));
        
    }
    
    public static int fact(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num * fact(num - 1);
        }
        
    }
    
}

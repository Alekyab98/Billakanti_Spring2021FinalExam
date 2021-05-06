/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;

import java.util.Scanner;

/**
 *
 * @author Alekya Billakanti
 */
public class Question7 {

    public static void main(String[] args) {
        int[] integers = new int[100];

        for (int i = 0; i < integers.length; i++) {

            integers[i] = (int)(Math.random() * 100);
        }
       

        System.out.print("Enter index: ");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        try {
            System.out.println("Integer at index i is :" + i+ " is "
                    + integers[i]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index Out of Bound Exception");
        }
    }
}

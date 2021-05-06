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
public class InfiniteRecursion {

    public static int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    public static int i = 0;

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println("Key is: " + findKey(num));
    }

    public static int findKey(int num) {
        if (a[i] == num || i == a.length) {
            return -1;
        } else {
            return findKey(num);
        }

    }
}

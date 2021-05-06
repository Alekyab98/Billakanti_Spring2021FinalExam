/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
  * @author Alekya Billakanti
 */
public class CheckedException {
    
    public void display() throws FileNotFoundException{      
        Scanner scan=new Scanner(new File("inpu1.txt"));
    }      

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws FileNotFoundException {
        // TODO code application logic here
        CheckedException exception = new CheckedException();
        try {
            exception.display();
        } catch (Exception e) {
            System.out.println(e);
        }
    }               
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Alekya Billakanti
 */
public class FileValidator {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) throws FileNotFoundException,IOException {
// TODO code application logic here
try {
Scanner sc = new Scanner(new File("Notepad.txt"));

 

} catch (FileNotFoundException fe) {
System.out.println(fe.getMessage());
}
try{
Scanner s = new Scanner(System.in);
int n1 = s.nextInt();
System.out.println(n1/0);
}catch(Exception e){
System.out.println(e.getMessage());
}
   }
}

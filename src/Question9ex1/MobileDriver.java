/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question9ex1;

/**
 *
 * @author Alekya Billakanti
 */
public class MobileDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mobile m1 = new Mobile("Iphone");
        Mobile m2 = new Mobile("1+");
        m1.setPrice(500);
        System.out.println(m1);
        m2.setPrice(0);

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1ex2;

/**
 *
 *
 */
public class GadgetsDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Electronics e=new Electronics(); //Cannot be Instantiated
//        ElectronicsInterface ef=new ElectronicsInterface(); cannot create instance
        Mobile mob = new Mobile(1988, "Samsung TAb");
        System.out.println(mob);
        System.out.println(mob.getToString());
    }

}

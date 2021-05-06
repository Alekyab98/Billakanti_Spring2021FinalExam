/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10ex2;

import java.util.ArrayList;

/**
 *
 * @author Alekya Billakanti
 */
public class LaptopDriver {
 public static int i = 0;
    public static ArrayList<Laptop> list = new ArrayList();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        list.add(new Laptop("hp",50000 ));
        list.add(new Laptop("Dell",60000));
        list.add(new Laptop("Samsung",74000));
        list.add(new Laptop("Mac book",120000 ));
        list.add(new Laptop("Lenovo",650000));
        list.add(new Laptop("Acer",80000));
        System.out.println(searchLaptop("hp"));
    }
    public static String searchLaptop(String Brand) {

        if (list.get(i).getBrand().equalsIgnoreCase(Brand)) {
            return list.get(i).toString();
        } else {
            if (i == list.size()-1) {
                return "Laptop not found";
            }
            i++;
            return searchLaptop(Brand);
        }
    }
}

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
public class Mobile {
    private String name;
    private int price;

    public Mobile(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
        if(price<=0)
        {
            throw new IllegalArgumentException("their is no mobile with price"
                    + " less than 0");
        }
        this.price = price;
        
    }

    @Override
    public String toString() {
        return "Mobile" +" " + "name=" + name + ", price=" + price ;
    }
    
    
    
}

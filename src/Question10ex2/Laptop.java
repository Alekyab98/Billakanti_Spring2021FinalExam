/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10ex2;

/**
 *
 * @author Alekya Billakanti
 */
public class Laptop {
    private String Brand;
    private int price;

    public Laptop(String Brand, int price) {
        this.Brand = Brand;
        this.price = price;
    }

    public String getBrand() {
        return Brand;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Laptop : " + "Brand=" + Brand + ", price=" + price ;
    }
    
}

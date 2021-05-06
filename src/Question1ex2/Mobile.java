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
public class Mobile extends Gadgets implements GadgetsInterface {

    private int year;

    public Mobile(int year, String gadgetName) {
        super(gadgetName);
        this.year = year;
    }
    @Override
    public int getgadgetYear() {
        return this.year;
    }

    @Override
    public String getgadgetBrand() {
        return "OnePlus";
    }

    @Override
    public String getgadgetType() {
        return "Mobile";
    }

    public String getToString() {
        return super.toString();
    }

    @Override
    public String toString() {
        return "The gadget Type is " + this.getgadgetType()
                + ". Brand is " + this.getgadgetBrand()
                + ". Year is " + this.getgadgetYear() + ". Its code is "
                + this.gadgetSF();

    }

    @Override
    String gadgetSF() {
        return super.getGadgetName().substring(0, 2);
    }

}

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
public abstract class Gadgets {

    private String gadgetName;

    public Gadgets(String gadgetName) {
        this.gadgetName = gadgetName;
    }

    String getGadgetName() {
        return this.gadgetName;
    }

    abstract String gadgetSF();

    @Override
    public String toString() {
        return "The Gadget Name is " + this.getGadgetName()
                + " And its code is " + this.gadgetSF();
    }

}

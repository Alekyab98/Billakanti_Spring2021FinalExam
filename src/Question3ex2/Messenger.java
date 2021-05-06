/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3ex2;

/**
 *
 * @author Alekya Billakanti
 */
public class Messenger {

    private String appName;
    private double priceMonthly;

    public Messenger(String appName, double priceMonthly) {
        this.appName = appName;
        this.priceMonthly = priceMonthly;
    }

    @Override
    public String toString() {
        return "Messenger{" + "appName=" + appName + ", priceMonthly=" + priceMonthly + '}';
    }

}

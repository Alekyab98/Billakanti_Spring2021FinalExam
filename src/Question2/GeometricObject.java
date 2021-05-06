/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question2;

/**
 *
 * @author Alekya Billakanti
 */
public abstract class GeometricObject {

    private boolean isColorable;

    public GeometricObject(boolean isColorable) {
        this.isColorable = isColorable;
    }

    public boolean isColorable() {
        return isColorable;
    }

    public abstract double calculateArea();
}

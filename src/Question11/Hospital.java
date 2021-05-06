/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question11;

import java.util.Objects;

/**
 *
 * @author Alekya Billakanti
 */
public class Hospital {
    
    private String name;
    private int noOfDoctors;
    private String Address;

    /**
     Constructor for the above declared attributes
     * @param name of the hospital
     * @param noOfDoctors in the hospital
     * @param Address of the hospital
     */
    public Hospital(String name, int noOfDoctors, String Address) {
        this.name = name;
        this.noOfDoctors = noOfDoctors;
        this.Address = Address;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return
     */
    public int getNoOfDoctors() {
        return noOfDoctors;
    }

    /**
     *
     * @return
     */
    public String getAddress() {
        return Address;
    }

    /**
     *Here hashcode method is overrided the hash code that returns based 
     * upon the three attributes given that is name, no of doctors,Address
     * Whenever their are two objects of hospital class with same attribute
     * values then their hashcode will also be similar.
     * @return hash code of that object
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.name);
        hash = 37 * hash + this.noOfDoctors;
        hash = 37 * hash + Objects.hashCode(this.Address);
        return hash;
    }

    /**
     * Equals method is overrided and this method is going to tell the compiler 
     *to check Hospital class attributes that is its name, no of doctors,Address 
     * if we use equals method to compare the objects of hospital and if it has
     * the same values for its attributes then it returns as true else false
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Hospital other = (Hospital) obj;
        if (this.noOfDoctors != other.noOfDoctors) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.Address, other.Address)) {
            return false;
        }
        return true;
    }
    
}

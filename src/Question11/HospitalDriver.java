/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question11;

/**
 *
 * @author Alekya Billakanti
 */
public class HospitalDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hospital h1 = new Hospital("Yashodha", 150, "secundrabad");
        Hospital h2 = new Hospital("Sunshine", 150, "Hyderabad");
        Hospital h3 = new Hospital("Apollo", 150, "Bharatiya vidya Bhavan");
        Hospital h4 = new Hospital("CARE", 150, "Banjara hills");
        Hospital h5 = new Hospital("Yashodha", 150, "secundrabad");
        Hospital h6 = new Hospital("CARE", 150, "Banjara hills");
        Hospital h7 = h6;
        /*
        * this invokes the equals method from Hospital class and returns true
        * if attribute values of object are same
        */
        System.out.println("h1 equals h2: "+h1.equals(h2));
        System.out.println("h1 equals h5: "+h1.equals(h5));
        System.out.println("h4 equals h5: "+h4.equals(h5));
        System.out.println("h7 equals h6: "+h6.equals(h7));
        System.out.println("\n");
        /*
        *== is used to compare the addresses of the objects.It returns true 
        * only if the address of the objects is same
        */
        System.out.println("h1 equals h2: "+(h1==h2));
        System.out.println("h1 equals h5: "+(h1==h5));
        System.out.println("h4 equals h5: "+(h4==h5));
        System.out.println("h7 equals h6: "+(h6==h7));
        System.out.println("\n");
        /*
        *invokes the overrided hashcode method from hospital class and returns 
        similar hashcode if the two objects has same attribute values values
        */
        System.out.println(h1.hashCode());
        System.out.println(h2.hashCode());
        System.out.println(h5.hashCode());
        System.out.println(h7.hashCode());
        
        
    }
    
}

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
public class Question2Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GeometricObject[] obj1 = new GeometricObject[5];

        obj1[0] = new Square(4.0, true);
        obj1[1] = new Square(4.5, false);
        obj1[2] = new Square(6.2, true);
        obj1[3] = new Square(3.4, false);
        obj1[4] = new Square(4.6, true);

        for (GeometricObject geometricObject : obj1) {
            System.out.println("Area of geometric Object is : " 
                    + geometricObject.calculateArea());
            if (geometricObject.isColorable() == true) {
                Square sqr = (Square) geometricObject;
                sqr.howToColor();
            }
        }

    }

}

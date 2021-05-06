/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Alekya Billakanti
 */
public class Question5Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ComparableCircle circle1 = new ComparableCircle(5.1);
        ComparableCircle circle2 = new ComparableCircle(2);
        ComparableCircle circle3 = new ComparableCircle(4.6);
        

        ArrayList<ComparableCircle> list = new ArrayList<>();
        list.add(circle1);
        list.add(circle2);
        list.add(circle3);
        System.out.println("Areas of Circle");
        printList(list);

        Collections.sort(list);
        System.out.println("The Larger of the Areas is : "
                + list.get(0).getRoundedArea());
    }

    public static void printList(List<ComparableCircle> l) {
        l.forEach(comparision -> {
            System.out.println(comparision.getRoundedArea());
        });
    }

}

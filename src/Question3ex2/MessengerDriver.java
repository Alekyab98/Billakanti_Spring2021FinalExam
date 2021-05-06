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
public class MessengerDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CasualMessenger fb1 = new CasualMessenger("fbmessenger", 0);
        System.out.println(fb1);
//        Widening(Up) Casting
        Messenger m1 = new CasualMessenger("Telegram", 12);
//        Narrow(Down) Casting
        CasualMessenger fb2 = (CasualMessenger) m1;
        System.out.println(fb2);

    }

}

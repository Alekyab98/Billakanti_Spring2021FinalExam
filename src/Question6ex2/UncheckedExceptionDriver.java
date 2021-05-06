/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6ex2;

/**
 *
 * @author Alekya Billakanti
 */
class UncheckedException {

    public int strikeRate;

    public UncheckedException(int strikeRate) {
        this.strikeRate = strikeRate;
    }

    public int getStrikeRate() {
        if (this.strikeRate > 56) {
            throw new IllegalArgumentException("Strike Rate should not be greater than 56!!");
        } else {
            return strikeRate * 100;
        }
    }
}

public class UncheckedExceptionDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try {
            UncheckedException ue = new UncheckedException(78);
            System.out.println(ue.getStrikeRate());
        } catch (IllegalArgumentException iee) {
            System.out.println("IllegalArgumentException");
            System.out.println(iee.getMessage());
        }
        
        try{
            UncheckedException ue1=new UncheckedException(50);
            System.out.println(ue1.getStrikeRate()/0);
        }catch(ArithmeticException ae){
            System.out.println(ae.getMessage()); 
                   
        }

    }

}

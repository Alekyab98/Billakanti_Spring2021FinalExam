/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1ex1;

/**
 *
 *@author Alekya Billakanti 
 */
public class Football extends Sports implements SportsInterface {

    @Override
    public void playSport() {
        System.out.println("Football is the game");
    }

    @Override
    public int getNoOfPlayers() {
        return 7;
    }
    
    @Override
    public String toString(){
        return "Football  is an "+ SPORT_TYPE +" Number of players are "+
                this.getNoOfPlayers();
    }
    
 
    
}

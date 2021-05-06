/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1ex1;

/**
 *
 * @author Alekya Billakanti
 */
public interface SportsInterface {
    String SPORT_TYPE="OUTDOOR";
    
    public default String getSportType(){
        return SPORT_TYPE;
    }
    
    int getNoOfPlayers();
    
}

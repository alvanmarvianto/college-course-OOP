/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alvan
 */
public class DriverSong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Artist a1 = new Artist("Alan Walker", "1997-08-24");
        Artist a2 = new Artist("Ari Lasso", "1973-01-17");
        
        a1.displayInfo();
        a2.displayInfo();
        
        Song song1 = new Song("Not You", a1, "2021-12-03");        
        Song song2 = new Song("Hampa", a2, "2003-02-10");
        
        song1.displayInfo();
        song2.displayInfo();
    }
    
}

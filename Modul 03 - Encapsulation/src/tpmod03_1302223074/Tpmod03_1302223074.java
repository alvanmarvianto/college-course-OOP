/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpmod03_1302223074;

/**
 *
 * @author Alvan
 */
public class Tpmod03_1302223074 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Song song1 = new Song();
        Song song2 = new Song();

        song1.setTitle("Hello World");
        song1.setArtist(new String[]{"Alan Walker", "Torine"});
        song1.setDuration(171);

        song2.setTitle("Film Favorit");
        song2.setArtist(new String[]{"Sheila On 7"});
        song2.setDuration(226);

        Album album = new Album();
        album.setTitle("Kayaknya Hits");
        album.setYear(2023);
        album.addSong(song1);
        album.addSong(song2);
        album.displayInfo();
    }
    
}

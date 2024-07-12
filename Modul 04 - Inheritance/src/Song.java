/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alvan
 */
public class Song {
    private String title;
    private Artist artist;
    private String release;
    
    Song(String title, Artist artist, String _release){
        setTitle(title);
        setArtist(artist);
        
        String[] releaseSplit = _release.split("-");
        int tahun = Integer.parseInt(releaseSplit[0]);
        int bulan = Integer.parseInt(releaseSplit[1]);
        int tanggal = Integer.parseInt(releaseSplit[2]);
        
        String[] namaBulan = {
                    "Januari", "Februari", "Maret", "April",
                    "Mei", "Juni", "Juli", "Agustus",
                    "September", "Oktober", "November", "Desember"
            };
        setRelease(tanggal + " " + namaBulan[bulan-1] + " " + tahun);
    }

    public String getTitle() {
        return title;
    }

    public final void setTitle(String title) {
        this.title = title;
    }

    public Artist getArtist() {
        return artist;
    }

    public final void setArtist(Artist artist) {
        this.artist = artist;
    }

    public String getRelease() {
        return release;
    }

    public final void setRelease(String release) {
        this.release = release;
    }
    
    public void displayInfo(){
        System.out.println("Title\t: " + getTitle());
        System.out.println("Artist\t: " + artist.getName());
        System.out.println("Release\t: " + getRelease());
        
        String[] releaseSplit = release.split(" ");
        String birthdate = artist.getBirthdate();
        String[] birthdateSplit = birthdate.split(" ");
        int umurSaatLagu = Integer.parseInt(releaseSplit[2]) - Integer.parseInt(birthdateSplit[2]);
        System.out.println("Artist age is " + umurSaatLagu + " when song released");
        System.out.println("");
    }
}

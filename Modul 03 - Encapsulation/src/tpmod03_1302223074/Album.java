package tpmod03_1302223074;

import java.util.Arrays;
import java.util.ArrayList;

public class Album {
    private String title;
    private int year;
    private ArrayList<Song> songs;
    
    public void setTitle(String inputTitle){
        this.title = inputTitle;
    }
    
    public void setYear(int inputYear){
        this.year = inputYear;
    }
   
    public String getTitle(){
        return title;
    }
    
    public int getYear(){
        return year;
    }
   
    public void addSong(Song inputSong){
        if (songs == null) {
            songs = new ArrayList<>();
        }
        songs.add(inputSong);
    }
    
        public void displayInfo(){
        System.out.println("Album Info");
        System.out.println("Title : " + title);
        System.out.println("Year : " + year);
        System.out.println("Song List");

        if (songs != null) {
            for (int i = 0; i < songs.size(); i++) {
                Song song = songs.get(i);
                System.out.println((i + 1) + ". Title : " + song.getTitle());
                System.out.println("   Artist : " + String.join(", ", song.getArtist()));
                System.out.println("   Duration : " + song.getDuration());
            }
        }
    }
}

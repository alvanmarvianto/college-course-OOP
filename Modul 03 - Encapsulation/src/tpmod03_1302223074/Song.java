package tpmod03_1302223074;

import java.util.Arrays;
import static javafx.util.Duration.minutes;

public class Song {
    private String title;
    private String[] artist;
    private int duration;
    
    public void setTitle(String inputTitle){
        this.title = inputTitle;
    }
    
    public void setArtist(String[] inputArtist){
        this.artist = inputArtist;
    }
   
    public void setDuration(int inputDuration){
        this.duration = inputDuration;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public String[] getArtist(){
        return this.artist;
    }
   
    public String getDuration(){
        int menit = this.duration / 60;
        int detik = this.duration / 60;
        return String.format("%02d:%02d", menit, detik);
    }
}

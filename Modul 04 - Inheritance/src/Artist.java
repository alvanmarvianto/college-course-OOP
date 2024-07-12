/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alvan
 */
public class Artist {
    private String name;
    private String birthdate;
    
    Artist(String name, String _birthdate) {
        setName(name);
        
        String[] birthdateSplit = _birthdate.split("-");
        int tahun = Integer.parseInt(birthdateSplit[0]);
        int bulan = Integer.parseInt(birthdateSplit[1]);
        int tanggal = Integer.parseInt(birthdateSplit[2]);
        
        String[] namaBulan = {
                    "Januari", "Februari", "Maret", "April",
                    "Mei", "Juni", "Juli", "Agustus",
                    "September", "Oktober", "November", "Desember"
            };
        setBirthdate(tanggal + " " + namaBulan[bulan-1] + " " + tahun);
    }

    public String getName() {
        return name;
    }

    
    public final void setName(String name) {
        this.name = name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public final void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
    
    public int getAge(){
        String[] birthdateSplit = birthdate.split(" ");
        return 2024 - Integer.parseInt(birthdateSplit[2]);
    }
    
    public void displayInfo(){
        System.out.println("Artist Name\t: " + getName());
        System.out.println("Birthdate\t: " + getBirthdate());
        System.out.println("Age\t\t: " + getAge());
        System.out.println("");
    }
}

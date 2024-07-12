package TP09;

public abstract class Serangga {
    private Koordinat posisi;
    private String warna;

    public Serangga(String warna, Koordinat k) {
        this.posisi = k;
        this.warna = warna;
    }
    
    public abstract void gerak(Koordinat k);
    
    public Koordinat getPosisi() {
        return posisi;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    public abstract void info();
}

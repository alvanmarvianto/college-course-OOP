package TP06;

public abstract class Serangga {
    private final int jmlKaki;
    private String warna;

    public Serangga(String warna) {
        this.jmlKaki = 6;
        this.warna = warna;
    }

    public int getJmlKaki() {
        return jmlKaki;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
    
}

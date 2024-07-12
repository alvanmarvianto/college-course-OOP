package TP06;

public class Semut extends Serangga{
    private Koordinat posisi;

    public Semut(String warna, int x, int y) {
        super(warna);
        posisi = new Koordinat(x,y);
    }
    
    public void gerak(int[] axis){
        posisi.setX(axis[0]);
        posisi.setY(axis[1]);
    }
    
    public void info(){
        System.out.println("Posisi Semut\t: "+posisi.getX());
        System.out.println("\t\t: "+posisi.getY());
    }
}

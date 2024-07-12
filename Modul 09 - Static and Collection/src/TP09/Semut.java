package TP09;

public class Semut extends Serangga{

    public Semut(String warna, Koordinat k) {
        super(warna, k);
    }
    
    @Override
    public void gerak(Koordinat k){
        getPosisi().setX(k.getX());
        getPosisi().setY(k.getY());
    }
    
    @Override
    public void info(){
        System.out.println("Posisi Semut\t: X = " + getPosisi().getX());
        System.out.println("\t\t: Y = " + getPosisi().getY());
    }
}

package TP06;

public class Lebah extends Serangga implements BisaTerbang{
    private Koordinat3D posisi;

    public Lebah(String warna, int x, int y, int z) {
        super(warna);
        posisi = new Koordinat3D(x,y,z);
    }
    public void gerak(int[] axis){
        posisi.setX(axis[0]);
        posisi.setY(axis[1]);
        posisi.setZ(axis[2]);
    }
    
    public void info(){
        System.out.println("Posisi Lebah\t: "+posisi.getX());
        System.out.println("\t\t: "+posisi.getY());
        System.out.println("\t\t: "+posisi.getZ());
    }
    
    public void terbang(int x, int y, int z){
        posisi.setX(x+posisi.getX());
        posisi.setY(y+posisi.getY());
        posisi.setZ(z+posisi.getZ());
    }
}

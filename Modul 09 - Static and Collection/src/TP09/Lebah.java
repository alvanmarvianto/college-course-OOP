package TP09;

public class Lebah extends Serangga{

    public Lebah(String warna, Koordinat3D k) {
        super(warna, k);
    }
    
    @Override
    public void gerak(Koordinat k){
        Koordinat3D k3d = (Koordinat3D) k;
            getPosisi().setX(k3d.getX());
            getPosisi().setY(k3d.getY());
            ((Koordinat3D) getPosisi()).setZ(k3d.getZ());
    }
    
    @Override
    public void info(){
        Koordinat3D posisi3D = (Koordinat3D) getPosisi();
        System.out.println("Posisi Lebah\t: X = " + posisi3D.getX());
        System.out.println("\t\t: Y = " + posisi3D.getY());
        System.out.println("\t\t: Z = " + posisi3D.getZ());
    }
}

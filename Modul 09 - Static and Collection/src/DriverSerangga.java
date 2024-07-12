import TP09.Serangga;
import TP09.Semut;
import TP09.Lebah;
import TP09.Koordinat;
import TP09.Koordinat3D;

public class DriverSerangga {

    public static void main(String[] args) {
        Serangga serangga1 = new Semut("merah", new Koordinat(70, 90));
        System.out.println("Warna Semut\t: " + serangga1.getWarna());
        serangga1.info();
        serangga1.gerak(new Koordinat(80, 100));
        serangga1.info();
        
       Serangga serangga2 = new Lebah("oranye", new Koordinat3D(30, 40, 50));
       System.out.println("Warna Lebah\t: " + serangga2.getWarna());
       serangga2.info();
       serangga2.gerak(new Koordinat3D(45, 55,65));
       serangga2.info();

    }
    
}

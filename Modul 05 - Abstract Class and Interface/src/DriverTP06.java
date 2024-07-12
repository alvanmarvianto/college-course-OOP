import TP06.Koordinat;
import TP06.Koordinat3D;
import TP06.KoordinatLingkaran;

public class DriverTP06 {
    public static void main(String[] args) {
        Koordinat A = new Koordinat(30, 24);
        Koordinat3D B = new Koordinat3D(20, 14, 15);

        System.out.println("Jarak antara B dan A adalah: " + B.hitungJarak(A));

        Koordinat3D C = new Koordinat3D(22, 52, 64);

        System.out.println("Jarak antara B dan C adalah: " + B.hitungJarak(C));

        KoordinatLingkaran D = new KoordinatLingkaran(70, 120, 25.5);
        KoordinatLingkaran E = new KoordinatLingkaran(50, 100, 65.2);

        System.out.println("Jarak antara B dan C adalah: " + B.hitungJarak(C));
        System.out.println("Jarak antara D dan E adalah: " + D.hitungJarak(E));
    }
    
}

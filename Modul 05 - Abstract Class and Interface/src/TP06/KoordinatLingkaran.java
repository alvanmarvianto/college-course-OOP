package TP06;
public class KoordinatLingkaran extends Koordinat{
    private double r;
    
    public KoordinatLingkaran(int x, int y, double r){
        super(x,y);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    
    public boolean isBersinggungan(KoordinatLingkaran k){
        double jarakAntarTitik = this.hitungJarak(k);
        double jarakSumbu = this.r + k.getR();
        return jarakAntarTitik <= jarakSumbu;
    }
}

package TP06;
public class Koordinat3D extends Koordinat{
    private int z;
    
    
    public Koordinat3D(int x, int y, int z){
        super(x,y);
        this.z = z;
        
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
    
    public double hitungJarak(Koordinat3D k){
        int deltaX = k.getX() - this.getX();
        int deltaY = k.getY() - this.getY();
        int deltaZ = k.getZ() - this.z;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY + deltaZ * deltaZ);
    }
}

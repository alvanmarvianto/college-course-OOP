package TP06;
public class Koordinat {
    private int x;
    private int y;

    public Koordinat(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public double hitungJarak(Koordinat k){
        int deltaX = k.getX() - this.x;
        int deltaY = k.getY() - this.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
}

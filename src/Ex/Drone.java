package Ex;

public abstract class Drone {
    
    public int x;
    public int y;
    public int z;
    
    public Drone(int x, int y, int z){
        this.x = 0;
        this.y = 0;
        this.z = 0;
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

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
    
    public abstract void fly(int x1, int y1, int z1);
    
 
}



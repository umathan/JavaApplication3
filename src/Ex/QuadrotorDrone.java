package Ex;

public class QuadrotorDrone extends Drone {

    public QuadrotorDrone(int x1, int y1, int z1) {
        super(x1, y1, z1);
    }
    
    
    public void fly(int x1, int y1, int z1){
        super.setX(super.x + x1);
        super.setY(super.y + y1);
        super.setZ(super.z + z1);
    }
    
    
    
    
}
    
    
    


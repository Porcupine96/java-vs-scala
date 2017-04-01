package B;

public class VehicleJ implements DrivableJ {

    private int speed;
    private DirectionJ direction;

    VehicleJ(int initialSpeed, DirectionJ initialDirection) {
        this.speed = initialSpeed;
        this.direction = initialDirection;
    }

    public int getSpeed() {
        return speed;
    }

    public DirectionJ getDirection() {
        return direction;
    }
}


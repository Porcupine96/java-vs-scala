package B;

public class CarJ extends VehicleJ {

    private String engine;

    public CarJ(int initialSpeed, DirectionJ initialDirection, String engine) {
        super(initialSpeed, initialDirection);
        this.engine = engine;
    }

    public String getEngine() {
        return engine;
    }

    @Override
    public void drive() {
        System.out.println("Engine goes: \"Wrrrrrrr\"");
    }
}

package B;

public interface DrivableJ {

    default void drive() {
        System.out.println("driving...");
    }

}

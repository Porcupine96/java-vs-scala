package B;

import org.junit.Test;


public class BJavaTest {

    @Test
    public void aCarShouldDrive() {
        VehicleJ vehicleJ = new CarJ(15, DirectionJ.EAST, "V-8 Engine");
        vehicleJ.drive();
    }

}

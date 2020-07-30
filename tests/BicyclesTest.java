import bicycles.models.RoadBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicyclesTest {

    @Test
    public void shouldAccelerate(){

        RoadBike bicycle = new RoadBike();
        bicycle.accelerate();
        assertEquals(5, bicycle.currentSpeed());
    }
    @Test
    public void shouldAccelerateAndBrakeCorrect() {

        RoadBike bicycle = new RoadBike();
        bicycle.accelerate();
        bicycle.brake();
        assertEquals(2, bicycle.currentSpeed());

    }
    @Test
    public void shouldDoMultipleAcceleratesCorrectly() {

        RoadBike bicycle = new RoadBike();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        assertEquals(15, bicycle.currentSpeed());

    }
    @Test
    public void shouldDoMultipleAccelerateAndBrakesCorrectly() {

        RoadBike bicycle = new RoadBike();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.brake();
        assertEquals(1, bicycle.currentSpeed());

    }
    @Test
    public void shouldBeAbleToStop(){
        RoadBike bicycles = new RoadBike();
        bicycles.accelerate();
        bicycles.brake();
        bicycles.accelerate();
        bicycles.stop();
        assertEquals(0, bicycles.currentSpeed());
    }
}

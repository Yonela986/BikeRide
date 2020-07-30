package bicycles;

import bicycles.models.RoadBike;

public class BikeRide {

    private Bicycle bicycle;

    //Constructor that takes bicycle object
    public BikeRide(Bicycle bicycles) {
        RoadBike bicycle = new RoadBike();
        BikeRide bikeRide = new BikeRide((Bicycle) bicycle);
        bikeRide.ride();

        System.out.println(bikeRide.currentSpeed());
    //ride method
    }

    private int currentSpeed(){
        return currentSpeed();
    }

    public void ride() {
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
    }

}
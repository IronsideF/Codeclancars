package Vehicles;

import VehicleParts.Chassis;
import VehicleParts.Engine;
import VehicleParts.Gearbox;
import VehicleParts.Tire;

public class Car extends Vehicle{
    private Engine engine;

    public Car(Gearbox gearbox, Tire tireMake, Chassis chassis, double price, Colour colour, Engine engine) {
        super(gearbox, tireMake, chassis, price, colour);
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }
}

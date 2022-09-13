package Vehicles;

import VehicleParts.*;

public class HybridCar extends Vehicle{
    private Engine engine;
    private Battery battery;

    public HybridCar(Gearbox gearbox, Tire tireMake, Chassis chassis, double price, Colour colour, Engine engine, Battery battery) {
        super(gearbox, tireMake, chassis, price, colour);
        this.engine = engine;
        this.battery = battery;
    }

    public Engine getEngine() {
        return engine;
    }

    public Battery getBattery() {
        return battery;
    }
}

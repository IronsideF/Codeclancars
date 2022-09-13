package Vehicles;

import VehicleParts.Battery;
import VehicleParts.Chassis;
import VehicleParts.Gearbox;
import VehicleParts.Tire;

public class ElectricCar extends Vehicle{
    private Battery battery;

    public ElectricCar(Gearbox gearbox, Tire tireMake, Chassis chassis, double price, Colour colour, Battery battery) {
        super(gearbox, tireMake, chassis, price, colour);
        this.battery = battery;
    }

    public Battery getBattery() {
        return battery;
    }
}

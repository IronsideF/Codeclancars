package Vehicles;

import VehicleParts.Chassis;
import VehicleParts.Gearbox;
import VehicleParts.Tire;

public abstract class Vehicle {
    private Gearbox gearbox;
    private Tire tireMake;
    private Chassis chassis;
    private double price;
    private Colour colour;
    private double damages;

    public Vehicle(Gearbox gearbox, Tire tireMake, Chassis chassis, double price, Colour colour) {
        this.gearbox = gearbox;
        this.tireMake = tireMake;
        this.chassis = chassis;
        this.price = price;
        this.colour = colour;
        this.damages = 0.0;
    }

    public Gearbox getGearbox() {
        return gearbox;
    }

    public Tire getTireMake() {
        return tireMake;
    }

    public Chassis getChassis() {
        return chassis;
    }

    public double getPrice() {
        return price;
    }

    public Colour getColour() {
        return colour;
    }

    public double getDamages() {
        return damages;
    }

    public void setDamages(double damages) {
        this.damages = damages;
    }
    public double getMarketPrice(){
        return getPrice()-getDamages();
    }
}

import Vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership {
    private ArrayList<Vehicle> stock;
    private double till;

    public Dealership(ArrayList<Vehicle> stock, double till) {
        this.stock = stock;
        this.till = till;
    }

    public int getStockSize() {
        return stock.size();
    }

    public double getTill() {
        return till;
    }
    private void setTill(double amount){
        this.till += amount;
    }
    private boolean removeVehicleFromStock(Vehicle vehicle){
        return stock.remove(vehicle);
    }
    private void addVehicleToStock(Vehicle vehicle){
        this.stock.add(vehicle);
    }
    public void sellCar(Vehicle vehicle, Customer customer){
        if (removeVehicleFromStock(vehicle)){
            customer.buyVehicle(vehicle);
            setTill(vehicle.getMarketPrice());
        }
    }
    public void buyCar(Vehicle vehicle){
        addVehicleToStock(vehicle);
        setTill(-vehicle.getMarketPrice());
    }
    public void repairCar(Vehicle vehicle){
        setTill(-vehicle.getDamages());
        vehicle.setDamages(0.0);
    }

}

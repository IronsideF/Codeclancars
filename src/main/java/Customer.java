import Vehicles.Vehicle;

import java.util.ArrayList;

public class Customer {
    private double money;
    private ArrayList<Vehicle> ownedVehicles;

    public Customer(double money) {
        this.money = money;
        this.ownedVehicles = new ArrayList<>();
    }

    public double getMoney() {
        return money;
    }
    public int getNumberOfOwnedVehicles(){
        return ownedVehicles.size();
    }
    private void addVehicleToCollection(Vehicle vehicle){
        ownedVehicles.add(vehicle);
    }
    private void setMoney(double amount){
        this.money -= amount;
    }
    public void buyVehicle(Vehicle vehicle){
        setMoney(vehicle.getMarketPrice());
        addVehicleToCollection(vehicle);
    }
}

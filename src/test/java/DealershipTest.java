import VehicleParts.*;
import Vehicles.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class DealershipTest {

    Dealership myDealership;
    HybridCar myHybrid;
    Car myCar;
    ElectricCar myElectric;
    Engine myEngine;
    Tire myTire;
    Chassis myChassis;
    Gearbox myGearbox;
    Battery myBattery;
    Customer myCustomer;
    Car testCar;

    @Before
    public void setUp() throws Exception {
        myEngine = new Engine();
        myBattery = new Battery();
        myChassis = new Chassis();
        myGearbox = new Gearbox();
        myTire = new Tire();
        myHybrid = new HybridCar(myGearbox, myTire, myChassis, 250.0, Colour.BLACK, myEngine, myBattery);
        myCar = new Car(myGearbox, myTire, myChassis, 300.0, Colour.GREEN, myEngine);
        myElectric = new ElectricCar(myGearbox, myTire, myChassis, 500.0, Colour.SILVER, myBattery);
        ArrayList<Vehicle> testStock = new ArrayList<>();
        testStock.add(myCar);
        testStock.add(myElectric);
        testStock.add(myHybrid);
        myDealership = new Dealership(testStock, 50000.0);
        myCustomer = new Customer(2500.0);
        testCar = new Car(myGearbox, myTire, myChassis, 25000.0, Colour.RED, myEngine);
    }

    @Test
    public void getStock() {
        assertEquals(3, myDealership.getStockSize());
    }

    @Test
    public void getTill() {
        assertEquals(50000.0, myDealership.getTill(), 0.0);
    }
    @Test
    public void canSellCar(){
        myDealership.sellCar(myCar, myCustomer);
        assertEquals(1, myCustomer.getNumberOfOwnedVehicles());
        assertEquals(2200.0, myCustomer.getMoney(), 0.0);
        assertEquals(50300.0, myDealership.getTill(), 0.0);
        assertEquals(2, myDealership.getStockSize());
    }
    @Test
    public void canBuyCar(){
        myDealership.buyCar(testCar);
        assertEquals(4, myDealership.getStockSize());
        assertEquals(25000.0, myDealership.getTill(), 0.0);
    }
    @Test
    public void canRepairCar(){
        myCar.setDamages(100.0);
        myDealership.repairCar(myCar);
        assertEquals(0.0, myCar.getDamages(), 0.0);
        assertEquals(49900.0, myDealership.getTill(), 0.0);
    }
}
package Vehicles;


import VehicleParts.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {
    HybridCar myHybrid;
    Engine myEngine;
    Tire myTire;
    Chassis myChassis;
    Gearbox myGearbox;
    Battery myBattery;

    @Before
    public void before(){
        myEngine = new Engine();
        myBattery = new Battery();
        myChassis = new Chassis();
        myGearbox = new Gearbox();
        myTire = new Tire();
        myHybrid = new HybridCar(myGearbox, myTire, myChassis, 250.0, Colour.BLACK, myEngine, myBattery);
    }

    @Test
    public void hasProperties(){
        assertEquals(myGearbox, myHybrid.getGearbox());
        assertEquals(myTire, myHybrid.getTireMake());
        assertEquals(myChassis, myHybrid.getChassis());
        assertEquals(Colour.BLACK, myHybrid.getColour());
        assertEquals(250.0, myHybrid.getPrice(),0.0);
    }

    @Test
    public void getEngine() {
        assertEquals(myEngine, myHybrid.getEngine());
    }

    @Test
    public void getBattery() {
        assertEquals(myBattery, myHybrid.getBattery());
    }
}
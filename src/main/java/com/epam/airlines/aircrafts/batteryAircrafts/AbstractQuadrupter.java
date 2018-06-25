package com.epam.airlines.aircrafts.batteryAircrafts;


import com.epam.airlines.Destination;
import com.epam.airlines.aircrafts.Flyable;
import com.epam.airlines.util.AircraftBuilder;

public abstract class AbstractQuadrupter implements Flyable {

    protected Destination currentDest;

    protected double rangeOfFlight;

    protected double radiusOfAction;

    protected double currentLevelOfCharge;

    protected double batteryCapacity;

    protected double carryingCapacity;

    protected double batteryConsumption;

    protected AbstractQuadrupter(AircraftBuilder aircraftBuilder) {
        this.currentDest = aircraftBuilder.currentDest;
        this.rangeOfFlight = aircraftBuilder.rangeOfFlight;
        this.radiusOfAction = aircraftBuilder.radiusOfAction;
        this.currentLevelOfCharge = aircraftBuilder.currentLevelOfCharge;
        this.batteryCapacity = aircraftBuilder.batteryCapacity;
        this.carryingCapacity = aircraftBuilder.carryingCapacity;
        this.batteryConsumption = aircraftBuilder.batteryConsumption;
    }


    protected final void recharge(){
        currentLevelOfCharge = batteryCapacity;
    }



}

package com.epam.airlines.aircrafts.fuelAircrafts;

import com.epam.airlines.Destination;
import com.epam.airlines.aircrafts.Flyable;
import lombok.Data;

/**
 * Created by anakasimova on 24/06/2018.
 */


@Data
public abstract class AbstractFuelAircrafts implements Flyable {

    protected double rangeOfFlight;

    protected double cruisingSpeed;

    protected double currentQuantityOfFuelInTank;

    protected double capacityOfTank;

    protected double ceiling;

    protected Destination currentDest;

    protected double enginePower;

    protected double fuelConsumption;

    protected int crewCapacity;

    protected AbstractFuelAircrafts(double rangeOfFlight, double cruisingSpeed, double currentQuantityOfFuelInTank, double capacityOfTank, double ceiling, Destination currentDest, double enginePower, double fuelConsumption, int crewCapacity) {
        this.rangeOfFlight = rangeOfFlight;
        this.cruisingSpeed = cruisingSpeed;
        this.currentQuantityOfFuelInTank = currentQuantityOfFuelInTank;
        this.capacityOfTank = capacityOfTank;
        this.ceiling = ceiling;
        this.currentDest = currentDest;
        this.enginePower = enginePower;
        this.fuelConsumption = fuelConsumption;
        this.crewCapacity = crewCapacity;
    }


    protected final void refuel(){
        currentQuantityOfFuelInTank = capacityOfTank;

    }


}

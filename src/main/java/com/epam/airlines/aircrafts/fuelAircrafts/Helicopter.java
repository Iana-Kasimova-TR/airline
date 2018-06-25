package com.epam.airlines.aircrafts.fuelAircrafts;

import com.epam.airlines.Destination;
import com.epam.airlines.util.NotEnoughResourcesForFlyingException;
import lombok.Data;

/**
 * Created by anakasimova on 24/06/2018.
 */
@Data
public class Helicopter extends AbstractFuelAircrafts {

    private double staticCeiling;

    private double bladeAngle;

    private double carryingCapacity;

    public Helicopter(double rangeOfFlight, double cruisingSpeed, double currentQuantityOfFuelInTank, double capacityOfTank, double ceiling, Destination currentDest, double enginePower, double fuelConsumption, int crewCapacity, double staticCeiling, double bladeAngle, double carryingCapacity) {
        super(rangeOfFlight, cruisingSpeed, currentQuantityOfFuelInTank, capacityOfTank, ceiling, currentDest, enginePower, fuelConsumption, crewCapacity);
        this.staticCeiling = staticCeiling;
        this.bladeAngle = bladeAngle;
        this.carryingCapacity = carryingCapacity;
    }

    public void fly(Destination dest) throws NotEnoughResourcesForFlyingException {

    }
}

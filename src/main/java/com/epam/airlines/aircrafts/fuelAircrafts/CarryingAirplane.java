package com.epam.airlines.aircrafts.fuelAircrafts;

import com.epam.airlines.Destination;
import com.epam.airlines.util.NotEnoughResourcesForFlyingException;
import lombok.Data;

/**
 * Created by anakasimova on 24/06/2018.
 */
@Data
public class CarryingAirplane extends AbstractAirplane {

    private double carryingCapacity;

    public CarryingAirplane(double rangeOfFlight, double cruisingSpeed, double currentQuantityOfFuelInTank, double capacityOfTank, double ceiling, Destination currentDest, double enginePower, double fuelConsumption, int crewCapacity, double wingspan, double carryingCapacity) {
        super(rangeOfFlight, cruisingSpeed, currentQuantityOfFuelInTank, capacityOfTank, ceiling, currentDest, enginePower, fuelConsumption, crewCapacity, wingspan);
        this.carryingCapacity = carryingCapacity;
    }

    public void fly(Destination dest) throws NotEnoughResourcesForFlyingException {

    }
}

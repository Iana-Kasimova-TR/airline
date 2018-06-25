package com.epam.airlines.aircrafts.fuelAircrafts;

import com.epam.airlines.Destination;
import lombok.Data;

/**
 * Created by anakasimova on 24/06/2018.
 */
@Data
public abstract class AbstractAirplane extends AbstractFuelAircrafts {

    protected double wingspan;


    protected AbstractAirplane(double rangeOfFlight, double cruisingSpeed, double currentQuantityOfFuelInTank, double capacityOfTank, double ceiling, Destination currentDest, double enginePower, double fuelConsumption, int crewCapacity, double wingspan) {
        super(rangeOfFlight, cruisingSpeed, currentQuantityOfFuelInTank, capacityOfTank, ceiling, currentDest, enginePower, fuelConsumption, crewCapacity);
        this.wingspan = wingspan;
    }
}

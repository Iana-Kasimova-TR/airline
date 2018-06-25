package com.epam.airlines.aircrafts.gasAircrfats;

import com.epam.airlines.CompositionInsideShell;
import com.epam.airlines.Destination;
import com.epam.airlines.aircrafts.Passengersable;
import com.epam.airlines.util.NotEnoughResourcesForFlyingException;

/**
 * Created by anakasimova on 24/06/2018.
 */
public abstract class AbstractDirigible extends AbstractAerostat{

    protected int crewCapacity;

    protected AbstractDirigible(double rangeOfFlight, double speed, double ceiling, Destination currentDest, double currentQuantityOfGas, double capacityOfGas, CompositionInsideShell compositionInsideShell, double gasConsumption, int crewCapacity) {
        super(rangeOfFlight, speed, ceiling, currentDest, currentQuantityOfGas, capacityOfGas, compositionInsideShell, gasConsumption);
        this.crewCapacity = crewCapacity;
    }
}

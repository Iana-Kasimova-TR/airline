package com.epam.airlines.aircrafts.gasAircrfats;

import com.epam.airlines.CompositionInsideShell;
import com.epam.airlines.Destination;
import com.epam.airlines.aircrafts.Passengersable;
import com.epam.airlines.util.NotEnoughOfPassengersCapacityException;
import com.epam.airlines.util.NotEnoughResourcesForFlyingException;
import lombok.Data;

/**
 * Created by anakasimova on 24/06/2018.
 */
@Data
public class CarryingDirigible extends AbstractDirigible{

    private double carryingCapacity;

    public CarryingDirigible(double rangeOfFlight, double speed, double ceiling, Destination currentDest, double currentQuantityOfGas, double capacityOfGas, CompositionInsideShell compositionInsideShell, double gasConsumption, int crewCapacity, double carryingCapacity) {
        super(rangeOfFlight, speed, ceiling, currentDest, currentQuantityOfGas, capacityOfGas, compositionInsideShell, gasConsumption, crewCapacity);
        this.carryingCapacity = carryingCapacity;
    }


    public void fly(Destination dest) throws NotEnoughResourcesForFlyingException {

    }

}

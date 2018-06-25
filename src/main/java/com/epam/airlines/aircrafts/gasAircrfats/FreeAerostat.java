package com.epam.airlines.aircrafts.gasAircrfats;

import com.epam.airlines.CompositionInsideShell;
import com.epam.airlines.Destination;
import com.epam.airlines.aircrafts.Passengersable;
import com.epam.airlines.util.NotEnoughOfPassengersCapacityException;
import com.epam.airlines.util.NotEnoughResourcesForFlyingException;

/**
 * Created by anakasimova on 24/06/2018.
 */
public class FreeAerostat extends AbstractAerostat implements Passengersable{


    private int passengersCapacity;

    public FreeAerostat(double rangeOfFlight, double speed, double ceiling, Destination currentDest, double currentQuantityOfGas, double capacityOfGas, CompositionInsideShell compositionInsideShell, double gasConsumption, int passengersCapacity) {
        super(rangeOfFlight, speed, ceiling, currentDest, currentQuantityOfGas, capacityOfGas, compositionInsideShell, gasConsumption);
        this.passengersCapacity = passengersCapacity;
    }

    public void fly(Destination dest) throws NotEnoughResourcesForFlyingException {

    }

    public void setPassengers(int numberOfPassengers) throws NotEnoughOfPassengersCapacityException {

        if(numberOfPassengers > passengersCapacity){
            throw new NotEnoughOfPassengersCapacityException("not enough places for passengers, we have " + passengersCapacity + " but we should put " + numberOfPassengers + " passenger");
        }

        passengersCapacity = passengersCapacity - numberOfPassengers;
    }

}

package com.epam.airlines.aircrafts.gasAircrfats;

import com.epam.airlines.CompositionInsideShell;
import com.epam.airlines.Destination;
import com.epam.airlines.aircrafts.Passengersable;
import com.epam.airlines.aircrafts.Flyable;
import com.epam.airlines.util.AircraftBuilder;
import com.epam.airlines.util.NotEnoughOfPassengersCapacityException;

/**
 * Created by anakasimova on 24/06/2018.
 */
public abstract class AbstractAerostat implements Flyable{

    protected double rangeOfFlight;

    protected double speed;

    protected double ceiling;

    protected Destination currentDest;

    protected double currentQuantityOfGas;

    protected double capacityOfGas;

    protected CompositionInsideShell compositionInsideShell;

    protected double gasConsumption;

    protected AbstractAerostat(AircraftBuilder aircraftBuilder) {
        this.rangeOfFlight = aircraftBuilder.rangeOfFlight;
        this.speed = aircraftBuilder.speed;
        this.ceiling = aircraftBuilder.ceiling;
        this.currentDest = aircraftBuilder.currentDest;
        this.currentQuantityOfGas = aircraftBuilder.currentQuantityOfGas;
        this.capacityOfGas = aircraftBuilder.capacityOfGas;
        this.compositionInsideShell = aircraftBuilder.compositionInsideShell;
        this.gasConsumption = aircraftBuilder.gasConsumption;
    }


    protected final void replenishGas(){
        currentQuantityOfGas = capacityOfGas;
    }



}

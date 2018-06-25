package com.epam.airlines.util;

import com.epam.airlines.CompositionInsideShell;
import com.epam.airlines.Destination;
import com.epam.airlines.aircrafts.Flyable;

/**
 * Created by anakasimova on 24/06/2018.
 */
public class AircraftBuilder<T extends Flyable> {

    public double radiusOfAction;

    private double currentLevelOfCharge;

    private double batteryCapacity;

    private double batteryConsumption;

    private double wingspan;

    private double cruisingSpeed;

    private double currentQuantityOfFuelInTank;

    private double capacityOfTank;

    private double enginePower;

    private double fuelConsumption;

    private double memoryCardCapacity;

    private double staticCeiling;

    private double bladeAngle;

    private double carryingCapacity;

    private int passengersCapacity;

    private double rangeOfFlight;

    private double speed;

    private double ceiling;

    private Destination currentDest;

    private double currentQuantityOfGas;

    private double capacityOfGas;

    private CompositionInsideShell compositionInsideShell;

    private double gasConsumption;

    private int crewCapacity;




   public T build(){
       return new T(this);
   }



}

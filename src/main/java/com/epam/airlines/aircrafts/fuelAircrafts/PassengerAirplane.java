package com.epam.airlines.aircrafts.fuelAircrafts;

import com.epam.airlines.Destination;
import com.epam.airlines.aircrafts.Passengersable;
import com.epam.airlines.util.NotCorrecCharacteristicsOfAircraftException;
import com.epam.airlines.util.NotEnoughOfPassengersCapacityException;
import com.epam.airlines.util.NotEnoughResourcesForFlyingException;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by anakasimova on 24/06/2018.
 */
public class PassengerAirplane extends AbstractAirplane implements Passengersable{

    private int passengersCapacity;

    public PassengerAirplane(double rangeOfFlight, double cruisingSpeed, double currentQuantityOfFuelInTank, double capacityOfTank, double ceiling, Destination currentDest, double enginePower, double fuelConsumption, int crewCapacity, double wingspan, int passengersCapacity) {
        super(rangeOfFlight, cruisingSpeed, currentQuantityOfFuelInTank, capacityOfTank, ceiling, currentDest, enginePower, fuelConsumption, crewCapacity, wingspan);
        this.passengersCapacity = passengersCapacity;
    }


    public void fly(Destination dest) throws NotEnoughResourcesForFlyingException {

    }

    public void setPassengers(int numberOfPassengers) throws NotEnoughOfPassengersCapacityException {
        if((numberOfPassengers + crewCapacity) > passengersCapacity){
            throw new NotEnoughOfPassengersCapacityException("not enough places for passengers, we have " + passengersCapacity + " but we should put " + numberOfPassengers + " passenger");
        }

        passengersCapacity = passengersCapacity - numberOfPassengers;
    }
}

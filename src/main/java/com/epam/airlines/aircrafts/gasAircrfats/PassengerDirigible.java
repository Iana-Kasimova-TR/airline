package com.epam.airlines.aircrafts.gasAircrfats;

import com.epam.airlines.CompositionInsideShell;
import com.epam.airlines.Destination;
import com.epam.airlines.aircrafts.Passengersable;
import com.epam.airlines.util.AircraftBuilder;
import com.epam.airlines.util.NotCorrecCharacteristicsOfAircraftException;
import com.epam.airlines.util.NotEnoughOfPassengersCapacityException;
import com.epam.airlines.util.NotEnoughResourcesForFlyingException;
import lombok.Data;

/**
 * Created by anakasimova on 24/06/2018.
 */
@Data
public class PassengerDirigible extends AbstractDirigible implements Passengersable {

    private int passengersCapacity;

    public PassengerDirigible(AircraftBuilder aircraftBuilder) throws NotCorrecCharacteristicsOfAircraftException{
        super(aircraftBuilder);
        this.passengersCapacity = aircraftBuilder.passengersCapacity;
    }


    public void setPassengers(int numberOfPassengers
    ) throws NotEnoughOfPassengersCapacityException {
            if((numberOfPassengers + crewCapacity) > passengersCapacity){
                throw new NotEnoughOfPassengersCapacityException("not enough places for passengers, we have " + passengersCapacity + " but we should put " + numberOfPassengers + " passenger");
            }

            passengersCapacity = passengersCapacity - numberOfPassengers;

    }

    public void fly(Destination dest) throws NotEnoughResourcesForFlyingException {

    }
}

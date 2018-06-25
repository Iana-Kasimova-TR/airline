package com.epam.airlines.aircrafts;

import com.epam.airlines.util.NotEnoughOfPassengersCapacityException;

/**
 * Created by anakasimova on 24/06/2018.
 */
public interface Passengersable {

    void setPassengers(int numberOfPassengers) throws NotEnoughOfPassengersCapacityException;
}

package com.epam.airlines.util;

/**
 * Created by anakasimova on 24/06/2018.
 */
public class NotEnoughOfPassengersCapacityException extends NotEnoughResourcesException {

    public NotEnoughOfPassengersCapacityException(String message) {
        super(message);
    }
}

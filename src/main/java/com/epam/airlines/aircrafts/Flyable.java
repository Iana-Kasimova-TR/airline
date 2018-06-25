package com.epam.airlines.aircrafts;

import com.epam.airlines.Destination;
import com.epam.airlines.util.NotEnoughResourcesForFlyingException;

/**
 * Created by anakasimova on 24/06/2018.
 */
public interface Flyable {

    void fly(Destination dest) throws NotEnoughResourcesForFlyingException;
}

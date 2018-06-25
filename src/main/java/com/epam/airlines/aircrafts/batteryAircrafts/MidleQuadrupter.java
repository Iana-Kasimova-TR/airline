package com.epam.airlines.aircrafts.batteryAircrafts;

import com.epam.airlines.Destination;
import com.epam.airlines.util.AircraftBuilder;
import com.epam.airlines.util.NotEnoughResourcesForFlyingException;
import lombok.Data;

/**
 * Created by anakasimova on 24/06/2018.
 */
@Data
public class MidleQuadrupter extends AbstractQuadrupter{


    public MidleQuadrupter(AircraftBuilder aircraftBuilder) {
        super(aircraftBuilder);
    }

    public void fly(Destination dest) throws NotEnoughResourcesForFlyingException {

    }
}

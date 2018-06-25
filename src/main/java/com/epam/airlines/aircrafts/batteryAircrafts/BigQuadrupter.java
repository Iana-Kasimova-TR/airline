package com.epam.airlines.aircrafts.batteryAircrafts;

import com.epam.airlines.Destination;
import com.epam.airlines.aircrafts.RecordVideoable;
import com.epam.airlines.util.AircraftBuilder;
import com.epam.airlines.util.NotEnoughMemoryForRecordingException;
import com.epam.airlines.util.NotEnoughResourcesForFlyingException;
import lombok.Data;

/**
 * Created by anakasimova on 24/06/2018.
 */
@Data
public class BigQuadrupter extends AbstractQuadrupter implements RecordVideoable{

    private double memoryCardCapacity;

    public BigQuadrupter(AircraftBuilder aircraftBuilder) {
        super(aircraftBuilder);
        this.memoryCardCapacity = aircraftBuilder.memoryCardCapacity;
    }


    public void fly(Destination dest) throws NotEnoughResourcesForFlyingException {

    }

    public void recordVideo() throws NotEnoughMemoryForRecordingException {
        //todo decreament memory each second while called stoprecord method
    }

    public void stopRecordVideo() {
        //stop decreament memory
    }
}

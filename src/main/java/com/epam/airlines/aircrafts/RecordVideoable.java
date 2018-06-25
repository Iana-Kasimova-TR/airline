package com.epam.airlines.aircrafts;

import com.epam.airlines.util.NotEnoughMemoryForRecordingException;

/**
 * Created by anakasimova on 24/06/2018.
 */
public interface RecordVideoable {

    void recordVideo() throws NotEnoughMemoryForRecordingException;

    void stopRecordVideo();
}

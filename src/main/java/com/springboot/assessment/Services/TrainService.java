package com.springboot.assessment.Services;

import com.springboot.assessment.Schema.Booking;
import com.springboot.assessment.Schema.Train;

import java.util.List;

public interface TrainService {

    String addTrain(List<Train> train);
}

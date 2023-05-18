package com.springboot.assessment.Services;

import com.springboot.assessment.Doa.TrainDoa;
import com.springboot.assessment.Schema.Train;

import java.util.List;

public class TrainServiceImp implements TrainService{
    TrainDoa trainDoa;
    @Override
    public String addTrain(List<Train> train) {
        trainDoa.saveAll(train);
        return null;
    }
}

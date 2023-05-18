package com.springboot.assessment.Controllers;

import com.springboot.assessment.Doa.TrainDoa;
import com.springboot.assessment.Schema.Train;
import com.springboot.assessment.Services.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public class TrainController {

    @Autowired
    private TrainService trainService;

    @PostMapping
    String addTrain(List<Train> train)
    {
        return trainService.addTrain(train);
    }
}

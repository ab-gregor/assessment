package com.springboot.assessment.Doa;

import com.springboot.assessment.Schema.Train;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainDoa extends JpaRepository<Train,Integer> {
}

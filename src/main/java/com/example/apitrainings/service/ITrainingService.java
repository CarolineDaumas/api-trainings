package com.example.apitrainings.service;

import com.example.apitrainings.Entities.Training;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ITrainingService {

    public List<Training> getTrainings();

    Training saveTraining(Training training);

    void deleteTraining(Long id);

    Optional<Training> readTraining(Long id);

    List<Training> readTrainingsByCategoryId(Long catId);

    List<Training> readTrainingsByCategoryName (String name);
}

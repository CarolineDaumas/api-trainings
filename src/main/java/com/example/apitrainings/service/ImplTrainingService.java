package com.example.apitrainings.service;

import com.example.apitrainings.Entities.Training;
import com.example.apitrainings.dao.TrainingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImplTrainingService implements ITrainingService {

    @Autowired
    TrainingRepository trainingRepository;

    @Override
    public List<Training> getTrainings() {
        return trainingRepository.findAll();
    }

    @Override
    public Training saveTraining(Training training) {
        return trainingRepository.save(training);
    }

    @Override
    public void deleteTraining(Long id) {
        trainingRepository.deleteById(id);
    }


    @Override
    public Optional<Training> readTraining(Long id) {
        return trainingRepository.findById(id);
    }

    @Override
    public List<Training> readTrainingsByCategoryId(Long catId) {
        return  trainingRepository.findByCategoryId(catId);
    }

    @Override
    public List<Training> readTrainingsByCategoryName(String name) {
        return null;// trainingRepository.findByCategoryName(name);
    }
}

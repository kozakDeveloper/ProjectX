package com.projectX.service;


import com.projectX.model.Exercise;
import com.projectX.repository.interfaces.IExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExerciseService implements IExerciseSerivce {

    @Autowired
    private IExerciseRepository exerciseRepository;

    public void save(Exercise exercise) {
        exerciseRepository.save(exercise);
    }
}

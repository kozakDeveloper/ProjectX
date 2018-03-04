package com.projectX.controller;

import com.projectX.model.Exercise;
import com.projectX.service.IExerciseSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ExerciseRestController {

    @Autowired
    private IExerciseSerivce exerciseSerivce;

    @RequestMapping(value = "/allExercises", method = RequestMethod.GET)
    public ResponseEntity<List<Exercise>> getAllExercises() {
        List<Exercise> listOfExercises = new ArrayList<Exercise>();
        Exercise newExercise = new Exercise();
        newExercise.setId(1);
        newExercise.setName("Wyciskanie");
        exerciseSerivce.save(newExercise);
        listOfExercises.add(newExercise);

        return new ResponseEntity<List<Exercise>>(listOfExercises, HttpStatus.OK);
    }
}

package com.projectX.repository;

import com.projectX.model.Exercise;
import com.projectX.repository.interfaces.IExerciseRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class ExerciseRepository implements IExerciseRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public void save(Exercise exercise) {
        entityManager.persist(exercise);
    }
}

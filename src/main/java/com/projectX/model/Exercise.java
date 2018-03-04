package com.projectX.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Exercise {

    @Id
    private long id;
    private String name;
    private String muscleParty;
    private String kind;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMuscleParty() {
        return muscleParty;
    }

    public void setMuscleParty(String muscleParty) {
        this.muscleParty = muscleParty;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Exercise exercise = (Exercise) o;

        if (id != exercise.id) return false;
        if (name != null ? !name.equals(exercise.name) : exercise.name != null) return false;
        if (muscleParty != null ? !muscleParty.equals(exercise.muscleParty) : exercise.muscleParty != null)
            return false;
        return kind != null ? kind.equals(exercise.kind) : exercise.kind == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (muscleParty != null ? muscleParty.hashCode() : 0);
        result = 31 * result + (kind != null ? kind.hashCode() : 0);
        return result;
    }
}

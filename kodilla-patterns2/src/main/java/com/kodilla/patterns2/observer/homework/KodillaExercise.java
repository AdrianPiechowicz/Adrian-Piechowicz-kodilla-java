package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observer.forum.Observer;

import java.util.ArrayList;
import java.util.List;

public class KodillaExercise implements Observable {
    private final List<String> exercises;
    private final String name;
    private final List<Mentor> mentors;

    public KodillaExercise(String name) {
        mentors = new ArrayList<>();
        exercises = new ArrayList<>();
        this.name = name;
    }

    public List<String> getExercises() {
        return exercises;
    }

    public String getName() {
        return name;

    }

    public void addExercise(String name) {
        exercises.add(name);
        notifyMentor();
    }

    @Override
    public void registerMentor(Mentor mentor) {
        mentors.add(mentor);
    }

    @Override
    public void notifyMentor() {
        for(Mentor mentors: mentors) {
            mentors.update(this);
        }
    }

    @Override
    public void removeMentor(Mentor mentor) {
        mentors.remove(mentor);
    }
}

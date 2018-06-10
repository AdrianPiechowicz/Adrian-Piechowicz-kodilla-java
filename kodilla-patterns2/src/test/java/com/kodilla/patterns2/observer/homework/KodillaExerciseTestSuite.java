package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class KodillaExerciseTestSuite {

    @Test
    public void testUpdate() {
        KodillaExercise firstExercise = new KodillaExercise("First one");
        KodillaExercise secondExercise = new KodillaExercise("Second one");
        KodillaExercise thirdExercise = new KodillaExercise("Third one");
        MentorOne mentorOne = new MentorOne("Pierwszy master");
        MentorTwo mentorTwo = new MentorTwo("Drugi master");
        firstExercise.registerMentor(mentorOne);
        firstExercise.registerMentor(mentorTwo);
        secondExercise.registerMentor(mentorOne);
        thirdExercise.registerMentor(mentorTwo);

        //when
        firstExercise.addExercise("Hej!");
        firstExercise.addExercise("Jestem Adrian");
        secondExercise.addExercise("Pomożesz? :)");
        thirdExercise.addExercise("takie coś napisałem");
        thirdExercise.addExercise("ciekawe czy testy przejdą...");

        //then
        assertEquals(3,mentorOne.getUpdateCount());
        assertEquals(4,mentorTwo.getUpdateCount());
    }
}
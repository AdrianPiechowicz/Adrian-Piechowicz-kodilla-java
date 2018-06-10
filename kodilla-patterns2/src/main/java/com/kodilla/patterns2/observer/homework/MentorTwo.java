package com.kodilla.patterns2.observer.homework;

public class MentorTwo implements Mentor {
    private final String username;
    private int updateCount;

    public MentorTwo(String username) {
        this.username = username;

    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }

    @Override
    public void update(KodillaExercise kodillaExercise) {
        System.out.println(username + " new message from Kodilla: "+ kodillaExercise.getName() + " ("+kodillaExercise.getExercises() +")");
        updateCount++;
    }

}

package com.javalab.RRRRRR;

import java.util.Arrays;

public class Student {
    private String name;
    private int[] scores;

    public Student(String name, int[] scores) {
        this.name = name;
        this.scores = scores;
    }

    public String getName() {
        return name;
    }
    public int[] getScores() {
        return scores;
    }

    public double calculateAverage() {
        int sum = Arrays.stream(scores).sum();
        return (double) sum / scores.length;
    }

}
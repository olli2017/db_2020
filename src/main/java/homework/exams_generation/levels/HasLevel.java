package homework.exams_generation.levels;

import homework.exams_generation.Exercise;

import java.util.Random;

public interface HasLevel {
    Random random = new Random();

    Exercise generateExercise();

    int myCode();
}

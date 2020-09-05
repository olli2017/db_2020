package homework.exams_generation.levels;

import homework.exams_generation.Exercise;

public class DefaultLevel implements HasLevel {
    @Override
    public Exercise generateExercise() {
        throw new RuntimeException("No such level");
    }

    @Override
    public int myCode() {
        return 0;
    }
}

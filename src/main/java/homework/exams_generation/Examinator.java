package homework.exams_generation;

import homework.exams_generation.levels.Level1;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Evgeny Borisov
 */

@RequiredArgsConstructor
public class Examinator {
    private final int level;

    public List<Exercise> generate(int amount) {
        List<Exercise> exercises = new ArrayList<>(amount);
        for (int i = 0; i < amount; i++) {
            exercises.add(getRandomExcerciseByLevel());
        }

        return exercises;
    }

    private Exercise getRandomExcerciseByLevel() {
        if (level == 1) {
            return new Level1().getRandomExercise();
        }
        return null;
    }

    public static String exerciseToString(Exercise e) {
        return e.getA() + " " + e.getOperator().getSign() + " " + e.getB() + " = " + e.getAnswer();
    }
}

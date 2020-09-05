package homework.exams_generation;

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
        return new Exercise(2, 3, 5, Operator.PLUS);
    }
}

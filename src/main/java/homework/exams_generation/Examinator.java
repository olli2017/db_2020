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
    private final LevelsDistributor levelsDistributor = new LevelsDistributor();

    public List<Exercise> generate(int amount) {
        List<Exercise> exercises = new ArrayList<>(amount);
        for (int i = 0; i < amount; i++) {
            exercises.add(getRandomExerciseByLevel());
        }

        return exercises;
    }

    private Exercise getRandomExerciseByLevel() {
        return levelsDistributor.generateByLevel(level);
    }
}

package homework.exams_generation;

import homework.exams_generation.levels.DefaultLevel;
import homework.exams_generation.levels.HasLevel;
import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LevelsDistributor {
    private final Map<Integer, HasLevel> levelsMap = new HashMap<>();


    @SneakyThrows
    public LevelsDistributor() {
        Reflections scanner = new Reflections("homework.exams_generation.levels");
        Set<Class<? extends HasLevel>> classes = scanner.getSubTypesOf(HasLevel.class);
        for (Class<? extends HasLevel> aClass : classes) {
            HasLevel hasLevel = aClass.getDeclaredConstructor().newInstance();
            if (levelsMap.containsKey(hasLevel.myCode())) {
                throw new IllegalStateException(hasLevel.myCode() + " already exists");
            }
            levelsMap.put(hasLevel.myCode(), hasLevel);
        }
    }

    public Exercise generateExerciseByLevel(int level) {
        HasLevel hasLevel = levelsMap.getOrDefault(level, new DefaultLevel());
        return hasLevel.generateExercise();
    }
}

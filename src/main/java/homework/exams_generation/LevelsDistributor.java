package homework.exams_generation;

import homework.exams_generation.HasLevel;
import homework.never_use_switch.DefaultMailSender;
import homework.never_use_switch.MailInfo;
import homework.never_use_switch.MailSender;
import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LevelsDistributor {
    private Map<Integer, HasLevel> levelsMap = new HashMap<>();


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

    public Exercise generateByLevel(int level) {
        HasLevel hasLevel = levelsMap.getOrDefault(level, null);
        return hasLevel.getRandomExercise();
    }
}

package homework.exams_generation;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Examinator examinator = new Examinator(1);
        List<Exercise> exerciseList = examinator.generate(5);
        for (Exercise e : exerciseList) {
            System.out.println(Examinator.exerciseToString(e));
        }
    }
}

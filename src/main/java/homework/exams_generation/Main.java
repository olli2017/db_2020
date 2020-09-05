package homework.exams_generation;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Examinator examinator = new Examinator(3);
        List<Exercise> exerciseList = examinator.generate(3);
        for (Exercise e : exerciseList) {
            System.out.println(e);
        }
    }
}

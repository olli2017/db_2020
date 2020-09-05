package homework.exams_generation.levels;

import homework.exams_generation.Exercise;
import homework.exams_generation.Operator;

//    only sum with digits
public class Level1 implements HasLevel {

    @Override
    public Exercise generateExercise() {
        int firstOperand = random.nextInt(10);
        int secondOperand = random.nextInt(10);
        int ans = firstOperand + secondOperand;

        return new Exercise(firstOperand, secondOperand, ans, Operator.PLUS);
    }

    @Override
    public int myCode() {
        return 1;
    }
}

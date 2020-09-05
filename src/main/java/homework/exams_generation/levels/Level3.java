package homework.exams_generation.levels;

import homework.exams_generation.Exercise;
import homework.exams_generation.Operator;
import homework.exams_generation.utils.LevelsUtils;

public class Level3 implements HasLevel {

    @Override
    public Exercise generateExercise() {
        int firstOperand = random.nextInt(myCode() * 10);
        int secondOperand = random.nextInt(myCode() * 10);
        Operator operator = LevelsUtils.randomOperator();
        double calc = LevelsUtils.calc(firstOperand, secondOperand, operator);

        return new Exercise(firstOperand, secondOperand, calc, operator);
    }

    @Override
    public int myCode() {
        return 3;
    }
}

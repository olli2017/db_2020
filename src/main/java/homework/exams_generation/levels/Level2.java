package homework.exams_generation.levels;

import homework.exams_generation.Exercise;
import homework.exams_generation.HasLevel;
import homework.exams_generation.Operator;

import java.util.Random;


public class Level2 implements HasLevel {
    Random random = new Random();

    public Exercise getRandomExercise() {
        int firstOperand = random.nextInt(myCode() * 10);
        int secondOperand = random.nextInt(myCode() * 10);
        Operator operator = LevelsUtils.randomPlusMinusOperator();
        double calc = LevelsUtils.calc(firstOperand, secondOperand, operator);

        return new Exercise(firstOperand, secondOperand, calc, operator);
    }

    @Override
    public int myCode() {
        return 2;
    }
}

package homework.exams_generation.utils;

import homework.exams_generation.Operator;

import java.util.Random;

public class LevelsUtils {
    static Random random = new Random();

    public static Operator randomOperator() {
        return Operator.values()[random.nextInt(4)];
    }

    public static Operator randomPlusMinusOperator() {
        return Operator.values()[random.nextInt(2)];
    }

    public static double calc(double a, double b, Operator operator) {
        String sign = operator.getSign();

        if (sign.equals("+")) {
            return a + b;
        } else if (sign.equals("-")) {
            return a - b;
        } else if (sign.equals("*")) {
            return a * b;
        } else if (sign.equals("/")) {
            return a / b;
        }
        throw new UnsupportedOperationException();
    }
}

package my_spring;

import java.util.Random;

public class InjectRandomIntHandler {
    Random random = new Random();

    public int getValue(int min, int max) {
        return random.nextInt(max - min) + min;
    }
}

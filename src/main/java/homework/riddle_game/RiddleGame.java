package homework.riddle_game;

import design_patterns.template_method.Game;
import design_patterns.template_method.Pair;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Evgeny Borisov
 */
public class RiddleGame implements Game {

    //todo
    private final Random random = new Random();
    private final int maxLimit;
    private final List<Pair> scores = new ArrayList<>();

    public RiddleGame(int max) {
        this.maxLimit = max;

    }

    private int initNumber() {
        return random.nextInt(maxLimit);
    }


    @Override
    public void play() {
        String s = JOptionPane.showInputDialog("Play?(0 - No, others - Yes)");

        while (!s.equals("0")) {
            String name = JOptionPane.showInputDialog("Name");
            int points = playRound();
            scores.add(new Pair(name, points));
            s = JOptionPane.showInputDialog("Play?(0 - No, others - Yes)");
        }
        printScores(scores);
    }

    private int playRound() {
        int targetNumber = initNumber();
        int inputNumber = Integer.parseInt(JOptionPane.showInputDialog("input your number"));
        int counter = 1;
        while (inputNumber != targetNumber) {
            if (inputNumber > targetNumber) {
                System.out.println("target number is less then your number");
            } else {
                System.out.println("target number is bigger then your number");
            }
            inputNumber = Integer.parseInt(JOptionPane.showInputDialog("input your number"));
            counter++;
        }
        System.out.println("You win! Number of attempts: ");
        System.out.println(counter);
        return counter;
    }

    private void printScores(List<Pair> scores) {
        scores.forEach(System.out::println);
    }

}

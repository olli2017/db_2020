package homework.exams_generation;

public class Main {
    public static void main(String[] args) {
        Examinator examinator = new Examinator(1);
        System.out.println(examinator.generate(5));
    }
}

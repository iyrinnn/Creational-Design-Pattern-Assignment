package QuestionSubsystem;

import java.util.Random;

public class QuestionFaker {

    private static String[] types = {"MCQ", "True/False", "Essay", "Programming"};
    private static String[] difficulties = {"Easy", "Medium", "Hard"};
    private static Random rand = new Random();

    public static Question generate() {

        String type = types[rand.nextInt(types.length)];
        String difficulty = difficulties[rand.nextInt(difficulties.length)];
        int points = rand.nextInt(20) + 1;

        if (type.equals("MCQ")) {
            return new MCQ(type, points, difficulty);
        }
        else if (type.equals("True/False")) {
            return new TrueFalse(type, points, difficulty);
        }
        else if (type.equals("Essay")) {
            return new Essay(type, points, difficulty);
        }
        else {
            return new Programming(type, points, difficulty);
        }
    }
}
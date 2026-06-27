package QuestionSubsystem;

public class TrueFalseRenderer implements QuestionRenderer {

    @Override
    public void render(Question tf) {
        System.out.println("[True/False] Points: " + tf.getPoints() + " Difficulty: " + tf.getDifficulty());
    }
}

package QuestionSubsystem;

public class TrueFalseEvaluator implements QuestionEvaluator {

    @Override
    public int evaluate (Question tf, String answer) {
        if (answer != null && answer.equalsIgnoreCase("correct")) {
            return tf.getPoints();
        }
        return 0;
    }
}

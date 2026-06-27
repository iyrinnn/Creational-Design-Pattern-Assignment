package QuestionSubsystem;

public class EssayEvaluator implements QuestionEvaluator {

    @Override
    public int evaluate (Question essay, String answer){

        if (answer != null && !answer.trim().isEmpty()) {
            return essay.getPoints();
        }
        return 0;
    }
}
package QuestionSubsystem;

public class MCQEvaluator implements  QuestionEvaluator{

    @Override
    public int evaluate (Question MCQ, String answer){
        if (answer != null && answer.equalsIgnoreCase("correct")) {
            return MCQ.getPoints();
        }
        return 0;
    }
}

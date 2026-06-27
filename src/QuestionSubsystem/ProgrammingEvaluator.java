package QuestionSubsystem;

public class ProgrammingEvaluator implements QuestionEvaluator{

    @Override
    public int evaluate (Question programming, String answer){
        if (answer != null && answer.contains("return")) {
            return programming.getPoints();
        }
        return 0;
    }
}

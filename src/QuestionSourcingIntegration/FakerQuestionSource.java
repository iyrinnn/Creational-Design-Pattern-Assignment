package QuestionSourcingIntegration;

import QuestionSubsystem.Question;
import QuestionSubsystem.QuestionFaker;


public class FakerQuestionSource implements QuestionSource {

    @Override
    public Question getQuestion() {
        return QuestionFaker.generate();
    }
}
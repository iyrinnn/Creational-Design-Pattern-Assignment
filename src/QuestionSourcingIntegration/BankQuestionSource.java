package QuestionSourcingIntegration;

import QuestionSubsystem.Question;

import java.util.List;
import java.util.Random;

public class BankQuestionSource implements QuestionSource {

    private QuestionBank bank = new QuestionBank();
    private Random rand = new Random();

    @Override
    public Question getQuestion() {

        List<Question> questions = bank.getQuestions();
        return questions.get(rand.nextInt(questions.size()));
    }
}
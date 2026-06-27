package QuestionSourcingIntegration;

import QuestionSubsystem.*;
import java.util.ArrayList;
import java.util.List;

public class QuestionBank {

    private List<Question> questions = new ArrayList<>();

    public QuestionBank() {

        questions.add(new MCQ("MCQ", 2, "Easy"));
        questions.add(new MCQ("MCQ", 2, "Medium"));

        questions.add(new Essay("Essay", 10, "Hard"));

        questions.add(new Programming("Programming", 20, "Hard"));

        questions.add(new TrueFalse("True/False", 1, "Easy"));
    }

    public List<Question> getQuestions() {
        return questions;
    }
}
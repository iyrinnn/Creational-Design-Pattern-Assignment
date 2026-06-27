import ExamConfiguration.ExamBuilder;
import ExamConfiguration.ExamConfiguration;
import ExamProvisioning.*;
import QuestionSourcingIntegration.*;
import QuestionSubsystem.Question;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        ExamFactory factory = new MidtermExamFactory();
        Exam exam = factory.createExam();


        ExamConfiguration config = new ExamBuilder()
                .setTitle("OOP Midterm Exam")
                .setDuration(60)
                .setPassingScore(50)
                .setNegativeMarking(true)
                .setQuestionShuffle(true)
                .setAutoSubmit(true)
                .setCalculatorAllowed(false)
                .build();



        QuestionSource source = new BankQuestionSource();
        // QuestionSource source = new FakerQuestionSource();


        List<Question> questions = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            questions.add(source.getQuestion());
        }

        config.displayConfiguration(
                exam,
                "Question Bank Mode",
                questions
        );
    }
}
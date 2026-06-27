package ExamProvisioning;

public class PracticeQuizFactory extends ExamFactory {

    @Override
    public PracticeQuiz createExam() {
        return new PracticeQuiz();
    }
}
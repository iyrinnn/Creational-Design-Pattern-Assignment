package QuestionSubsystem;

public class MCQRenderer implements QuestionRenderer {

    @Override
    public void render(Question mcq) {
        System.out.println("[MCQ] Points: " + mcq.getPoints() + " Difficulty: " + mcq.getDifficulty());
    }
}

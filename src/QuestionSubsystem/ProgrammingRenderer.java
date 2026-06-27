package QuestionSubsystem;

public class ProgrammingRenderer implements QuestionRenderer {

    @Override
    public void render(Question programming ) {
        System.out.println("[Programming] Points: " + programming.getPoints() + " Difficulty: " + programming.getDifficulty());
    }
}

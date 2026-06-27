package QuestionSubsystem;

public class EssayRenderer implements QuestionRenderer {

    @Override
    public void render (Question essay){
        System.out.println("[Essay] Points: " + essay.getPoints() + " Difficulty: " + essay.getDifficulty());
    }
}

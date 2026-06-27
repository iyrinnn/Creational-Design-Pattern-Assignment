package QuestionSubsystem;

public class Programming implements Question {

    private String type;
    private int points;
    private String difficulty;

    public Programming(String type, int points, String difficulty) {
        this.type = type;
        this.points = points;
        this.difficulty = difficulty;
    }


    @Override
    public String getType(){
        return "Programming";
    }

    @Override
    public int getPoints(){
        return points;
    }

    @Override
    public String getDifficulty(){
        return difficulty;
    }


}

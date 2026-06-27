package QuestionSubsystem;

public class Essay implements Question {

    private String type;
    private int points;
    private String difficulty;

    public Essay(String type, int points, String difficulty) {
        this.type = type;
        this.points = points;
        this.difficulty = difficulty;
    }

    @Override
    public String getType (){
        return "Essay";
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

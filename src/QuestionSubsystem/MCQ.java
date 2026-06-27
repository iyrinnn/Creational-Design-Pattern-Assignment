package QuestionSubsystem;

public class MCQ implements Question {

    private String type;
    private int points;
    private String difficulty;

    public MCQ(String type, int points, String difficulty) {
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


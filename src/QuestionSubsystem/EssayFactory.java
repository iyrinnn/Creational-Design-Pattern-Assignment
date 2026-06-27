package QuestionSubsystem;

import QuestionSourcingIntegration.QuestionSource;

public class EssayFactory implements QuestionFactory {

    private QuestionSource source;

    public EssayFactory(QuestionSource source) {
        this.source = source;
    }

    public Question createQuestion(){
        return source.getQuestion();
    }

    public EssayRenderer createRenderer(){
        return new EssayRenderer();
    }

    public EssayEvaluator createEvaluator(){
        return new EssayEvaluator();
    }
}

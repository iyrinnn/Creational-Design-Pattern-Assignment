package QuestionSubsystem;

import QuestionSourcingIntegration.QuestionSource;

public class TrueFalseFactory implements QuestionFactory{

    private QuestionSource source;

    public TrueFalseFactory(QuestionSource source) {
        this.source = source;
    }

    public Question createQuestion(){
        return source.getQuestion();
    }

    public TrueFalseRenderer createRenderer(){
        return new TrueFalseRenderer();
    }

    public TrueFalseEvaluator createEvaluator(){
        return new TrueFalseEvaluator();
    }
}

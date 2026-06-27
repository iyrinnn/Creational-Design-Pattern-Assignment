package QuestionSubsystem;

import QuestionSourcingIntegration.QuestionSource;

public class ProgrammingFactory implements QuestionFactory{

    private QuestionSource source;

    public ProgrammingFactory(QuestionSource source) {
        this.source = source;
    }

    @Override
    public Question createQuestion(){
        return source.getQuestion();
    }

    @Override
    public ProgrammingRenderer createRenderer(){
        return new ProgrammingRenderer();
    }

    @Override
    public ProgrammingEvaluator createEvaluator(){
        return new ProgrammingEvaluator();
    }
}

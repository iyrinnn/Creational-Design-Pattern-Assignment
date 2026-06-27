package ExamProvisioning;

public class MidtermExamFactory extends ExamFactory {

    @Override
    public MidtermExam createExam(){
        return new MidtermExam();
    }

    }


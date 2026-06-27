package ExamProvisioning;

public class FinalExamFactory extends ExamFactory {

   @Override
   public FinalExam createExam(){
      return new FinalExam();
   }
}

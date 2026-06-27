package ExamConfiguration;

import ExamProvisioning.Exam;
import QuestionSubsystem.Question;

import java.util.List;

public class ExamConfiguration {

    String title;
    int duration;
    int passingScore;
    boolean negativeMarking;
    boolean questionShuffle;
    boolean autoSubmit;
    boolean calculatorAllowed;

    public void displayConfiguration(Exam exam, String source, List<Question> questions) {

        System.out.println("==============================================================");
        System.out.println("\t\tEXAM CREATED SUCCESSFULLY");
        System.out.println("==============================================================");

        System.out.println("Type: " + exam.getType());
        System.out.println("Title: " + title);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Passing Score: " + passingScore + " Marks");

        System.out.println("\nConfiguration Profiles:");

        if (negativeMarking) {
            System.out.println("✓ Negative Marking Enabled");
        } else {
            System.out.println("✗ Negative Marking Disabled");
        }

        if (questionShuffle) {
            System.out.println("✓ Question Shuffle Activated");
        } else {
            System.out.println("✗ Question Shuffle Disabled");
        }

        if (calculatorAllowed) {
            System.out.println("✓ Embedded Calculator Allowed");
        } else {
            System.out.println("✗ Embedded Calculator Not Allowed");
        }

        if (autoSubmit) {
            System.out.println("✓ Auto-Submit On Timeout");
        } else {
            System.out.println("✗ Auto-Submit Disabled");
        }

        System.out.println("\nQuestion Sourcing Strategy: " + source);

        System.out.println("\nCompiled Structural Components:");

        for (Question q : questions) {
            System.out.println("- [Type: " + q.getType()
                    + "] Points: " + q.getPoints()
                    + " Difficulty: " + q.getDifficulty());
        }

        System.out.println("==============================================================");
    }
}

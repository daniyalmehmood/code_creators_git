import java.util.ArrayList;

public class StudentGradeManager {

    // Reverse Student Names:
    public static String[] reverseStudentNames(String[] names) {
        String[] reverse = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            reverse[i] = new StringBuilder(names[i]).reverse().toString();
        }
        System.out.print("Reversed Names: {");
        for (int i = 0; i < reverse.length; i++) {
            System.out.print(reverse[i]);
            if (i < reverse.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("} ");
        return reverse;
    }

    // Get letter grade for one score:
    public static char getLetterGrade(int score) {
        if (score >= 90 && score <= 100) {
            return 'A';
        } else if (score >= 80 && score <= 89) {
            return 'B';
        } else if (score >= 70 && score <= 79) {
            return 'C';
        } else if (score >= 60 && score <= 69) {
            return 'D';
        } else {
            return 'F';
        }
    }

    // Find Students Who Need to Retake Exam:
    public static String[] findFailingStudents(String[] names, int[] scores) {
        ArrayList<String> failingList = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < 60) {
                failingList.add(names[i]);
            }
        }
        String[] failing = failingList.toArray(new String[0]);
        System.out.print("Failing Students: {");
        for (int i = 0; i < failing.length; i++) {
            System.out.print(failing[i]);
            if (i < failing.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

        return failing;
    }

    public static void main(String[] args) {
        String[] students = {"Alice", "Bob", "Charlie", "Diana"};
        int[] scores = {95, 67, 45, 78};

        // Reverse names and print:
        reverseStudentNames(students);

        // Print letter grades for all scores:
        System.out.print("Letter Grades: {");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(getLetterGrade(scores[i]));
            if (i < scores.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

        // Find Students Who Need to Retake Exam:
        findFailingStudents(students, scores);
    }
}

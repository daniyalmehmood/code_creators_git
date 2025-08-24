import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class GradeManager {
    public static String[] reverseStudentNames(String[] names) {
        StringBuilder reversedName = new StringBuilder();
        String[] reversedNames = new String[names.length];
        int count = 0;
        for (String name : names) {

            for (int j = name.length() - 1; j >= 0; j--) {
                reversedName.append(name.charAt(j));
            }
            reversedNames[count++] = reversedName.toString();
        }
        return reversedNames;
    }

    public static char getLetterGrade(int score) {
        if (score <= 100 && score >= 90) {
            return 'A';
        } else if (score < 90 && score >= 80) {
            return 'B';
        } else if (score < 80 && score >= 70) {
            return 'C';
        } else if (score < 70 && score >= 60) {
            return 'D';
        } else if (score < 60 && score >= 0) {
            return 'F';
        }
            else return '?';
    }

    public static String[] findFailingStudents(String[] names, int[] scores) {
        Queue <String> stack = new ArrayDeque<>();
        int failingIndex = 0;
        for (int index = 0; index < scores.length; index++) {
            if (scores[index] < 60) {
                failingIndex++;
                stack.add(names[index]);
            }
        }
        String[] failingNames = new String[failingIndex];
        for (int index = 0; !stack.isEmpty(); index++) {
            failingNames[index] = stack.remove();
        }
        return failingNames;
    }

    public static void main(String[] args) {
        String[] students =  {"Alice", "Bob", "Charlie", "Diana"};
        int[] scores = {95, 67, 45, 78};
        System.out.println("Reversed Names: " + Arrays.stream(reverseStudentNames(students)).toList());
        int index = 0;
        for (int score : scores) {
            System.out.println("the score of " + students[index++] + " is " + getLetterGrade(score));
        }

        System.out.println("Failing Students: " + Arrays.stream(findFailingStudents(students, scores)).toList());
    }

}

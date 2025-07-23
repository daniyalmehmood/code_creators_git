import java.util.ArrayList;
import java.util.Arrays;

public class Task1{

    public static String[] reverseStudentNames(String[] names) {
        String[] reversedNames = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            reversedNames[i] = names[names.length - 1 - i]; // Reverse the order
        }
        return reversedNames;
    }

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

    public static String[] findFailingStudents(String[] names, int[] scores) {
        ArrayList<String> below60 = new ArrayList<>();

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < 60) {
                below60.add(names[i]);
            }
        }
        return below60.toArray(new String[0]);
    }



    public static void main(String[] args) {
        String[] students = {"Noor", "Ali", "Sara", "Ahmed"};
        int[] scores = {92, 87, 79, 54};

        String[] reversed = reverseStudentNames(students);
        System.out.println("Reversed Names: " + Arrays.toString(reversed));

        System.out.print("Letter Grades: ");
        for (int score : scores) {
            System.out.print(getLetterGrade(score) + " ");
        }
        System.out.println();
        String[] failingStudents = findFailingStudents(students, scores);
        System.out.println("Failing Students: " + Arrays.toString(failingStudents));


    }
}

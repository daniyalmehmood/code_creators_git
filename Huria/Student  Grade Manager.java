import java.util.Arrays;
import java.util.ArrayList;

public class GradeManager {


    public static void main(String[] args) {

        String[] students = {"Alice", "Bob", "Charlie", "Diana"};
        String[] reversedStudent = new String[students.length];
        for (int i = 0; i < students.length; i++) {
            String nameToReverse = students[i];
            String reversedName = reverseStudentName(nameToReverse);
            reversedStudent[i] = reversedName;
        }

        int[] scores = {95, 67, 45, 78};
        char[] gr= new char[scores.length];
        for (int i = 0; i < scores.length; i++) {
            gr[i]=getLetterGrade(scores[i]) ;
        }
        String[] failingStudents = findFailingStudents(students, scores);

        System.out.println(Arrays.toString(students));
        System.out.println(Arrays.toString(gr));
        System.out.println("Students who need to retake the exam: " + Arrays.toString(failingStudents));

    }

    public static String reverseStudentName(String name) {

        StringBuilder reversedString = new StringBuilder();

        for (int i = name.length() - 1; i >= 0; i--) {
            reversedString.append(name.charAt(i));
        }

        return reversedString.toString();
    }

    public static char getLetterGrade(int score){
        if(score>=90 && score<=100){
            return 'A';
        }
        else if (score>=80 && score<=89) {
            return 'B';
        }
        else if (score>=70 && score<=79) {
            return 'C';
        }
        else if (score>=60 && score<=69) {
            return 'D';
        }
        else {
            return 'F';
        }
    }
    public static String[] findFailingStudents(String[] students, int[] scores) {
        ArrayList<String> failing = new ArrayList<>();

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < 60) {
                failing.add(students[i]);
            }
        }

        return failing.toArray(new String[0]);
    }


}
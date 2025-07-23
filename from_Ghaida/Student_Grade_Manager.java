import java.util.Arrays;
import java.util.ArrayList;
public class Student_Grade_Manager {

    public static void main(String[] args) {
        String[] students = {"Alice", "Bob", "Charlie", "Diana"};//initial name
        int[] scores = {95, 67, 45, 78};//initial scores for students

        //call reversedNames & letterGrades & failingStudentsInList in arrays
        reverseStudentNames(students);
        getLetterGrades(scores);
        String[] failingStudentsInList = findFailingStudents(students, scores);

        System.out.println("Failing Students: " + Arrays.toString(failingStudentsInList));// Find failing students and print it
    }

    public static String[] reverseStudentNames(String[] names) {
        String[] reversedNames = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            reversedNames[i] = new StringBuilder(names[i]).reverse().toString();
        }
        System.out.println("Reversed Names: " + Arrays.toString(reversedNames));// print reverse student names
        return reversedNames;
    }

    public static char[] getLetterGrades(int[] scores) {
        char[] letterGrades = new char[scores.length];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] <= 100 && scores[i] >= 90) {
                letterGrades[i] = 'A';
            }
            else if (scores[i] < 90 && scores[i] >= 80) {
                letterGrades[i] = 'B';
            }
            else if (scores[i] < 80 && scores[i] >= 70) {
                letterGrades[i] = 'C';
            }
            else if (scores[i] < 70 && scores[i] >= 60) {
                letterGrades[i] = 'D';
            }
            else {
                letterGrades[i] = 'F';
            }
        }
        System.out.println("Letter Grades: " + Arrays.toString(letterGrades));// print letter grades
        return letterGrades;
    }

    public static String[] findFailingStudents(String[] names, int[] scores) {
        ArrayList<String> failingStudents = new ArrayList<>();
        for(int i = 0; i< scores.length; i++){
            if(scores[i] < 60){
                failingStudents.add(names[i]);
            }
        }
        return failingStudents.toArray(new String[0]);
    }
}


import java.util.ArrayList;
import java.util.Arrays;
public class Task1 {

    public static void main(String[] args) {
            String[] names = {"Alice", "Bob", "Charlie", "Diana"};
            int[] scores = {95, 67, 45, 78};

            String[] failingStudentsList = findFailingStudents(names, scores);


            reverseEachName(names);
            System.out.println("Reversed names : " + Arrays.toString(names));

            char[] grades = new char[scores.length];
            for (int i = 0; i < scores.length; i++) {
                grades[i] = getLetterGrade(scores[i]);
            }
            System.out.println("Letter Grades: " + Arrays.toString(grades));
        System.out.println("Failing Students: " + Arrays.toString(failingStudentsList));
        }




    public static void reverseEachName(String[] names) {

        for (int i = 0; i < names.length; i++) {

            String reversedName = "";


            for (int j = names[i].length() - 1; j >= 0; j--) {
                reversedName += names[i].charAt(j);
            }

            names[i] = reversedName;
        }
    }


    public static char getLetterGrade(int score) {

        if (score >= 90 && score<=100) {
           return 'A';
        } else if (score >= 80 && score<=89) {
            return 'B';
        } else if (score >= 70 && score<=79) {
            return 'C';
        } else if (score >= 60 && score<=69) {
            return 'D';
        } else if ( score<60){
            return 'F';
        }
        else{
           return '!';}


}


    public static String[] findFailingStudents(String[] names, int[] scores) {
        ArrayList<String> failingStudentsList = new ArrayList<>();

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < 60) {
                failingStudentsList.add(names[i]);
            }
        }

        return failingStudentsList.toArray(new String[0]);
    }



}
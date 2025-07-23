import java.util.Arrays;

public class StudentGradeManager {
    public static void main(String[] args) {
        String[] students = {"Alice", "Bob", "Charlie", "Diana"};
       String [] reversedNames= reverseStudentNames(students);
        int[] scores = {95, 60, 45, 20};
        char[] grade = new char[scores.length];
        for(int i = 0; i < scores.length; i++){
            grade[i]=getLetterGrade(scores[i]);
        }
        String [] listofFailStudent= findFailingStudents(students,scores);

        System.out.println("Reversed Names: " + Arrays.toString(reversedNames));
        System.out.println("Letter Grades: " + Arrays.toString(grade));
        System.out.println("Failing Students: " + Arrays.toString(listofFailStudent));
    }

    public static String[] reverseStudentNames(String[] arrayString) {
        StringBuilder stringBuilder = new StringBuilder();
        int lastIndex=arrayString.length-1;
        int count=0;
//
        for (String names:  arrayString)
        {
            char[] charArray = names.toCharArray();
            int lengthOfName=names.length();
            int lastIndexOfName=lengthOfName-1;
            count++;
            for(int i=lastIndexOfName;i>-1;i--)
                stringBuilder.append(names.charAt(i));
            if(count<=lastIndex)
                stringBuilder.append(",");

        }


        return stringBuilder.toString().split(",");

    }
    public static char getLetterGrade(int score)
    {
        if(score>=90)
            return 'A';
        else if(score>=80)
            return 'B';
        else if(score>=70)
            return 'C';
        else if(score>=60)
            return 'D';
        else
            return 'F';

    }
    public static String[] findFailingStudents(String[] names, int[] scores)
    {
//        ArrayList<String> failStudents = new ArrayList<>();
        StringBuilder failStudents = new StringBuilder();
        for(int i = 0; i < scores.length; i++){
            if(getLetterGrade(scores[i])=='F')
            {

                failStudents.append(names[i]).append(",");

            }

        }
        return failStudents.toString().split(",");
    }
}




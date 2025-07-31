import java.util.ArrayList;

public class StudentGradeManager {
    public static String[] reverseStudentNames(String[] names){

        String [] namesReversed=new String[names.length];
        for(int i=0;i<names.length;i++){
            StringBuilder str=new StringBuilder(names[i]);
            namesReversed[i]= str.reverse().toString();
        }

        return namesReversed;
    }

    public static char getLetterGrade(int score){
        if(score<0 || score>100){
            System.out.println("Value is out of range");
        }
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

    public static String[] findFailingStudents(String[] names, int[] scores){
        ArrayList<String> fialingStudentsName=new ArrayList<>();

        for(int i=0;i<scores.length;i++){
            if(scores[i]<60) {
                fialingStudentsName.add(names[i]);
            }
        }
        return fialingStudentsName.toArray(new String[0]);
    }
}

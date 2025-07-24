import java.sql.SQLOutput;

public class GradeManager {


    public static String [] reverseNames(String[] names)
    {
        String [] reversed = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            reversed[i] = new StringBuilder(names[i]).reverse().toString();}
        return reversed;
    }


    public static char Grade(int score) {
        if (score >= 90) return 'A';
        else if (score >= 80) return 'B';
        else if (score >= 70) return 'C';
        else if (score >= 60) return 'D';
        else return 'F';
    }


    public static String[] failingStudents(String[] names, int[] scores) {
        int count = 0;

        for (int score : scores)
        {if (score < 60) count++;}

        String[] failing = new String[count];
        int in= 0;

        for (int i = 0; i < scores.length; i++)
        {if (scores[i] < 60)
        failing[in++] = names[i];}
        return failing;
    }


    public static void main(String[] args) {
        String[] students = {"Ahmed", "Yaser", "Abdullah", "Dana"};
        int[] scores = {93, 50, 45, 78}; //if student get 60, Pass

        String[] reversedNames = reverseNames(students);
        System.out.print("Reversed Names:[");
        for (String name : reversedNames) {System.out.print(name+", ");}
        System.out.println("]");


        System.out.print("Letter Grades:[");
        for (int score : scores) {System.out.print(Grade(score) + " ");}
        System.out.println("]");


        String[] failing = failingStudents(students, scores);
        System.out.print("Failing Students:[ ");
        for (String name : failing) {System.out.print(name+", ");}
        System.out.println("]");

    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String[] students = {"Alice", "Bob", "Charlie", "Diana"};
        int[] scores = {95, 67, 45, 78};

        StudentGradeManager value = new StudentGradeManager();
        String[] reverseStudentNames=value.reverseStudentNames(students);
        System.out.println("Reversed Names:" +Arrays.toString(reverseStudentNames));


        char [] valueGrade=new char [scores.length];
        for(int i=0;i<scores.length;i++){
            valueGrade[i]= value.getLetterGrade(scores[i]);

        }
        System.out.println("Letter Grades:"+Arrays.toString(valueGrade));

        String[] failingName=value.findFailingStudents(students, scores);
        System.out.println("Failing Students:"+Arrays.toString(failingName));



        String sentence= "Java is fun and Java is powerful";
        String text= "Java is fun and Java is powerful";
        String oldWord="Java";
        String newWord="Programming";

        TextProcessor result=new TextProcessor();
        System.out.println("Original Sentence: " +"Java is fun and Java is powerful");
        int r=result.countWords(sentence);
        System.out.println(("WordCount: "+ r));

        System.out.println(result.replaceWord( "After replecement: " + text, oldWord,newWord));
    }
}
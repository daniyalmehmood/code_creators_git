public class GradeManager {

    public static String[] reverseStudentNames(String[] names) {
        String[] reversed = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            reversed[i] = new StringBuilder(names[i]).reverse().toString();
        }
        return reversed;
    }


    public static char getLetterGrade(int score){

        if (score >= 90 && score <= 100) return 'A';
        else if (score >= 80) return 'B';
        else if (score >= 70) return 'C';
        else if (score >= 60) return 'D';
        else return 'F';
    }

    public static String[] findFailingStudents(String[] names, int[] scores){

        int f_Count = 0;
        for (int f : scores) {
            if (f < 60) f_Count++;
        }

        String[] failing = new String[f_Count];
        int index = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < 60) {
                failing[index++] = names[i];
            }
        }
        return failing;
    }

    public static void main(String[] args) {
        String[] students = {"Alharith", "Mohammed", "Haitham", "Nasser"};
        int[] scores = {98, 49, 67, 80};

        // reversed
        String[] reversed = reverseStudentNames(students);
        System.out.print("Reversed Names: [");

        for (int i = 0; i < reversed.length; i++) {
            System.out.print( reversed[i]);
            if (i < students.length - 1) System.out.print(", ");
        }
        System.out.println("]" );


        //Letter Grades
        System.out.print("Letter Grades: [");
        for (int score:scores) {
            System.out.print( getLetterGrade((score)) + ",");
        }
        System.out.println("]" );




        //Failing Students
        String[] failing = findFailingStudents(students, scores);
        System.out.print("Failing Students: [");
        for (int i = 0; i < failing.length; i++) {
            System.out.print(failing[i]);
            if (i < failing.length - 1) System.out.print(", ");
        }
        System.out.print("]" );
        System.out.println();
    }
    }



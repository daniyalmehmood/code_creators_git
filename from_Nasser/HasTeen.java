import java.lang.classfile.instruction.SwitchCase;

public class HasTeen {

    public static boolean hasTeen( int a,int b,int c){

       if (teen(a) || teen(b) || teen(c)) {
           return true;

       }
       else return false;



        }
    public static boolean teen(int n) {
        ;
        if (n >= 13 && n <= 19) {

            return true;

        }
        else return false;

    }

    public static void main(String[]args){

        System.out.println(hasTeen(12,10,11));
        System.out.println(hasTeen(13,10,11));
        System.out.println(hasTeen(13,14,15));
    }


    }


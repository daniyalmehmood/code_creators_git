public class NumberTenSum {


    public static boolean makes10(int a, int b) {

        if ((a == 10 && b != 10) || (a + b == 10)){

            return true;



        }else if ((a == 10 && b == 10) || (a != 10 && b == 10)){

            return true;



        }else return false ;
    }

    public static void main(String[] args) {
        System.out.println(makes10(10,10));
        System.out.println(makes10(1,10));
        System.out.println(makes10(1,1));
        System.out.println(makes10(1,9));


    }

}
// end of the code !
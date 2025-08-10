public class PosNegNumbers {

    public static boolean posNeg(int a, int b, boolean negative) {

        if (negative){

            return (a < 0 && b < 0);


        } else {

            return ( (a < 0 && b > 0) || (a > 0 && b < 0));
        }



    }

    public static void main(String[] args) {
        System.out.println(posNeg(-1,-3,true));
        System.out.println(posNeg(1,2,true));
        System.out.println(posNeg(-1,1,true));
        System.out.println(posNeg(-1,-2,false));
        System.out.println(posNeg(3,3,false));
    }



}

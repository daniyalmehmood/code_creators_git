public class DifferenceOfNumbers {


    public static int diff21(int n) {


        if (n <= 21){

            return Math.abs(n-21);

        }else return Math.abs(n-21)*2;




    }

    public static void main(String[] args) {
        System.out.println(diff21(21));
        System.out.println(diff21(11));
    }


}

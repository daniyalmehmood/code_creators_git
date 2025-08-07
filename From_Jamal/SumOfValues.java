public class SumOfValues {

    public static int sumDouble(int a, int b) {

        if (a == b){

            return (a+b)*2;


        }else return (a+b);

    }

    public static void main(String[] args) {

        System.out.println(sumDouble(1,2));
        System.out.println(sumDouble(5,5));
    }

}

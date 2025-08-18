public class NearTen {
    public static boolean isNearMultipleOfTen(int num) {

        return (num % 10 <= 2) || (num% 10 >= 8) ;
    }


    public static void main (String[] args){
        System.out.println(isNearMultipleOfTen(12));
        System.out.println(isNearMultipleOfTen(17));
        System.out.println(isNearMultipleOfTen(19));
    }
}
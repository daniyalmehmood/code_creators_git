public class MoreTwoZero {
    public static boolean isMoreThanMultipleOf20(int n) {
        return (n % 20 ==1 || n % 20 ==2);
    }

    public static void main (String[] args){
        System.out.println(isMoreThanMultipleOf20(20));
        System.out.println(isMoreThanMultipleOf20(21));
        System.out.println(isMoreThanMultipleOf20(22));
    }


}
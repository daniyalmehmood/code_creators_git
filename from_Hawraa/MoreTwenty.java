public class MoreTwenty {
    public static boolean isMoreTwenty(int n) {
        return n % 20 == 1 || n % 20 == 2;
    }
    public static void main(String[] args){
        System.out.println(isMoreTwenty(20));
        System.out.println(isMoreTwenty(21));
        System.out.println(isMoreTwenty(22));
    }
}

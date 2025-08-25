public class SixConditionChecker {
    public static boolean greatNumberSix(int a, int b) {
        if (a==6 || b==6 ||a+b==6 ||Math.abs(a-b)==6){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(greatNumberSix(4,6));
    }
}


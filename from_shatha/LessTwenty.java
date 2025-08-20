public class LessTwenty {
    public static boolean checkLessTwenty(int n) {
        return ((n+1) % 20 == 0 || (n+2) % 20 == 0) ;
    }


    public static void main (String[] args){
        System.out.println(checkLessTwenty(18));
        System.out.println(checkLessTwenty(19));
        System.out.println(checkLessTwenty(20));
    }
}

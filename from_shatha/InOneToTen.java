public class InOneToTen {
    public static boolean isInRange1To10(int n, boolean outsideMode) {
        if (outsideMode) {
            return (n<=1 || n>=10);
        } else {
            return (n>=1 && n<=10);
        }
    }
public static void main (String[] args){
    System.out.println(isInRange1To10(5, false));
    System.out.println(isInRange1To10(11, false));
    System.out.println(isInRange1To10(11, true));
}
}

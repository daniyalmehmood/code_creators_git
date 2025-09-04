public class SquirrelPlayChecker {
    public static void main(String[] args) {
        System.out.println(canSquirrelsPlay(70, false));// → true
        System.out.println(canSquirrelsPlay(95, false));// → false
        System.out.println(canSquirrelsPlay(95, true));// → true
    }
    public static boolean canSquirrelsPlay(int temp, boolean isSummer) {
        if(temp >= 60 && temp <= 90){
            return true;
        }
        else if (isSummer && temp <= 100 && temp >= 60) {
            return true;
        }
        return false;
    }
}

public class SpecialNumberChecker {
    public static boolean specialElevenChecker(int n) {
        if (n%11==0 || n%11==1){return true;} // check if the n is a multiple of 11 or if it is one more than a multiple of 11
        return false;
    }
    public static void main(String[] args) {
        System.out.println(specialElevenChecker(22));
    }
}

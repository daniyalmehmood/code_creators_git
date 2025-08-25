public class SquirrelPlayChecker {
    public  static boolean isSquirrelPlaying(int temp, boolean isSummer) {
        if (temp>=60 && temp<=90 && !isSummer){
            return true;
        }
        if (temp>=60 && temp<=100 && isSummer){
            return true;
        }
        return false;
    }
    public  static void main(String[] args) {
        System.out.println(isSquirrelPlaying(70,false));
    }
}

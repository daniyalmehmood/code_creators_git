public class SquirrelPlayRules {
    public static boolean isSquirrelPlaying(int temp, boolean isSummer) {
        if (isSummer) {
            return temp >= 60 && temp <= 100;
        } else {
            return temp >= 60 && temp <= 90;
        }
    }

    public static void main(String[] args) {

        System.out.println(isSquirrelPlaying(70, false));
        System.out.println(isSquirrelPlaying(95, false));
        System.out.println(isSquirrelPlaying(70, true));
    }
}

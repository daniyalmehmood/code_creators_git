public class SquirrelPlay {
    public static boolean isSquirrelPlay(int temp, boolean isSummer) {
        return (temp >= 60 && temp <= 90 || (isSummer && temp >= 60 && temp <= 100));
    }

    public static void main(String[] args) {
        System.out.println(isSquirrelPlay(70, false));
        System.out.println(isSquirrelPlay(95, false));
        System.out.println(isSquirrelPlay(95, true));
    }
}

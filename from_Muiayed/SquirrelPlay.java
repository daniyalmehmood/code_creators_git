public class SquirrelPlay {

    public static boolean squirrelPlay(int temp, boolean isSummer) {
        int upper = isSummer ? 100 : 90;
        return temp >= 60 && temp <= upper;
    }

    public static void main(String[] args) {
        System.out.println(squirrelPlay(70, false)); // true
        System.out.println(squirrelPlay(95, false)); // false
        System.out.println(squirrelPlay(95, true));  // true
    }
}
public class SquirrelPlay {
    public static boolean isPlaying(int temp, boolean isSummer) {
        int upperLimit = isSummer ? 100 : 90;
        return temp >= 60 && temp <= upperLimit;
    }
    public static void main(String[] args) {
        System.out.println(isPlaying(70, false)); // true
        System.out.println(isPlaying(95, false)); // false
        System.out.println(isPlaying(95, true));  // true
    }
}
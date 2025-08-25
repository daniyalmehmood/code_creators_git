public class SquirrelActivity {
    public static boolean isSquirrelPlaying(int temp, boolean isSummer) {
        // If it's not summer and temp is between 60 and 90 inclusive, squirrels play (true)
        if (!isSummer && temp >= 60 && temp <= 90) {
            return true;
        } else if (temp >= 60 && isSummer) {
            return true;
        }

        // squirrels do not play (false)
        return false;
    }
}
public class StringEndingTest {
    public static boolean endsWithLy(String str) {
        // Null check to prevent NullPointerException
        if (str == null) {
            return false;
        }

        // Use String's built-in endsWith method directly
        return str.endsWith("ly");
    }
}

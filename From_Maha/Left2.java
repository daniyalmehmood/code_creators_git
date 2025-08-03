public class StringLeftRotator {

   // Moves the first 2 characters of the string to the end.

    public String rotateLeft2(String str) {
        if (str.length() >= 2) {
            return str.substring(2) + str.substring(0, 2);
        }

        return str;
    }
}

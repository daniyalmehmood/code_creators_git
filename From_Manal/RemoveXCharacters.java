public class RemoveXCharacters {

    public static String noX(String str) {
        //empty string
        if (str.length() == 0) {
            return "";
        }

        char firstChar = str.charAt(0);

        if (firstChar == 'x') {
            // Skip 'x' and continue with the rest
            return noX(str.substring(1));
        } else {
            // Keep the char and continue with the rest
            return firstChar + noX(str.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println(noX("xaxb"));
        System.out.println(noX("abc"));
        System.out.println(noX("xx"));
    }
}
public class DeFrontProcessor {
    
    public static String processFront(String str) {
        // Get the first and second characters of the string
        char first = str.charAt(0);
        char second = str.charAt(1);

        // If first character is 'a' and second is 'b', return the original string
        if (str.charAt(0) == 'a' && str.charAt(1) == 'b') {
            return str;
        }

        // If first character is 'a', keep it and remove the second character
        if (str.charAt(0) == 'a') {
            return first + str.substring(2);
        }

        // If second character is 'b', remove the first character and keep the rest
        if (str.charAt(1) == 'b') {
            return str.substring(1);
        }

        // If neither character is 'a' or 'b', remove both
        return str.substring(2);
    }

}

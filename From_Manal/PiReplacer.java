//Recursion-1 > changePi
public class PiReplacer {

    // Method to replace all "pi" with "3.14" recursively
    public static String replacePi(String input) {
        // if string has less than 2 characters, it can't contain "pi"
        if (input.length() < 2) {
            return input;
        }

        // If the first two characters are "pi", replace them with "3.14"
        if (input.substring(0, 2).equals("pi")) {
            return "3.14" + replacePi(input.substring(2));
        } else {
            // Otherwise, keep the first character and recurse on the rest
            return input.charAt(0) + replacePi(input.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println(replacePi("xpix"));
        System.out.println(replacePi("pipi"));
        System.out.println(replacePi("pip"));
    }
}
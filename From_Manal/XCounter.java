//Recursion-1 > countX
public class XCounter {

    // Method to count how many lowercase 'x' characters appear in a string
    public static int countLowercaseX(String text) {
        // empty string → 0
        if (text.length() == 0) {
            return 0;
        }

        // Check the first character
        if (text.charAt(0) == 'x') {
            return 1 + countLowercaseX(text.substring(1));
        } else {
            return countLowercaseX(text.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println(countLowercaseX("xxhixx"));
        System.out.println(countLowercaseX("xhixhix"));
        System.out.println(countLowercaseX("hi"));
    }
}
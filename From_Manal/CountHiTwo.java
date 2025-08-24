//Recursion-1 > countHi2
public class CountHiTwo {

    // Recursive method to count "hi" not preceded by 'x'
    public static int countHiNotAfterX(String text) {
        // if string has fewer than 2 characters, no "hi" can appear
        if (text.length() < 2) {
            return 0;
        }

        // Check for "hi" at the start
        if (text.startsWith("hi")) {
            return 1 + countHiNotAfterX(text.substring(2));
        }

        // Check for "hi" preceded by 'x'
        if (text.length() >= 3 && text.charAt(0) == 'x' && text.substring(1, 3).equals("hi")) {
            return countHiNotAfterX(text.substring(3)); // skip 'x' + "hi"
        }

        return countHiNotAfterX(text.substring(1));
    }


    public static void main(String[] args) {
        System.out.println(countHiNotAfterX("ahixhi"));
        System.out.println(countHiNotAfterX("ahibhi"));
        System.out.println(countHiNotAfterX("xhixhi"));
    }
}
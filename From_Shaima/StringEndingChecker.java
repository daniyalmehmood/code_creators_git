public class StringEndingChecker {
    public static boolean isEndingMatchIgnoreCase(String a, String b) {
        if (a.length() <= b.length()) { // check if 'a' is shorter than 'b'
            if (b.toLowerCase().endsWith(a.toLowerCase())) { // make both string lower case , and check if the last elements in  'b' is same as 'a'
                return true;
            }
        }
        if (b.length() <= a.length()) { // check if 'b' is shorter than 'a'
            if (a.toLowerCase().endsWith(b.toLowerCase())) { // make both string lower case , and check if the last elements in 'a' same as 'b'
                return true;
            }
        }
        return false; // otherwise return false
    }
    public static void main(String[] args) {
        System.out.println(isEndingMatchIgnoreCase("Hiabc", "abc"));
    }

}

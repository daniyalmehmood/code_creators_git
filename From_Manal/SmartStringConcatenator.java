public class SmartStringConcatenator {

    public static String concatenateWithoutDuplicateChar(String a, String b) {
        if (a.length() == 0) {
            return b;
        }
        if (b.length() ==0) {
            return a;
        }
 // Last char of 'first' == first char of 'second': avoid duplicate
        if (a.charAt(a.length() - 1) == b.charAt(0)) {
            return a +b.substring(1);
        }
        else {
            return a + b;
        }

    }
    public static void main(String[] args) {
        System.out.println(concatenateWithoutDuplicateChar("abc", "cat"));
        System.out.println(concatenateWithoutDuplicateChar("dog", "cat"));
        System.out.println(concatenateWithoutDuplicateChar("abc", "") );
    }
    }

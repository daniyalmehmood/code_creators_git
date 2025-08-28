public class notReplace {

    public static void main(String[] args) {
        // Test cases
        System.out.println(notReplace("is test"));
        System.out.println(notReplace("is-is"));
        System.out.println(notReplace("This is right"));
        System.out.println(notReplace("isthis"));
        System.out.println(notReplace("is 123 is"));
    }

    public static String notReplace(String str) {
        StringBuilder result = new StringBuilder();
        int i = 0;

        while (i < str.length()) {
            // Check if "is" starts at position i
            if (i + 1 < str.length() &&
                    str.charAt(i) == 'i' &&
                    str.charAt(i + 1) == 's' &&
                    (i == 0 || !Character.isLetter(str.charAt(i - 1))) &&
                    (i + 2 == str.length() || !Character.isLetter(str.charAt(i + 2)))) {

                result.append("is not");
                i += 2; // Skip past "is"
            } else {
                result.append(str.charAt(i));
                i++;
            }
        }

        return result.toString();
    }
}
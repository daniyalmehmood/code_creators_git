public class stringMatch {
    public static int stringMatch(String a, String b) {
        int count = 0;

        for (int i = 0; i < a.length() - 1 && i < b.length() - 1; i++) {
            if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(stringMatch("xxcaazz", "xxbaaz"));
        System.out.println(stringMatch("abc", "abc"));
        System.out.println(stringMatch("abc", "axc"));
    }
}
public class BobChecker {
    public static boolean bobChecker(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.length() > i + 2 && str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(bobChecker("abcbob"));
        System.out.println(bobChecker("b9b"));
        System.out.println(bobChecker("bac"));
        System.out.println(bobChecker("bbb"));
        System.out.println(bobChecker("bbc"));
    }
}
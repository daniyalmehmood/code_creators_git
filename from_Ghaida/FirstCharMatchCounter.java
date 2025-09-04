public class FirstCharMatchCounter {//AP-1 > matchUp
    public static void main(String[] args) {
        System.out.println(countFirstCharMatches(new String[]{"aa", "bb", "cc"}, new String[]{"aaa", "xx", "bb"})); // → 1
        System.out.println(countFirstCharMatches(new String[]{"aa", "bb", "cc"}, new String[]{"aaa", "b", "bb"}));  // → 2
        System.out.println(countFirstCharMatches(new String[]{"aa", "bb", "cc"}, new String[]{"", "", "ccc"}));    // → 1
    }
    public static int countFirstCharMatches(String[] a, String[] b) {
        int countMatch = 0;
        for (int i = 0; i < a.length && i< b.length; i++) {
            if (!a[i].isEmpty() && !b[i].isEmpty() && a[i].charAt(0) == b[i].charAt(0)) {
                countMatch++;
            }
        }
        return countMatch;
    }
}
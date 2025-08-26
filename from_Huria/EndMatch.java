public class EndMatch {
    public static boolean endMatch(String a, String b) {
        String aLowerCase = a.toLowerCase();
        String bLowerCase = b.toLowerCase();
        if (a.length() <= b.length())//2,4
        {

            String endB = bLowerCase.substring(b.length() - a.length());
            return aLowerCase.equals(endB);

        } else {
            String endA = aLowerCase.substring(a.length() - b.length());
            return bLowerCase.equals(endA.toLowerCase());

        }

    }

    public static void main(String[] args) {

        System.out.println(endMatch("Hiabc", "abc"));
        System.out.println(endMatch("AbC", "HiaBc"));
        System.out.println(endMatch("Hiabc", "abcd"));
        System.out.println(endMatch("Z", "12xz"));
        System.out.println(endMatch("yZ", "12xz"));
        System.out.println(endMatch("ab", "ab12"));
        System.out.println(endMatch("ab", "12ab"));
    }
}

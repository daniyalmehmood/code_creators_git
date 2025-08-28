public class SameStarChar {
    public boolean sameStarChar(String str) {
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*' &&
                    str.charAt(i - 1) != str.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        SameStarChar s = new SameStarChar();
        System.out.println(s.sameStarChar("xy*yzz"));
        System.out.println(s.sameStarChar("xy*zzz"));
        System.out.println(s.sameStarChar("*xa*az"));
    }
}
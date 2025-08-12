public class SameStarChar {
    public static boolean starsHaveEqualSides(String str) {
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.substring(i, i + 1).equals("*")) {
                if (str.charAt(i - 1) != str.charAt(i + 1)) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(starsHaveEqualSides("xy*yzz"));
        System.out.println(starsHaveEqualSides("xy*zzz"));
        System.out.println(starsHaveEqualSides("*xa*az"));
    }
}

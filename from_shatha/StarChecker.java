public class StarChecker {
    public static boolean hasMatchingStarSides(String str) {
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*') {
                if (str.charAt(i - 1) != str.charAt(i + 1)) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main (String[]args){
        System.out.println(hasMatchingStarSides("xy*yzz"));
        System.out.println(hasMatchingStarSides("xy*zzz") );
        System.out.println(hasMatchingStarSides("*xa*az"));
    }
}

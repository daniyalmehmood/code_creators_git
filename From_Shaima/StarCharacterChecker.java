public class StarCharacterChecker {
    public static boolean hasSameNeighboringCharsAroundStar(String str) {
        for (int i = 1; i < str.length() - 1; i++) { // use a for loop to go through the str
            if (str.charAt(i) == '*') { // catch the '*' in the 'str'
                if (str.charAt(i - 1) != str.charAt(i + 1)) { // check chars both immediately before and after the star
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(hasSameNeighboringCharsAroundStar("xy*yzz"));
        System.out.println(hasSameNeighboringCharsAroundStar("xy*zzz"));
        System.out.println(hasSameNeighboringCharsAroundStar("*xa*az"));
        System.out.println(hasSameNeighboringCharsAroundStar("*xa*bz"));
        System.out.println(hasSameNeighboringCharsAroundStar("*xa*a*b"));
    }
}


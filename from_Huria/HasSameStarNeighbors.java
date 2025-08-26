public class HasSameStarNeighbors {

    public static boolean hasSameStarNeighbors(String str) {
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*') {
                if (str.charAt(i - 1) != str.charAt(i + 1)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(hasSameStarNeighbors("xy*yzz"));
        System.out.println(hasSameStarNeighbors("xy*zzz"));
        System.out.println(hasSameStarNeighbors("*xa*az"));
        System.out.println(hasSameStarNeighbors("*xa*bz"));
        System.out.println(hasSameStarNeighbors("*xa*a*b"));
    }
}











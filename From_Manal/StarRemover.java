public class StarRemover {
    // Returns a version of str where '*' and chars immediately left and right are removed
    public static String removeStarsAndNeighbors(String str) {
        StringBuilder result = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == '*') continue;
            if (i > 0 && str.charAt(i - 1) == '*') continue;
            if (i < length - 1 && str.charAt(i + 1) == '*') continue;
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeStarsAndNeighbors("ab*cd"));
        System.out.println(removeStarsAndNeighbors("ab**cd"));
        System.out.println(removeStarsAndNeighbors("sm*eilly"));
    }
}
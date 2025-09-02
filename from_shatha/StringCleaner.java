public class StringCleaner {
    public static String removeStarsAndNeighbors(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);

            boolean isStar = current == '*';
            boolean leftStar = (i > 0 && str.charAt(i - 1) == '*');
            boolean rightStar = (i < str.length() - 1 && str.charAt(i + 1) == '*');

            if (!isStar && !leftStar && !rightStar) {
                result.append(current);
            }
        }

        return result.toString();
    }
    public static void main (String[]args){
        System.out.println(removeStarsAndNeighbors("ab*cd"));
        System.out.println(removeStarsAndNeighbors("ab**cd"));
        System.out.println(removeStarsAndNeighbors("sm*eilly"));
    }
}
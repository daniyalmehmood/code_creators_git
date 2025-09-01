public class repeatFront {
    public static String buildDecreasingPrefixes(String str, int n) {
        StringBuilder result = new StringBuilder();

        for (int i = n; i > 0; i--) {
            result.append(str.substring(0, i));
        }

        return result.toString();
    }
    public static void main (String[]args){
        System.out.println(buildDecreasingPrefixes("Chocolate", 4));
        System.out.println(buildDecreasingPrefixes("Chocolate", 3));
        System.out.println(buildDecreasingPrefixes("Ice Cream", 2));
    }
}

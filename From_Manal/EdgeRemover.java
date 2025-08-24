public class EdgeRemover {
    // Removes the first and last characters of a string
    public static String stripEnds(String str) {
        // Returns everything except the first and last characters
        return str.substring(1, str.length()-1);

    }
    public static void main(String[] args) {
        System.out.println(stripEnds("Hello"));
        System.out.println(stripEnds("java") );
        System.out.println(stripEnds("coding"));
    }

}

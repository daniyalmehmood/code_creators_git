public class FirstHalf {
    public static String firstHalf(String str) {
        int halflength = str.length()/2;
        return str.substring(0, halflength);

    }
    public static void main(String[] args) {
        System.out.println(firstHalf("WooHoo"));
        System.out.println(firstHalf("HelloThere") );
        System.out.println(firstHalf("abcdef") );
    }

}

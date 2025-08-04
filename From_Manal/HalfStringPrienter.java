public class HalfStringPrienter {
    public static String getFirstHalf(String str) {
        int halflength = str.length()/2;
        //return the substring from index 0 to half length
        return str.substring(0, halflength);

    }
    public static void main(String[] args) {
        System.out.println(getFirstHalf("WooHoo"));
        System.out.println(getFirstHalf("HelloThere") );
        System.out.println(getFirstHalf("abcdef") );
    }
}

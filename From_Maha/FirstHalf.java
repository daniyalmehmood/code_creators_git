public class FirstHalf {
    public static void main(String[] args) {
        FirstHalf obj = new FirstHalf();

        System.out.println(obj.firstHalf("WooHoo"));  // "Woo"
        System.out.println(obj.firstHalf("HelloThere")); // "Hello"
        System.out.println(obj.firstHalf("abcdef"));  // "abc"
    }

    public String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }


}
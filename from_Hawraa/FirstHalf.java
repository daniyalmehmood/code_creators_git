public class FirstHalf {
    public static String firstHalf(String str) {
        String newStr = "";
        newStr = str.substring(0, str.length() / 2);
        return newStr;
    }

    public static void main(String[] args){
        System.out.println(firstHalf("WooHoo"));
        System.out.println(firstHalf("HelloThere"));
        System.out.println(firstHalf("abcdef"));
    }
}

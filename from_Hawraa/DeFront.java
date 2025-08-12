public class DeFront {
    public static String preserveABPrefix(String str) {
        String newStr = "";
        if (str.length() >= 1) {
            if (str.charAt(0) == 'a') {
                newStr += 'a';
            }
        }

        if (str.length() >= 2) {
            if (str.charAt(1) == 'b') {
                newStr += 'b';
            }
        }

        if (str.length() > 2) {
            newStr += str.substring(2);
        }

        return newStr;
    }
    public static void main(String[] args){
        System.out.println(preserveABPrefix("Hello"));
        System.out.println(preserveABPrefix("java"));
        System.out.println(preserveABPrefix("away"));
    }
}

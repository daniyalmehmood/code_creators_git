public class DeFront {
    public static void main(String[] args) {
        System.out.println(deFront("Hello")); //"llo"
        System.out.println(deFront("java")); //"va"
        System.out.println(deFront("away")); //"aay"
    }

    public static String deFront(String str) {
        StringBuilder newString = new StringBuilder();
        if (str.length() > 0 && str.charAt(0) == 'a') {
            newString.append('a');
        }
        if (str.length() > 1 && str.charAt(1) == 'b') {
            newString.append('b');
        }
        if (str.length() > 2) {
            newString.append(str.substring(2));
        }
        return newString.toString();
    }
}
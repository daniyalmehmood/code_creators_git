public class PreserveABAtFront {
    public static String removeFrontExceptAB(String str) {
        String result = "";
        if (str.length() >=1 && str.substring(0, 1).equals("a")) {
            result += str.substring(0, 1);// Keep 'a' at position 0
        }
        if (str.length() >=2 && str.substring(1, 2).equals("b")) {
            result += str.substring(1, 2);// Keep 'b' at position 1
        }
        if (str.length() > 2) {
            result += str.substring(2);// Add the rest of the string from index 2
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(deFront("Hello"));
        System.out.println(deFront("java") );
        System.out.println(deFront("away"));
    }

}

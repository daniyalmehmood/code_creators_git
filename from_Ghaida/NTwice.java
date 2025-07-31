public class NTwice {
    public static void main(String[] args){
        System.out.println(nTwice("Hello", 2)); // → "Helo"
        System.out.println(nTwice("Chocolate", 3));// → "Choate"
        System.out.println(nTwice("Chocolate", 1)); // → "Ce
    }
    public static String nTwice(String str, int n) {
        if(str.length() > 2){
            return str.substring(0, n) + str.substring(str.length() - n);
        }
        return str;
    }
}

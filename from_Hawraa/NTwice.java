public class NTwice {
    public static String firstAndLastN(String str, int n) {
        String firstChar = str.substring(0, n);
        String lastChar = str.substring(str.length() - n);
        return firstChar + lastChar;
    }

    public static void main(String[] args){
        System.out.println(firstAndLastN("Hello", 2));
        System.out.println(firstAndLastN("Chocolate", 3));
        System.out.println(firstAndLastN("Chocolate", 1));
    }
}

public class nTwice {
    public static String nTwice(String str, int n) {
        String firstCha = str.substring(0, n);
        String lastCha = str.substring(str.length() - n);
        return firstCha + lastCha;
    }

    public static void main(String[] args){
        System.out.println(nTwice("Hello", 2));
        System.out.println(nTwice("Chocolate", 3));
        System.out.println(nTwice("Chocolate", 1));
    }
}

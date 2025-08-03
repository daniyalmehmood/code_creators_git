public class MinCat {
    public static String minCat(String a, String b) {

        int len = Math.min(a.length(), b.length());
        String first = a.substring(a.length() - len);
        String last = b.substring(b.length() - len);

        return first + last;
    }

    public static void main(String[] args) {
        System.out.println(minCat("Hello", "Hi"));
        System.out.println(minCat("Hello", "java"));
        System.out.println(minCat("java", "Hello"));
    }
}
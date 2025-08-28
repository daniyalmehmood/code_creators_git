public class atFirst {
    public static String atFirst(String str) {
        return (str + "@@").substring(0, 2);
    }
    public static void main(String[] args) {
        System.out.println(atFirst("hello"));
        System.out.println(atFirst("hi"));
        System.out.println(atFirst("h"));
        System.out.println(atFirst(""));
    }
}
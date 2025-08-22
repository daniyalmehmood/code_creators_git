public class lastTwo {
    public static String lastTwo(String str) {
        if (str.length() < 2) return str;
        return str.substring(0, str.length() - 2)
                + str.charAt(str.length() - 1)
                + str.charAt(str.length() - 2);
    }
    public static void main(String[] args) {
        System.out.println(lastTwo("coding"));
        System.out.println(lastTwo("cat"));
        System.out.println(lastTwo("ab"));
    }
}
public class TwoChar {
    public static String twoChar(String str, int index) {
        if (index >= 0 && index <= str.length() - 2) {
            return str.substring(index, index + 2);
        } else {
            return str.substring(0, 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(twoChar("java", 0));
        System.out.println(twoChar("java", 2));
        System.out.println(twoChar("java", 3));
    }
}
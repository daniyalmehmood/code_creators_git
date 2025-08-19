public class FrontRepeater {
    public static String repeatFront(String str, int n) {
        StringBuilder repeatedVal = new StringBuilder();
        if (!str.isEmpty() && n >= 0) if (str.length() > 2) {
            for (int i = n; i > 0; i--) {
                repeatedVal.append(str, 0, i);
            }

        }
        return repeatedVal.toString();
    }

    public static void main(String[] args) {

        System.out.println(repeatFront("Chocolate", 4));
        System.out.println(repeatFront("Chocolate", 3));
        System.out.println(repeatFront("Ice Cream", 2));
        System.out.println(repeatFront("Java", 1));
        System.out.println(repeatFront("", 0));
    }
}
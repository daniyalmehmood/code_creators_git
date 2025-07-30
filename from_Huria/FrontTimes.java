public class FrontTimes {
    public static String frontTimes(String str, int n) {
        StringBuilder front = new StringBuilder();
        StringBuilder repeatedVal = new StringBuilder();
        if (!str.isEmpty() && n >= 0) {
            if (str.length() > 2) {
                front.append(str, 0, 3);
                for (int i = 0; i < n; i++) {
                    repeatedVal.append(front);
                }
            } else {
                front.append(str, 0, str.length());
                for (int i = 0; i < n; i++) {
                    repeatedVal.append(front);
                }
            }
        }
        return repeatedVal.toString();
    }

    public static void main(String[] args) {
        System.out.println(frontTimes("Chocolate", 2));
        System.out.println(frontTimes("Chocolate", 3));
        System.out.println(frontTimes("Abc", 3));
        System.out.println(frontTimes("A", 4));
        System.out.println(frontTimes("", 4));
        System.out.println(frontTimes("ABC", 0));
    }
}
public class DoubleXCounter {
    public static int doubleXCounter(String str) {
        int countXX = 0;
        for (int i = 0; i < str.length() - 1; i++) {

            if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x') {
                countXX++;
            }
        }
        return countXX;
    }

    public static void main(String[] args) {
        System.out.println(doubleXCounter("Hello"));
        System.out.println(doubleXCounter("Hexxo"));
        System.out.println(doubleXCounter("abc"));
        System.out.println(doubleXCounter("Kittensxxx"));
        System.out.println(doubleXCounter("abcxx"));
        System.out.println(doubleXCounter("xxx"));
        System.out.println(doubleXCounter("xxxx"));
    }
}


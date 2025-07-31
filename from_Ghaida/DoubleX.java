public class DoubleX {
    public static void main(String[] args) {
        System.out.println(doubleX("axxbb")); //true
        System.out.println(doubleX("axaxax")); //false
        System.out.println(doubleX("xxxxx")); //true
    }

    public static boolean doubleX(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'x') {
                return str.charAt(i + 1) == 'x';
            }
        }
        return false;
    }
}

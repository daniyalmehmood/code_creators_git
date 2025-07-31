public class StringTimes {
    public static void main(String[] args) {
        System.out.println(stringTimes("Hi", 2)); //"HiHi"
        System.out.println(stringTimes("Hi", 3)); //"HiHiHi"
        System.out.println(stringTimes("Hi", 1)); //"Hi"

    }

    public static String stringTimes(String str, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(str);
        }
        return result.toString();
    }
}

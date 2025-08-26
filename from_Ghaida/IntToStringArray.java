public class IntToStringArray {//Array-2 > fizzArray2
    public static void main(String[] args) {
        System.out.println(createStringArray(4)); // →  ["0", "1", "2", "3"]
        System.out.println(createStringArray(10)); // →  ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]
        System.out.println(createStringArray(2)); // → ["0", "1"]
    }
    public static String[] createStringArray(int n) {
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = String.valueOf(i);
        }
        return result;
    }
}
public class StringRepeater {
    //extract the first 3 characters or less if the input length less than 3
    public static String repeatFront(String str, int n) {
        String front = str.substring(0, Math.min(str.length(), 3));
        String result = "";
        for (int i = 0; i < n; i++) {
            result = result + front;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(repeatFront("Chocolate", 2));
        System.out.println(repeatFront("Chocolate", 3));
        System.out.println(repeatFront("Abc", 3));
    }
}
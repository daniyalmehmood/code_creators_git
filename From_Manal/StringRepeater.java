public class StringRepeater {
//Repeat the Entire String N times
    public static String repeatStringNTimes(String str, int n) {

        String r = "";
        for (int i = 0; i < n; i++) {
            r = r + str;
        }

        return r;
    }

    public static void main(String[] args) {
        System.out.println(repeatStringNTimes("Hi", 2));
        System.out.println(repeatStringNTimes("Hi", 3));
        System.out.println(repeatStringNTimes("Hi", 1));
    }
}
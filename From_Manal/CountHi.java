public class CountHi {

    public static int countHi(String str) {
        // if string length is less than 2, it can't contain "hi"
        if (str.length() < 2) {
            return 0;
        }

        // Check if first two chars are "hi"
        if (str.substring(0, 2).equals("hi")) {
            return 1 + countHi(str.substring(2));
        } else {
            return countHi(str.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println(countHi("xxhixx"));
        System.out.println(countHi("xhixhix"));
        System.out.println(countHi("hi"));

    }
}
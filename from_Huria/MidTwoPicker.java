public class MidTwoPicker {
    public static String midTwoPicker(String str) {
        if (str.length() <= 1) {
            return "";
        }
        int midLengthValue = str.length() / 2;

        return str.substring(midLengthValue - 1, midLengthValue + 1);
    }

    public static void main(String[] args) {
        System.out.println(midTwoPicker("string"));
        System.out.println(midTwoPicker("code"));
        System.out.println(midTwoPicker("Practice"));
        System.out.println(midTwoPicker("ab"));
        System.out.println(midTwoPicker("0123456789"));
        System.out.println(midTwoPicker("a"));
        System.out.println(midTwoPicker(""));
    }
}


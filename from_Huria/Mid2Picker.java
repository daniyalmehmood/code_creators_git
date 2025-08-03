public class Mid2Picker {
    public static String mid2Picker(String str) {
        if (str.length() <= 1) {
            return "";
        }
        int len = str.length() / 2;
        String middTwo = str.substring(len - 1, len + 1);

        return middTwo;
    }

    public static void main(String[] args) {
        System.out.println(mid2Picker("string"));
        System.out.println(mid2Picker("code"));
        System.out.println(mid2Picker("Practice"));
        System.out.println(mid2Picker("ab"));
        System.out.println(mid2Picker("0123456789"));
        System.out.println(mid2Picker("a"));
        System.out.println(mid2Picker(""));
    }
}


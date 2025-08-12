public class WithoutTwo {
    public static String removeMatchingStartEnd(String str) {
        if (str.length() < 2) {
            return str;
        }

        String firstChar = str.substring(0, 2);
        String lastChar = str.substring(str.length() - 2);
        if (str.length() >= 2 && firstChar.equals(lastChar)) {
            return str.substring(2, str.length());
        }
        return str;
    }

    public static void main(String[] args){
        System.out.println(removeMatchingStartEnd("HelloHe"));
        System.out.println(removeMatchingStartEnd("HelloHi"));
        System.out.println(removeMatchingStartEnd("Hi"));
    }
}

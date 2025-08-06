public class MixString {
    public static String mixString(String a, String b) {
        StringBuilder result = new StringBuilder();
        int maxLength = a.length();
        if (b.length() > maxLength) {
            maxLength = b.length();
        }
        for (int i = 0; i < maxLength; i++) {
            if (a.length() > i) {
                result.append(a.charAt(i));
            }
            if (b.length() > i){
                result.append(b.charAt(i));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(mixString("abc", "xyz"));
        System.out.println(mixString("Hi", "There"));
        System.out.println(mixString("xxxx", "There"));
    }
}

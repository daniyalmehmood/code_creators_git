public class StringMixer {
    public static String mixString(String a, String b) {
        int i = 0;
        int j = 0;
        StringBuilder result = new StringBuilder();

        if (a.isEmpty() && b.isEmpty()) return "";
        else if (a.isEmpty()) return b;
        else if (b.isEmpty()) return a;

        else if (a.length() < b.length()) {
            for (i = 0; i < a.length(); i++) {
                for (j = i; j < i + 1; j++) {
                    result.append(a.charAt(i));
                    result.append(b.charAt(j));
                }

            }
            result.append(b.substring(j));
        } else {
            for (i = 0; i < b.length(); i++) {
                for (j = i; j < i + 1; j++) {
                    result.append(a.charAt(i));
                    result.append(b.charAt(j));
                }
            }
            result.append(a.substring(j));
        }


        return result.toString();
    }

    public static void main(String[] args) {

        System.out.println(mixString("abc", "xyz"));
        System.out.println(mixString("Hi", "There"));
        System.out.println(mixString("Abc", ""));
        System.out.println(mixString("ax", "b"));
        System.out.println(mixString("a", "bx"));
        System.out.println(mixString("", ""));
    }
}
public class StringMixer {
    public static String mixStrings(String a, String b) {
        StringBuilder result = new StringBuilder();
        int minLen = Math.min(a.length(), b.length());

        for (int i = 0; i < minLen; i++) {
            result.append(a.charAt(i));
            result.append(b.charAt(i));
        }

        if (a.length() > minLen) {
            result.append(a.substring(minLen));
        }
        if (b.length() > minLen) {
            result.append(b.substring(minLen));
        }

        return result.toString();
    }

        public static void main (String[]args){
            System.out.println(mixStrings("abc", "xyz"));
            System.out.println(mixStrings("Hi", "There"));
            System.out.println(mixStrings("xxxx", "There"));
        }
    }

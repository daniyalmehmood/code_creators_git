public class StringMixer {
    public static String mixString(String a, String b) {
        StringBuilder result = new StringBuilder();
        int minLen = Math.min(a.length(), b.length());

        // Mix characters from both strings up to the length of the shorter string
        for (int i = 0; i < minLen; i++) {
            result.append(a.charAt(i));
            result.append(b.charAt(i));
        }
        if (a.length() > minLen) {
            result.append(a.substring(minLen));
        } else if (b.length() > minLen) {
            result.append(b.substring(minLen));
        }

        return result.toString();
    }
    
    public static void main(String[] args) {
        System.out.println(mixString("abc", "xyz"));      
        System.out.println(mixString("Hi", "There"));     
        System.out.println(mixString("xxxx", "There"));   
    }
}
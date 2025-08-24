public class PairsReturn {
    public static String altPairs(String str) {

        if (str.length() <= 2) {
            return str;
        }
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < str.length(); i += 4) { // Go through the String At each character !
            word.append(str.charAt(i));
            if (i + 1 < str.length()) {
                word.append(str.charAt(i + 1));
            }

        }
        return word.toString();


    }

    public static void main(String[] args) {
        System.out.println(altPairs("Kitten"));
        System.out.println(altPairs("ya"));
        System.out.println(altPairs("y"));
        System.out.println(altPairs(""));
    }
}

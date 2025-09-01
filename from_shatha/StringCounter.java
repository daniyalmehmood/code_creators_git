public class StringCounter {
    public static int countCodeLikePatterns(String str) {
        int count = 0;

        for (int i = 0; i < str.length() - 3; i++) {
            if (str.charAt(i) == 'c' &&
                    str.charAt(i + 1) == 'o' &&
                    str.charAt(i + 3) == 'e') {
                count++;
            }
        }

        return count;
    }
    public static void main (String[]args){
        System.out.println(countCodeLikePatterns("aaacodebbb"));
        System.out.println(countCodeLikePatterns("codexxcode"));
        System.out.println(countCodeLikePatterns("cozexxcope"));
    }
}

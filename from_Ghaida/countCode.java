public class countCode {
    public static void main(String[] args) {
        System.out.println(countCode("aaacodebbb")); //1
        System.out.println(countCode("codexxcode")); //2
        System.out.println(countCode("cozexxcope")); //2
    }
    public static int countCode(String str) {
        int countCode = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o' && str.charAt(i + 3) == 'e') {
                countCode++;
            }
        }
        return countCode;
    }
}

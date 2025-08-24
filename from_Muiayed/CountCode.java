public class CountCode {
    public int countCode(String str) {
        int count = 0;
        for (int i = 0; i <= str.length() - 4; i++) {
            String piece = str.substring(i, i + 4);
            if (piece.charAt(0) == 'c' &&
                    piece.charAt(1) == 'o' &&
                    piece.charAt(3) == 'e') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        CountCode cc = new CountCode();
        System.out.println(cc.countCode("aaacodebbb"));
        System.out.println(cc.countCode("codexxcode"));
        System.out.println(cc.countCode("cozexxcope"));
    }
}
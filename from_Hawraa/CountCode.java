public class CountCode {
    public static int countCoXeWords(String str) {
        int countCoXe = 0;
        for (int i = 0; i <= str.length() - 4; i++) {
            if (str.substring(i, i + 2).equals("co") && str.substring(i + 3, i + 4).equals("e")) {
                countCoXe++;
            }
        }
        return countCoXe;
    }

    public static void main(String[] args) {
        System.out.println(countCoXeWords("aaacodebbb"));
        System.out.println(countCoXeWords("codexxcode"));
        System.out.println(countCoXeWords("cozexxcope"));
    }
}

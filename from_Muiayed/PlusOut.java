public class PlusOut {
    public String plusOut(String str, String word) {
        StringBuilder out = new StringBuilder();
        int len = word.length();
        int i = 0;
        while (i < str.length()) {
            if (i + len <= str.length() && str.substring(i, i + len).equals(word)) {
                out.append(word);
                i += len;
            } else {
                out.append('+');
                i++;
            }
        }
        return out.toString();
    }
    public static void main(String[] args) {
        PlusOut po = new PlusOut();
        System.out.println(po.plusOut("12xy34", "xy"));
        System.out.println(po.plusOut("12xy34", "1"));
        System.out.println(po.plusOut("12xy34xyabcxy", "xy"));
    }
}
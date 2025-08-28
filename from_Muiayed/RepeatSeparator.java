public class RepeatSeparator {
    public String repeatSeparator(String word, String sep, int count) {
        if (count == 0) return "";
        StringBuilder sb = new StringBuilder(word);
        for (int i = 1; i < count; i++) {
            sb.append(sep).append(word);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        RepeatSeparator rs = new RepeatSeparator();
        System.out.println(rs.repeatSeparator("Word", "X", 3));
        System.out.println(rs.repeatSeparator("This", "And", 2));
        System.out.println(rs.repeatSeparator("This", "And", 1));
    }
}
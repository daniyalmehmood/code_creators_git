public class RepeatEnd {
    public String repeatEnd(String str, int n) {
        String tail = str.substring(str.length() - n);
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < n; i++) {
            out.append(tail);
        }
        return out.toString();
    }

    public static void main(String[] args) {
        RepeatEnd re = new RepeatEnd();
        System.out.println(re.repeatEnd("Hello", 3));
        System.out.println(re.repeatEnd("Hello", 2));
        System.out.println(re.repeatEnd("Hello", 1));
    }
}
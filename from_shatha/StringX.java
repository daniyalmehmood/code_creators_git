public class StringX {
    public static String stringX(String str) {
        if (str.length() <= 2) {
            return str;
        }
        char first = str.charAt(0);
        char last = str.charAt(str.length() - 1);

        StringBuilder sb = new StringBuilder();

        sb.append(first);

        for (int i = 1; i < str.length() - 1; i++) {
            char current = str.charAt(i);
            if (current != 'x') {
                sb.append(current);
            }
        }
        sb.append(last);

        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(stringX("xxHxix"));
        System.out.println(stringX("abxxxcd"));
        System.out.println(stringX("xabxxxcdx"));
    }
}

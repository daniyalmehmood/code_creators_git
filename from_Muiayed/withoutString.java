public class withoutString {
    public static String withoutString(String base, String remove) {
        if (base == null || remove == null || remove.isEmpty()) {
            return base;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int bl = base.length();
        int rl = remove.length();
        while (i <= bl - rl) {
            if (base.substring(i, i + rl).equalsIgnoreCase(remove)) {
                i += rl;
            } else {
                sb.append(base.charAt(i));
                i++;
            }
        }
        while (i < bl) {
            sb.append(base.charAt(i));
            i++;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(withoutString("Hello there", "llo"));
        System.out.println(withoutString("Hello there", "e"));
        System.out.println(withoutString("Hello there", "x"));
    }
}
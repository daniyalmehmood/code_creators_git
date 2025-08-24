public class StarOut {
    public String starOut(String str) {
        StringBuilder out = new StringBuilder();
        int len = str.length();
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == '*') continue;
            if (i > 0 && str.charAt(i - 1) == '*') continue;
            if (i < len - 1 && str.charAt(i + 1) == '*') continue;
            out.append(str.charAt(i));
        }
        return out.toString();
    }

    public static void main(String[] args) {
        StarOut so = new StarOut();
        System.out.println(so.starOut("ab*cd"));
        System.out.println(so.starOut("ab**cd"));
        System.out.println(so.starOut("sm*eilly"));
    }
}
public class MixString {
    public String mixString(String a, String b) {
        StringBuilder out = new StringBuilder();
        int len = Math.min(a.length(), b.length());
        for (int i = 0; i < len; i++) {
            out.append(a.charAt(i));
            out.append(b.charAt(i));
        }
        if (a.length() > len) out.append(a.substring(len));
        if (b.length() > len) out.append(b.substring(len));
        return out.toString();
    }

    public static void main(String[] args) {
        MixString ms = new MixString();
        System.out.println(ms.mixString("abc", "xyz"));
        System.out.println(ms.mixString("Hi", "There"));
        System.out.println(ms.mixString("xxxx", "There"));
    }
}
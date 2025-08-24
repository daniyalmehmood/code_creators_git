public class MirrorEnds {
    public static void main(String[] args) {
        MirrorEnds me = new MirrorEnds();
        System.out.println(me.mirrorEnds("abXYZba"));
        System.out.println(me.mirrorEnds("abca"));
        System.out.println(me.mirrorEnds("aba"));
    }

    public String mirrorEnds(String string) {
        int len = string.length();
        int i = 0;
        while (i < len && string.charAt(i) == string.charAt(len - 1 - i)) {
            i++;
        }
        return string.substring(0, i);
    }
}
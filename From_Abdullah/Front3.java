public class Front3 {
    public String tripleFrontSubstring(String str) {
        String frst3;
        if (str.length () < 3) {
            frst3 = str;
        } else {
            frst3 = str.substring(0,3);
        }
        return frst3 + frst3 + frst3;

    }
}

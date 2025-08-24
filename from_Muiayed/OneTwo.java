public class OneTwo {
    public String oneTwo(String str) {
        StringBuilder out = new StringBuilder();
        for (int i = 0; i + 2 < str.length(); i += 3) {
            out.append(str.charAt(i + 1))
                    .append(str.charAt(i + 2))
                    .append(str.charAt(i));
        }
        return out.toString();
    }

    public static void main(String[] args) {
        OneTwo ot = new OneTwo();
        System.out.println(ot.oneTwo("abc"));
        System.out.println(ot.oneTwo("tca"));
        System.out.println(ot.oneTwo("tcagdo"));
    }
}
public class StringX {
    public static String stringX(String str) {
        int len = str.length();
        String newString = "";
        for (int i = 0; i < len; i++) {
            if (!(i > 0 && i < (len - 1) && str.substring(i, i + 1).equals("x"))) {
                newString = newString + str.substring(i, i + 1);
            }
        }
        return newString;
    }


    public static void main(String[] args) {

        System.out.println(StringX.stringX("xxHxix"));
        System.out.println(StringX.stringX("abxxxcd"));
        System.out.println(StringX.stringX("xabxxxcdx"));
        System.out.println(StringX.stringX("x"));
        System.out.println(StringX.stringX("xx"));
        System.out.println(StringX.stringX(""));
    }
}
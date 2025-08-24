public class StringXLitters {
    public static String stringX(String str) {

        if (str.length() <= 2) {
            return str;
        }


        if ((str.charAt(0) == ('x')) && str.charAt(str.length() - 1) == 'x') {
            return str.substring(0, 1) + str.replace("x", "") + str.substring(str.length() - 1);
        }
        return str.replace("x", "");


    }

    public static void main(String[] args) {
        System.out.println(stringX("xxlitterxx"));
        System.out.println(stringX("xlittxxxerxxx"));

    }

}

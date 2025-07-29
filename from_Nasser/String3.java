public class String3 {

    public static String front3(String str) {

        char[] c = str.toCharArray();
        StringBuilder string1 = new StringBuilder();
        for (int i = 0; i < 3; i++) {

        for (int j = 0; j < Math.min(str.length(), 3); j++) {
            char abc = c[j];
            string1.append(abc);
        }

        }

        return string1.toString();

    }
    public static void main(String[] args){

        System.out.println(front3("hello"));
    }

}

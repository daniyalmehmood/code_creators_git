public class nonStart {

    public static String nonStart(String a, String b) {

        StringBuilder string1=new StringBuilder();
        for(int i=1;i<a.length();i++){

            char[] aChars=a.toCharArray();
            string1.append(aChars[i]);
        }

        for (int j=1;j<b.length();j++){

            char[] bChars=b.toCharArray();
            string1.append(bChars[j]);

       }
        return string1.toString();
    }

    public static void main(String[] args) {
        System.out.println(nonStart("hello","there"));
    }

}

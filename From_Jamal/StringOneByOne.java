public class StringOneByOne {
    public static String stringSplosion(String str) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++){

            sb = sb.append(str.substring(0,i));


        }

        return sb.toString() + str;

    }

    public static void main(String[] args) {
        System.out.println(stringSplosion("Hello"));
    }

}

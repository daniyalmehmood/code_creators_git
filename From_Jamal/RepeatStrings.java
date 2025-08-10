public class RepeatStrings {
    public static String front3(String str) {

        if (str.length() >= 3) {



            return str.substring(0,3)+str.substring(0,3)+str.substring(0,3);


        } else if (str.length() >= 2) {

            return str.substring(0,2) + str.substring(0,2) + str.substring(0,2);

        }else if (str.length() >= 1) {

            return str.substring(0,1) + str.substring(0,1) + str.substring(0,1);

        }else return str;

    }

    public static void main(String[] args) {

        System.out.println(front3("jamalalzeidi"));

    }
}

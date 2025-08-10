public class FirstTwoChar {
    public static String front22(String str) {

        int num =2 ;




        if (num > str.length()){

            num = str.length();


        }

        String order = str.substring(0,num);
        return order + str + order;
    }

    public static void main(String[] args) {
        System.out.println(front22("ali"));
        System.out.println(front22("a"));
        System.out.println(front22(""));

    }
}

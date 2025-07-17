public class FRONT22 {

    public static String front22(String str){

        String letter12=str.substring(0,2);
        return letter12+str+letter12;

    }

    public static void main(String[]args){

        System.out.println(front22("nasser"));
    }
}

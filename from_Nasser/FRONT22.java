public class FRONT22 {

    public static String front22(String str){

        if(str.length()>=2) {
            String letter12 = str.substring(0, 2);
            return letter12 + str + letter12;
        }
        else return str;

    }

    public static void main(String[]args){

        System.out.println(front22("nasser"));
    }
}

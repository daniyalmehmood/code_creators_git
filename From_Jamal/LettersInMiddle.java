public class LettersInMiddle {

    public static boolean mixStart(String str) {


        if(str.length() <=2)return false;

        if (str.length() >=1 && str.substring(1,3).equals("ix") ){

            return true;


        }else return false;
    }

    public static void main(String[] args) {

        System.out.println(mixStart("fix"));
        System.out.println(mixStart("niz"));



    }

}

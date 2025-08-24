public class MixStart {

    public static boolean mixString( String str){

        if( str.substring(1,3).equals("ix")){

            return true;

        }
        else return false;

    }
    public static void main(String[] args){
        System.out.println(mixString("mix cycle"));
        System.out.println(mixString("pix"));
        System.out.println(mixString("not"));

    }
}

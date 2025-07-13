public class StartHi {

    public static boolean startHi(String str){

        if( str.substring(0,2).equals("hi")) {
            return true;
        }
        else{
            return false;

        }
    }

    public static void main(String[] args){

        System.out.println(startHi("hi nasser"));
        System.out.println(startHi("nasser"));
    }
}

import java.util.Locale;

public class EndUp {

    public static String endUp( String str){
        if(str.length()<3)return str.toUpperCase();
        String s1=str.substring(0,str.length()-4);
        String s2=str.substring(str.length()-4,str.length()-1).toUpperCase();
        return s1+s2;

        }

        public static void main(String[] args){

            System.out.println(endUp("nasser"));
        }
    }




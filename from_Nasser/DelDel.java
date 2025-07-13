public class DelDel {


    public static String delDel(String str){

        if( str.substring(1,4).equals("del")){
            return str.substring(0,1)+str.substring(4,str.length()-1);
        }
        else return str;

    }

    public static void main(String[] args){

        System.out.println(delDel("nasser"));
        System.out.println(delDel("ndelasser"));
    }
}

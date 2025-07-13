public class BackAround {

    public static String backAround(String str){

        char first=str.charAt(0);

        return first+str+first;

    }
    public static void main(String[] args){

        System.out.println(backAround("nasser"));
    }
}

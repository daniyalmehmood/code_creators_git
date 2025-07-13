public class EveryNth {

    public static String everyNth(String str , int n){
        StringBuilder String1=new StringBuilder();
        for (int i=0;i<str.length();i+=n){

            char [] w=str.toCharArray();
            String1.append(w[i]);

        }
        return String1.toString();
    }

    public static void main(String[] args){

        System.out.println(everyNth("nasser",3));
        System.out.println(everyNth("nasser",2));
        System.out.println(everyNth("nasser",1));
    }
}

public class StringE {

    public static boolean stringE(String str){
        int count=0;

        for (int i=0;i<=str.length()-1;i++){

            char e='e';

           if( str.charAt(i)== e){

             count++;

           }


        }
        if (count==0 || count>3){
            return false;


        }
        else return true;
    }

    public static void main(String[] args){

        System.out.println(stringE("heello"));
        System.out.println(stringE("heeello"));
        System.out.println(stringE("heeeeello"));
    }
}

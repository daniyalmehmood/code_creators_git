public class StringSplosion {
    
    public static String stringSplosion(String str) {
        String x="";

        for(int i=0 ; i<str.length() ; i++){
            x= x+ str.substring(0,i+1);

        }

        return x ;
    }


    public static void main(String [] args){

        System.out.println( StringSplosion.stringSplosion("Code"));
        System.out.println( StringSplosion.stringSplosion("abc"));
        System.out.println( StringSplosion.stringSplosion("ab"));
        System.out.println( StringSplosion.stringSplosion("fade"));


    }
}

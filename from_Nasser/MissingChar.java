public class MissingChar {

    public static String missingChar(String str, int n){
        char[]c=str.toCharArray();

        StringBuilder letterDeleted= new StringBuilder();
        for (int i=0;i< c.length;i++){

            if (i!=n){
                letterDeleted.append(c[i]);

            }


         }return letterDeleted.toString();
    }
    public static void main(String[] args){

        System.out.println(missingChar("cat",0));
        System.out.println(missingChar("cat",1));
        System.out.println(missingChar("cat",2));
    }
}

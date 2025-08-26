public class CharDuplicator {
    public static String duplicateEachChar(String str) {
   StringBuilder result=new StringBuilder();
        for(int i=0 ; i<str.length() ; i++){
            for(int j=0;j<2;j++)
       {
           result.append(str,i,i+1);
       }

   }
        return result.toString();
    }
public static void main (String[] args)
{
    System.out.println(duplicateEachChar("Hi-There"));
    System.out.println(duplicateEachChar("AAbb"));
    System.out.println(duplicateEachChar("Word!"));
    System.out.println(duplicateEachChar("Hi-There"));
    System.out.println(duplicateEachChar("a"));
    System.out.println(duplicateEachChar("."));
    System.out.println(duplicateEachChar("aa"));
    System.out.println(duplicateEachChar("The"));
    System.out.println(duplicateEachChar(""));
}
    }

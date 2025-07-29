public class MissingChar{
 public static String missingChar(String str, int n){
   if (str != null && 0 <= n && n < str.length()){
     StringBuilder newStr = new StringBuilder(str);
	 newStr.deleteCharAt(n);
	 return newStr.toString();
   }
   return str;
 }
 
  public static void main(String[] args){

   System.out.println(missingChar("kitten", 1));
   System.out.println(missingChar("kitten", 0));
   System.out.println(missingChar("kitten", 4));
  }
}
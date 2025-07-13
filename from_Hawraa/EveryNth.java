public class EveryNth{
 public static String everyNth(String str, int n){
   StringBuilder newStr =new StringBuilder();
   if (n < 1){
	   return "Invalid value of N";
   }
   for(int i = 0; i < str.length(); i += n){
    newStr.append(str.charAt(i));
   }
   return newStr.toString();
 }
 
 public static void main(String[] args){
   System.out.println(everyNth("Miracle", 2));
   System.out.println(everyNth("abcdefg", 2));
   System.out.println(everyNth("abcdefg", 3));
  }
} 
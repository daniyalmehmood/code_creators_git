public class BackAround{
  public static String backAround(String str){
  
   if (str.length() >= 1){
     char lastch = str.charAt(str.length() - 1);
	 return lastch + str + lastch;
   }
   return null;
  }
  
  public static void main(String[] args){
   System.out.println(backAround("cat"));
   System.out.println(backAround("Hello"));
   System.out.println(backAround("a"));   
  }
}
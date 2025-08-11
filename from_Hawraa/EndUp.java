public class EndUp{
  public static String endUp(String str){
  if(str.length() < 3){
   return str.toUpperCase();
  }
  else{
   String newStr = str.substring(0, str.length() - 3);
   String lastThree = str.substring(str.length() - 3);
   return newStr + lastThree.toUpperCase();
  }
 }

 public static void main(String[] args){
   System.out.println(endUp("Hello"));
   System.out.println(endUp("hi there"));
   System.out.println(endUp("hi"));
  }
}
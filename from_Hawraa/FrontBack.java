public class FrontBack{
  public static String frontBack(String str){
    if (str.length() >= 1){
	
	  StringBuilder newStr = new StringBuilder(str);
      char firstch = newStr.charAt(0);
      char lastch = newStr.charAt(newStr.length() - 1);	  
	  newStr.setCharAt(0, lastch);
	  newStr.setCharAt(newStr.length() - 1, firstch);
	  
	  return newStr.toString();
	}
	else{
	  return str;
	}
  }
  
  public static void main(String[] args){

   System.out.println(frontBack("code"));
   System.out.println(frontBack("a"));
   System.out.println(frontBack("ab"));
  }
}
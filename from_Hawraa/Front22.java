public class Front22{
  public static String front22(String str){
      String newStr;
      
    if(str.length() >= 2){
	  newStr = str.substring(0, 2);
	}
	else{
	  newStr = str;
	}
	return newStr + str + newStr;
  }
  
  public static void main(String[] args){
   System.out.println(front22("kitten"));
   System.out.println(front22("Ha"));
   System.out.println(front22("abc"));   
  }
}
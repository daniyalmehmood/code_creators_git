public class DelDel{
  public static String delDel(String str){
    if (str.length() >= 4 && str.substring(1, 4).equals("del")){
	  return str.substring(0, 1) + str.substring(4);
	}
	else{
	 return str;
	}
  }
  
  public static void main(String[] args){
   System.out.println(delDel("adelbc"));
   System.out.println(delDel("adelHello"));
   System.out.println(delDel("adedbc"));   
  }
}
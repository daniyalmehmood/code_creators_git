public class MixStart{
  public static boolean mixStart(String str){
    if (str.substring(1, 3).equals("ix")){
	 return true;
	}
	else{
	 return false;
	}
  }
  
  public static void main(String[] args){
    System.out.println(mixStart("mix snacks"));
	System.out.println(mixStart("pix snacks"));
	System.out.println(mixStart("piz snacks"));
  }
}
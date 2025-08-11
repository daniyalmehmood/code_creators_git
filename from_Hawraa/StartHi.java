public class StartHi{
   public static boolean startHi(String str){
    String begin = str.substring(0, 2);
	
	if (begin.equals("hi")){
	  return true;
	}
	else{
	  return false;
	}
  }
  public static void main(String[] args){
   System.out.println(startHi("hi there"));
   System.out.println(startHi("hi"));
   System.out.println(startHi("hello hi"));   
  }
}
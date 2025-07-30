public class MonkeyTrouble{
	
	  public static boolean monkeyTrouble(boolean aSmile, boolean bSmile){
		  if ((aSmile && bSmile) || (!aSmile && !bSmile) ){
			  return true;
		  }
		  else{
			  return false;
		  }
	  }
	  
	  public static void main(String[] args) {
		 System.out.println(monkeyTrouble(true, true));
		 System.out.println(monkeyTrouble(false, false));
		 System.out.println(monkeyTrouble(true, false));
	  }
}
public class SleepInLogic{
	
	  public static void sleepIn(boolean weekday, boolean vacation){
		  if (!weekday || vacation){
			  System.out.println("We can sleep in it.");
		  }
		  else{
			  System.out.println("We can't sleep in it.");
		  }
	  }
	  
	  public static void main(String[] args) {
		 sleepIn(false, false);
		 sleepIn(true, false);
		 sleepIn(false, true);
	  }
}
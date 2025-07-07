public class SleepIn  {
	boolean weekday;
	boolean vacation;
	
	public static void main(String[] args) {
		SleepIn(false, false);
		SleepIn(true, false);
		SleepIn(false, true);
		SleepIn(true, true);
	}
	
	public static void SleepIn(boolean weekday, boolean vacation){
		if (!weekday || vacation){
			System.out.println("We can sleep in.");
		}
		else{
			System.out.println("We can't sleep in.");
		}
	}
}
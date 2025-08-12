public class SleepIn  {
	
	public static void main(String[] args) {
		System.out.println(SleepIn(false, false));
		System.out.println(SleepIn(true, false));
		System.out.println(SleepIn(false, true));
		System.out.println(SleepIn(true, true));
	}
	
	public static boolean SleepIn(boolean weekday, boolean vacation){
		if (!weekday || vacation){
			System.out.print("We can sleep in.");
			return true;
		}
		else{
			System.out.print("We can't sleep in.");
			return false;
		}
	}
}
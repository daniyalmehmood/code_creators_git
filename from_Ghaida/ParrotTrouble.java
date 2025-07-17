public class ParrotTrouble {
	public static void main(String[] args) {
		System.out.println(parrotTrouble(true, 6));  //true
		System.out.println(parrotTrouble(true, 7));   // false
		System.out.println(parrotTrouble(false, 6));  //false
	}
	
	public static boolean parrotTrouble(boolean talking, int hour){
		if(talking && (hour < 7 || hour > 20)){
			return true;
		}
		else{
			return false;
		}
	}
}
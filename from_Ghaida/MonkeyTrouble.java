public class MonkeyTrouble{
	public static  void main(String[] args){
		System.out.println(monkeyTrouble(true, true)); // true
		System.out.println(monkeyTrouble(false, false));// true
		System.out.println(monkeyTrouble(true, false));// false
	}
	
	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile){
		if((aSmile && bSmile) || (!aSmile && !bSmile)){
		    System.out.print("We are in trouble if both monkeys are smiling or if neither is smiling . ");
			return true;
		}
		else {
		    System.out.print("We are not in trouble . ");
			return false;
		}
	}
}

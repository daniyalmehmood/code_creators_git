public class MixStart{
	public static void main(String[] args){
		System.out.println(mixStart("mix snacks")); //true
		System.out.println(mixStart("pix snacks")); //true
		System.out.println(mixStart("piz snacks")); //false
	}
	
	public static boolean mixStart(String str){
		if(str.length() < 3){
			return false;
		}
		else{
			// Check if the substring from index 1 to 3 is "ix"
			boolean mixString = str.substring(1, 3).equals("ix");
			return mixString;

		}
	}
}
public class Front3{
	public static  void main(String[] args){
		System.out.println(front3("Java")); //"JavJavJav"
		System.out.println(front3("Chocolate"));//"ChoChoCho"
		System.out.println(front3("abc"));//"abcabcabc"
	}
	
	public static String front3(String str){
		if(str.length() < 3){
			String shortString = str + str + str;
			return shortString;
		}
		else{
			String longString = str.substring(0, 3);
			String front3 = longString + longString + longString;
			return front3;
		}
		
	}
}
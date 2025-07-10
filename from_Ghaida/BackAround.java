public class BackAround{
	public static  void main(String[] args){
		System.out.println(backAround("cat")); //"tcatt"
		System.out.println(backAround("Hello"));//"oHelloo"
		System.out.println(backAround("a"));//"aaa"
	}
	
	public static String backAround(String str){
		if(str.length() >= 1){
			char lastChar = str.charAt(str.length() - 1);
			String newString = lastChar + str + lastChar;
			return newString;
		}
		else{
			return "";
		}
	}
}
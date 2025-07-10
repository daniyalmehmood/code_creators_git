public class FrontBack{
	public static  void main(String[] args){
		System.out.println(frontBack("code")); // eodc
		System.out.println(frontBack("a"));// a
		System.out.println(frontBack("ab"));// ba
	}
	
	public static String frontBack(String str){
		if(str.length() <= 1){
			return str;
		}
		else {
			char firstChar = str.charAt(0); //char at index 0
			char lastChar = str.charAt(str.length() - 1);//char at last index
			String middle = str.substring(1, str.length() - 1);
			
			String frontBackString = lastChar + middle + firstChar;
			return frontBackString;
		}
	}
}

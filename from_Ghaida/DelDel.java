public class DelDel{
	public static void main(String[] args){
		System.out.println(delDel("adelbc"));//"abc"
		System.out.println(delDel("adelHello"));//"aHello"
		System.out.println(delDel("adedbc"));//"adedbc"

	}
	
	public static String delDel(String str){
		if (str.length() < 3) {
            return false;
		}
		else {
		//String str = str.startsWith("del");
		//char newStr = str.subString("del");
		boolean str = str.substring(1, 3).equals("del");
		String newStr = str.length(0) + str.length(3 , str.length()+1);
		return newStr;
		}
	}
}
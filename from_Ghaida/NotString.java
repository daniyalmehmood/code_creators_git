public class NotString{
	public static  void main(String[] args){
		System.out.println(notString("candy"));
		System.out.println(notString("x"));
		System.out.println(notString("not bad"));
	}
	
	public static String notString(String str){
		if(str.equals("not ") || str.startsWith("not ")){
			return str; //return unchange if string starts with "not"
		}
		else {
			return "not " + str;// add not before the string
		}
	}
}

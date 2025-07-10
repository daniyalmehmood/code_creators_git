public class Front22{
	public static  void main(String[] args){
		System.out.println(front22("kitten")); //"kikittenki"
		System.out.println(front22("Ha"));//"HaHaHa"
		System.out.println(front22("abc"));//"ababcab"
	}
	
	public static String front22(String str){
		if(str.length() < 2){
			String shortString = str + str + str;
			return shortString;
		}
		else{
			String front22 = str.substring(0, 2);
			String front = front22 + str + front22;
			return front;
		}
	}
}
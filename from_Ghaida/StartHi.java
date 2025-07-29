public class StartHi{
	public static  void main(String[] args){
		System.out.println(startHi("hi there")); //true
		System.out.println(startHi("hi"));//true
		System.out.println(startHi("hello hi"));//false
	}
	
	public static boolean startHi(String str){
		if(str.startsWith("hi")){
			return true;
		}
		else{
			return false;
		}
	}
}
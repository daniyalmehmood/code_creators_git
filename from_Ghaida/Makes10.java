public class Makes10{
	public static void main(String[] args){
		System.out.println(makes10(9, 10));//true
		System.out.println(makes10(9, 9));//false
		System.out.println(makes10(1, 9));//true
	}
	
	public static boolean makes10(int a, int b){
		if(a == 10 || b == 10 || (a + b == 10)){
			return true;
		}
		else {
			return false;
		}
	}
}
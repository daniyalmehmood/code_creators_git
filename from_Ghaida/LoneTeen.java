public class LoneTeen{
	public static  void main(String[] args){
		System.out.println(loneTeen(13, 99)); //true
		System.out.println(loneTeen(21, 19)); //true
		System.out.println(loneTeen(13, 13)); //false

	}
	
	public static boolean loneTeen(int a, int b){
		if ((a >= 13 && a <= 19) && (b < 13 || b > 19)) {
			return true;
		}
		if ((b >= 13 && b <= 19) && (a < 13 || a > 19)) {
			return true;
		}
		return false;
	}
}
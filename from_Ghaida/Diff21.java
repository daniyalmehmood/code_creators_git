public class Diff21{
	public static void main(String[] args) {
		diff21(19);
		diff21(10);
		diff21(21);
	}
	
	public static void diff21(int n){
		if (n <= 21){
			int absoluteResult = 21 - n;;
			System.out.println("The absolute difference between n and 21 is : " + absoluteResult);
		}
		else{
			int doubleResult = 2 * (n - 21);
			System.out.println("The double the absolute difference is :" + doubleResult);
		}
	}
}



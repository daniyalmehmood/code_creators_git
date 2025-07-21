public class Diff21{
	public static void main(String[] args) {
		System.out.println(diff21(19));
		System.out.println(diff21(10));
		System.out.println(diff21(21));
	}
	
	public static int diff21(int n){
		if (n <= 21){
			int absoluteResult = 21 - n;;
			return absoluteResult;
		}
		else{
			int doubleResult = 2 * (n - 21);
			return doubleResult;
		}
	}
}



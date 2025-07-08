public class TRA566  {
	
	public static void main(String[] args) {
		sumDouble(1, 2);
		sumDouble(3, 2);
		sumDouble(2, 2);
	}
	
	public static void sumDouble(int a, int b){
		if (a != b){
			System.out.println("The sum of two integers: "+ (a + b));
		}
		else{
			System.out.println("The double of sum: " + 2 * (a + b));
		}
	}
}
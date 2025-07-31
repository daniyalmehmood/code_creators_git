public class Or35{
	public static  void main(String[] args){
		System.out.println(or35(3)); //true
		System.out.println(or35(10));//true
		System.out.println(or35(8));//false
	}
	
	public static boolean or35(int n){
	//% to check if n is divisible by 3 or 5.
		// return true if n is a multiple of 3 or 5
        return (n % 3 == 0 || n % 5 == 0);
	}
}
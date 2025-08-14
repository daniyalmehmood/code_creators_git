public class PosNeg{
	public static  void main(String[] args){
		System.out.println(posNeg(1, -1, false));//true
		System.out.println(posNeg(-1, 1, false));//true
		System.out.println(posNeg(-4, -5, true));//true
	}
	
	public static boolean posNeg(int a, int b, boolean negative){
		if(negative){ // return true if parameter is true and both are negative
			return (a < 0 && b < 0);
		}
		else {
			return (a < 0 && b > 0) || (a > 0 && b < 0);//if parameter true, check must both of them one of them be negative
		}
	}
}
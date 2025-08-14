public class In1020{
	public static  void main(String[] args){
		System.out.println(in1020(12, 99)); //true
		System.out.println(in1020(21, 12)); //true
		System.out.println(in1020(8, 99)); //false
	}
	
	public static boolean in1020(int a, int b){
		if((10 <= a && a <= 20) || (10 <= b && b <= 20)){
			return true;
		}
		else{
			return false;
		}
	}
}
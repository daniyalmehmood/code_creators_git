public class In3050{
	public static  void main(String[] args){
		System.out.println(in3050(30, 31));//true
		System.out.println(in3050(30, 41));//false
		System.out.println(in3050(40, 50));//true
	}
	
	 public static boolean in3050(int a, int b){
		if((30 <= a && a <= 40) && (30 <= b && b <= 40)){
			return true;
		}
		else if((40 <= a && a <= 50) && (40 <= b && b <= 50)){
			return true;
		}
		else{
			return false;
		}
    }
}
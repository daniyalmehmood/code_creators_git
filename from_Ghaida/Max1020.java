public class Max1020{
	public static  void main(String[] args){
		System.out.println(max1020(11, 19)); //19
		System.out.println(max1020(19, 11)); //19
		System.out.println(max1020(11, 9)); //11
	}
	
	 public static int max1020(int a, int b){
		 if (a >= 10 && a <= 20 && b >= 10 && b <= 20) {
			 return Math.max(a, b);
		 }
		 else if (b >= 10 && b <= 20) {
			 return b;
		 }
		 else if (a >= 10 && a <= 20) {
			 return a;
		 }
		 return 0;
    }
}
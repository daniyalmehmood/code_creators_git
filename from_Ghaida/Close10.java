public class Close10{
	public static  void main(String[] args){
		System.out.println(close10(8, 13));//8
		System.out.println(close10(13, 8));//8
		System.out.println(close10(13, 7));//0


	}
	
	 public static int close10(int a, int b){
		int A = Math.abs(a - 10);
        int B = Math.abs(b - 10);

		if(A > B){
			return b;
		}
		else if(A < B){
			return a;
		}
		else{
			return 0;
		}
    }
}
public class NoTeenSumChecker {
 public int noTeenSum(int a, int b, int c) {
        a=fixTeen(a);
        b=fixTeen(b);
        c=fixTeen(c);
        return a+b+c;
    }
	 public int fixTeen(int n){
        if(n>=13&&n<=19&&(n!=15&&n!=16))return 0;
        return n;
    }
	}
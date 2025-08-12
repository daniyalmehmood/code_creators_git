public class LoneSumForThreeNums {
   public int loneSum(int a, int b, int c) {
        if(a!=b&&b!=c&&a!=c) return a+b+c;
        else if(a!=b&&a!=c) return a;
        else if(b!=c&&b!=a) return b;
        else if (c!=a&&c!=b) return c;
        return 0;

    }
	}
public class ChocolatePackageBuilder {
    public static int smallBarsNeeded(int small, int big, int goal) {
        int bigBar = goal/ 5;
        int smallBar=0;
        if(bigBar >= big){ //  if bigBar is greater than big, calculate the smallBar needed
            smallBar = goal -(big*5);
        }
        else {
            smallBar = goal -(bigBar*5); // bigBar is smaller than big, calculate the smallBar needed
        }
        if (smallBar<=small) // the needed small bar is available
        {
            return smallBar;
        }
        if (smallBar > small) {
            return -1; // the needed small bar is more than the given
        }
        return 0; // no need for smallBar of chocolate
    }
    public static void main(String[] args) {
        System.out.println(smallBarsNeeded(4,1,9));
        System.out.println(smallBarsNeeded(4,1,10));
        System.out.println(smallBarsNeeded(4,1,5));
    }
}

public class StartOne {

    public int countStartingOnes(int[] a, int[] b) {
        int result=0;
        if (a.length>=1 &&a[0]==1  ) result+=1;
        if ( b.length>=1&&b[0]==1) result+= 1;


        return result;
    }

}

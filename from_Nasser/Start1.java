public class Start1 {

    public int start1(int[] a, int[] b) {
        int count=0;
        if (( a.length>=1 && a[0]==1) && ( b.length>=1 && b[0]==1)){
           count+=2;
        }
        else if (( a.length>=1 && a[0]==1) || ( b.length>=1 && b[0]==1)){
            count++;
        }
      return count;
    }

}

public class FrontFristTwo {
public int[] front11(int[] a, int[] b) {
        int[] newArray=new int[2];
        if(a.length>=1&&b.length<1) return new int[]{a[0]};
        else if(b.length>=1&&a.length<1)return new int[]{b[0]};
        else if((b.length<1&&a.length<1))return new int[]{};
        else{
            return new int[]{a[0],b[0]};

        }
}

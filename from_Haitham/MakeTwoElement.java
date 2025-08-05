public class MakeTwoElement {
public int[] make2(int[] a, int[] b) {
        if(a.length<1) return new int[]{b[0],b[1]};
        else if(a.length<2)return new int[]{a[0],b[0]};
        else return new int[]{a[0],a[1]};
    }
}

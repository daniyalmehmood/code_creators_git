public class FirstElementsFromBoth  {

    public int[] getFirstElements(int[] a, int[] b) {
        if (a.length>=1 && b.length>=1) return new int[] {a[0],b[0]};
        if (a.length<1 && b.length>1) return new int[] {b[0]};
        if (a.length>1 && b.length<1) return new int[] {a[0]};
        return a;

    }

}

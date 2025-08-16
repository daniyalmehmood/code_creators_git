public class CloseFar {

    public boolean isCloseFar(int a, int b, int c) {
        int diffAB=Math.abs(a-b);
        int diffAC=Math.abs(a-c);
        int diffBC=Math.abs(c-b);

        return ((diffAB<=1 && diffAC>1 && diffBC>1) || (diffAC<=1 && diffAB>1 && diffBC>1));

    }

}

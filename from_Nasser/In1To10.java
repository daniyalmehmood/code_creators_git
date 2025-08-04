public class In1To10 {

    public boolean in1To10(int n, boolean outsideMode) {

        if(!outsideMode && (1<=n && n<=10)) return true;
        else return outsideMode && (n <= 1 || n >= 10);

    }

}

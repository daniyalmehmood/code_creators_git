public class InOrder {

    public boolean inOrder(int a, int b, int c, boolean bOk) {
        return (((c>b) && (b>a)) || (bOk && c>b ));
    }

}

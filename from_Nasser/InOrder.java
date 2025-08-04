public class InOrder {
    public boolean inOrder(int a, int b, int c, boolean bOk) {

        if(!bOk && (b>a && c>b) )return true;
        else return bOk && c > b;


    }

}

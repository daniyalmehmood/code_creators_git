public class TeenLone  {

    public boolean isOnlyOneTeen(int a, int b) {
        if ((a>=13 && a<=19) && (b>=13 && b<=19)) return false;
        if ((a>=13 && a<=19) || (b>=13 && b<=19)) return true;
        return false;

    }
}

public class Diff21 {
    public int getAbsoluteDiffWithDoubleAbove21(int n) {
        if( n <= 21){
            return (21-n);
        }
        else{
            return 2*(n-21);
        }
    }
}

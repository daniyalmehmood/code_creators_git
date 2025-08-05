public class LessBy10 {
    public boolean lessBy10(int a, int b, int c) {
        int DifAB= Math.abs(a-b);
        int DifAC= Math.abs(a-c);
        int DifBC= Math.abs(b-c);
        return (DifAB>=10 || DifAC>=10 || DifBC>=10);
    }

}

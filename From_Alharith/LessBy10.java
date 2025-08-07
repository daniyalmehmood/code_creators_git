public class LessBy10 {

    public boolean hasAnyPairWithDifferenceOfTenOrMore(int a, int b, int c) {
        int diffAB= Math.abs(a-b);
        int diffAC= Math.abs(a-c);
        int diffBC= Math.abs(b-c);

        return (diffAB >=10 || diffAC>=10 || diffBC>=10) ;
    }

}

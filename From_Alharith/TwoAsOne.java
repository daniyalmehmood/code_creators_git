public class TwoAsOne {

    public boolean isAnyTwoNumbersSumEqualToThird(int a, int b, int c) {
        int sumAB=a+b;
        int sumAC=a+c;
        int sumBC= b+c;

        return (sumAB==c) || (sumAC==b) || (sumBC==a);
    }

}

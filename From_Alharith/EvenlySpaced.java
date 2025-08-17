public class EvenlySpaced {

    public boolean areNumbersEvenlySpaced(int a, int b, int c) {

        int maxValue= Math.max(a,Math.max(b,c));
        int small= Math.min(a,Math.min(b,c));
        int medium=0;
        if (a==b &&b==c) return true;

        if (a<maxValue && a>small) medium=a;
        if (b<maxValue && b>small) medium=b;
        if (c<maxValue && c>small) medium=c;

        return maxValue-medium == medium-small;

    }

}

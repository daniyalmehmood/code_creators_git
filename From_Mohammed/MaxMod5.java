public class MaxMod5 {
    public int maxMod5(int a, int b) {

        if (a>b && a%5==b%5) return b;
        if (a<b && a%5==b%5) return a;
        if (b>a) return b;
        if (a>b) return a;
        return 0;
    }

}

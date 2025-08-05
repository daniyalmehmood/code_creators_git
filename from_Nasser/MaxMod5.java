public class MaxMod5 {
    public int maxMod5(int a, int b) {

        if(a%5==b%5 && a!=b) return Math.min(a,b);
        else if (a%5!=b%5) return Math.max(a,b);
        else return 0;


    }

}

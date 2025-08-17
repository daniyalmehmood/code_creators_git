public class RoundSum {

    public int calculateRoundedSum(int a, int b, int c) {

        a=roundToNearest10(a);
        b=roundToNearest10(b);
        c=roundToNearest10(c);

        return a+b+c;


    }

    public int roundToNearest10(int num){

        int round= num%10;
        if (round>=5)  return num+(10-round);
        return num-round;
    }
}

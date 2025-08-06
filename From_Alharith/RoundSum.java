public class RoundSum {

    public int roundSum(int a, int b, int c) {

        a=round10(a);
        b=round10(b);
        c=round10(c);

        return a+b+c;


    }

    public int round10(int num){

        int round= num%10;
        if (round>=5)  return num+(10-round);
        return num-round;
    }
}

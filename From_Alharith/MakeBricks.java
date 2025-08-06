public class MakeBricks {

    public boolean makeBricks(int small, int big, int goal) {

        int maxBig= goal/5;

        if (big>maxBig) big=maxBig;

        if (small>= goal-(big*5)) return true;

        return false;


    }

}

public class MakeChocolate {

    public int makeChocolate(int small, int big, int goal) {

        int maxBig= goal/5;
        if (big>maxBig) big=maxBig;

        if (small >= goal-(5*big)) return  goal-(big*5) ;
        return -1;




    }

}

public class TwoAsOne {

    public boolean twoAsOne(int a, int b, int c) {

        if (a+b==c)return true;
        else return a + c == b || c + b == a;

    }


}

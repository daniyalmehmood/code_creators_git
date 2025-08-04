public class LessBy10 {
    public boolean lessBy10(int a, int b, int c) {

        if(a<=b-10 || a<=c-10 ) return true;
        else if(b<=a-10 || b<=c-10) return true;
        else return c <= a - 10 || c <= b - 10;

    }

}

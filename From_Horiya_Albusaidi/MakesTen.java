public class MakesTen {
    public static Boolean makes10(int a, int b)
    {
        int sum = a + b;
        boolean result;
        if(a==10 || b==10 || sum==10) result=true;
        else result=false;
        return result;

    }
}

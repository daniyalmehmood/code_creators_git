public class Max1020 {
    public static Integer max1020(int a, int b)
    {
        int result = 0;
        if( (a>10 && a<20) || (b>10 && b<20) ) {
            if(a>b)
                result = a;
            else
                result = b;
        }

        return result;
    }
}

public class Close10 {
    public static Integer close10(int a, int b)
    {
        int absWithA= Math.abs(10-a);
        int absWithB= Math.abs(10-b);
        if(absWithA==absWithB)
            return 0;
        else if (absWithA > absWithB)
            return b;
        else return a;
    }
}

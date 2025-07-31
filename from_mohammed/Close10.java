public class Close10 {
    public int close10(int a, int b) {
        int aDif=Math.abs(a-10);
        int bDif=Math.abs(b-10);

        if(aDif<bDif)
            return a;

        else if(aDif>bDif)
            return b;

        else
            return 0;}
}

public class Count8 {

    public int count8(int n) {
        if (n==0) return 0;

        int add=0;
        if (n%10==8 && (n/10)%10==8) add=2;
        else if (n%10==8) add=1;


        return add + count8(n/10);
    }

}

public class CountingBunnyEars {
    public int numberOfEars(int bunnies) {
        if(bunnies==0) return 0;
        if(bunnies==1) return 2;
        if(bunnies%2==0) return 3+numberOfEars(bunnies-1);
        else return 2+numberOfEars(bunnies-1);
    }
}

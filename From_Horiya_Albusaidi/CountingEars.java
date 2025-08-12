public class CountingEars {
    public int sumBunnyEars(int bunnies) {
        if (bunnies == 0) return 0;
        return sumBunnyEars(bunnies - 1) + 2;
    }

}

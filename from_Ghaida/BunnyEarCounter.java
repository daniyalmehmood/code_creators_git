public class BunnyEarCounter {//Recursion-1 > bunnyEars
    public static void main(String[] args) {
        System.out.println(countEars(0));// → 0
        System.out.println(countEars(1));// → 2
        System.out.println(countEars(2));// → 4
    }

    public static int countEars(int bunnies) {
        if (bunnies == 0) {
            return 0;// no bunnies, no ear
        }
        return 2 + countEars(bunnies - 1);
    }
}
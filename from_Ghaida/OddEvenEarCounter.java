public class OddEvenEarCounter {//Recursion-1 > bunnyEars2
    public static void main(String[] args) {
        System.out.println(countEars(0));// → 0
        System.out.println(countEars(1));// → 2
        System.out.println(countEars(2));// → 5
    }
    public static int countEars(int bunnies) {
        if(bunnies == 0){
            return 0;
        }
        if(bunnies % 2 == 0){
            return 3 + countEars(bunnies - 1);
        }
        return 2 + countEars(bunnies - 1);
    }
}
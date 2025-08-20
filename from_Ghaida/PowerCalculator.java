public class PowerCalculator {//Recursion-1 > powerN
    public static void main(String[] args) {
        System.out.println(computePower(3, 1));// → 3
        System.out.println(computePower(3, 2));// → 9
        System.out.println(computePower(3, 3));// → 27
    }
    public static int computePower(int base, int n) {
        if(n == 1){
            return base;
        }
        return base * computePower(base, n - 1);
    }
}
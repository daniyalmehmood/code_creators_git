public class PowerCalculator {

    // Recursive function to calculate base^n
    public static int powerN(int base, int exponent) {
        //  if exponent is 1, return base
        if (exponent == 1) {
            return base;
        }

        //  base * power(base, exponent - 1)
        return base * powerN(base, exponent - 1);
    }

    public static void main(String[] args) {
        System.out.println("powerN(3, 1) = " + powerN(3, 1));
        System.out.println("powerN(3, 2) = " + powerN(3, 2));
        System.out.println("powerN(3, 3) = " + powerN(3, 3));
    }
}
public class PowerOperation {
    public int powerOfTheValue(int base, int n) {
        if (n == 1) return base;
        return base * powerOfTheValue(base, n - 1);

    }

}

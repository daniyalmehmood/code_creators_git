public class Count7 {

    public int count7(int n) {
        if (n == 0) return 0;

        int add = 0;
        if (n % 10 == 7) {
            add = 1;
        }

        return add + count7(n / 10);
    }

}

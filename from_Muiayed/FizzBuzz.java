import java.util.Arrays;

public class FizzBuzz {
    public static String[] fizzBuzz(int start, int end) {
        int len = end - start;
        String[] res = new String[len];
        for (int i = 0; i < len; i++) {
            int n = start + i;
            if (n % 15 == 0)      res[i] = "FizzBuzz";
            else if (n % 3 == 0)  res[i] = "Fizz";
            else if (n % 5 == 0)  res[i] = "Buzz";
            else                  res[i] = String.valueOf(n);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fizzBuzz(1, 6)));
        System.out.println(Arrays.toString(fizzBuzz(1, 8)));
        System.out.println(Arrays.toString(fizzBuzz(1, 11)));
    }
}
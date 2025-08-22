public class BiggerTwo {
        public int[] biggerTwo(int[] a, int[] b) {
            int sumA = a[0] + a[1];
            int sumB = b[0] + b[1];
            return (sumB > sumA) ? b : a;
        }

        public static void main(String[] args) {
            BiggerTwo bt = new BiggerTwo();
            int[] out = bt.biggerTwo(new int[]{1, 2}, new int[]{3, 4});
            System.out.println(out[0] + " " + out[1]); // 3 4
        }
    }

public class MiddleWay {
        public int[] middleWay(int[] a, int[] b) {
            return new int[]{a[1], b[1]};
        }

        public static void main(String[] args) {
            MiddleWay mw = new MiddleWay();
            int[] out = mw.middleWay(new int[]{1, 2, 3}, new int[]{4, 5, 6});
            System.out.println(out[0] + " " + out[1]); // 2 5
        }
    }


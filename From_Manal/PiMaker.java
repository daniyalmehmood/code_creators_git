public class PiMaker {
        public static int[] getPiDigits() {
            return new int[]{3, 1, 4};
        }

        public static void main(String[] args) {
            int[] pi =  getPiDigits();
            for (int digit : pi) {
                System.out.println(digit + "");
            }
        }
    }
  
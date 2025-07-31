public class DoubleXCounter {
        StringBuilder str;
        public static int doubleXCounter(String str) {
            int countXX = 0;
            for (int i = 0; i < str.length() -1 ; i++) {

                if (str.charAt(i) == 'x' && str.charAt(i+1)=='x') {
                    countXX++;
                }
            }
            return countXX;
        }
        public static void main(String [] args){
            System.out.println( DoubleXCounter.doubleXCounter("Hello"));
            System.out.println( DoubleXCounter.doubleXCounter("Hexxo"));
            System.out.println( DoubleXCounter.doubleXCounter("abc"));
            System.out.println(DoubleXCounter.doubleXCounter("Kittensxxx"));
            System.out.println( DoubleXCounter.doubleXCounter("abcxx"));
            System.out.println( DoubleXCounter.doubleXCounter("xxx"));
            System.out.println( DoubleXCounter.doubleXCounter("xxxx"));
        }
}


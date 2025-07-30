public class FrontTimes {
        public static void main(String[] args) {
            System.out.println(frontTimes("Chocolate", 2)); //"ChoCho"
            System.out.println(frontTimes("Chocolate", 3)); //"ChoChoCho"
            System.out.println(frontTimes("Abc", 3)); //"AbcAbcAbc"

        }

        public static String frontTimes(String str, int n) {
            String frontTimesString;

            if (str.length() < 3) {//if string is less than 3, print it as it is
                frontTimesString = str;
            }
            else {
                frontTimesString = str.substring(0, 3);
            }

            StringBuilder result = new StringBuilder();
            for (int i = 0; i < n; i++) {
                result.append(frontTimesString);
            }
            return result.toString();
        }
    }


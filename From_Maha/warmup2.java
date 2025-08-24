public class warmup2 {


    String stringTimes(String str, int n) {

        String result = "";
        for (int i = 0; i < n; i++) {
            result = result + str;
        }
        return result;

    }

    public String frontTimes(String str, int n) {


        String result = "";
        int strLength = Math.min(3, str.length());
        String strFront = str.substring(0, strLength);

        for (int i = 0; i < n; i++) {
            result = result + strFront;

        }
        return result;
    }

    int countXX(String str) {
        int xCount = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x') {
                xCount++;
            }
        }
        return xCount++;
    }

    boolean doubleX(String str) {
        int xIndex = str.indexOf('x');
        if (xIndex == -1 || xIndex + 1 >= str.length()) {
            return false;
        }
        return str.charAt(xIndex + 1) == 'x';
    }

    public String stringBits(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i += 2) {
            result = result + str.substring(i, i + 1);

        }
        return result;

    }

    public String stringSplosion(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = result + str.substring(0, i + 1);
        }
        return result;

    }

    public int last2(String str) {

        if (str.length() < 2) {
            return 0;

        }
        int count = 0;
        String lastTwo = str.substring(str.length() - 2);

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 2).equals(lastTwo)) {
                count++;
            }
        }

        return count;
    }

    public int arrayCount9(int[] nums) {
        //int []nums= new int[];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) {
                count++;
            }
        }
        return count;

    }

    public boolean arrayFront9(int[] nums) {

        int bounds = Math.min(nums.length, 4);
        for (int i = 0; i < bounds; i++) {
            if (nums[i] == 9) {
                return true;
            }
        }
        return false;

    }

    public boolean array123(int[] nums) {


        for (int i = 0; i < nums.length - 2; i++) {

            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                return true;
            }
        }
        return false;
    }

    public int stringMatch(String a, String b) {
        int count = 0;
        int bound = Math.min(a.length(), b.length());
        for (int i = 0; i < bound - 1; i++) {
            if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
                count++;
            }
        }
        return count;

    }

    public String stringX(String str) {

        if ((str.length() <= 2) || (str.equals(""))) {
            return str;
        }
        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length() - 1);
        String result = "";

        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) != 'x') {
                result = result + str.charAt(i);
            }
        }
        return firstChar + result + lastChar;
    }

    public String altPairs(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i += 4) {
            int min = Math.min(i + 2, str.length());
            result += str.substring(i, min);
        }

        return result;
    }

    public String stringYak(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
                i += 2;
            } else {
                result += str.charAt(i);
            }
        }
        return result;
    }

    public int array667(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if ((nums[i] == 6 && nums[i + 1] == 6) || (nums[i] == 6 && nums[i + 1] == 7)) {
                count++;
            }
        }
        return count;

    }

    public boolean noTriples(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2]) {
                return false;
            }
        }
        return true;
    }

    public boolean has271(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            int x = nums[i];
            if (nums[i + 1] == x + 5 && (Math.abs(nums[i + 2] - (x - 1)) <= 2)) {
                return true;
            }
        }
        return false;

    }
}

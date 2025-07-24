public class WarmupTwo {




    public static int last2(String str) {
        if (str.length() < 2) {
            return 0;
        }
        String endString = str.substring(str.length() - 2, str.length());
        int count = 0;
        String twoChar;
        for (int i = 0; i < str.length() - 2; i++) {
            twoChar = str.substring(i, i + 2);
            if (twoChar.equals(endString))
                count++;
        }
        return count;
    }

    public String frontTimes(String str, int n) {
        String frontString = "";
        int endIndex = 0;
        if (n <= 0) return frontString;
        else if (str.length() < 3) endIndex = str.length();
        else endIndex = 3;
        frontString = str.substring(0, endIndex);
        for (int i = 0; i < n - 1; i++)
            frontString += str.substring(0, endIndex);
        return frontString;

    }

    public String stringTimes(String str, int n) {
        if (n < 0) {
            return null;
        }
        StringBuilder newBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            newBuilder.append(str);
        }
        return newBuilder.toString();

    }

    int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x')
                count++;
        }
        return count;
    }

    boolean doubleX(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'x')
                if (str.charAt(i + 1) == 'x') return true;
                else break;
        }
        return false;
    }

    public String stringBits(String str) {
        String newString = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) newString += str.charAt(i);
        }
        return newString;
    }

    public String stringSplosion(String str) {
        String newString = "";
        for (int i = 0; i < str.length(); i++) {
            newString += str.substring(0, i + 1);
        }
        return newString;
    }

    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int i : nums)
            if (i == 9) count++;
        return count;

    }

    public boolean arrayFront9(int[] nums) {

        int arraySize = 4;
        if (arraySize > nums.length) arraySize = nums.length;
        for (int i = 0; i < arraySize; i++) {
            if (nums[i] == 9) return true;
        }
        return false;

    }

    public boolean array123(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++)
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3)
                return true;
        return false;
    }

    public int stringMatch(String a, String b) {
        int smallestLength = a.length();
        if (smallestLength > b.length())
            smallestLength = b.length();
        int count = 0;
        for (int i = 0; i < smallestLength - 1; i++) {
            if (a.substring(i, i + 2).equals(b.substring(i, i + 2)))
                count++;
        }
        return count;
    }

    public String stringX(String str) {
        String newString = "";
        for (int i = 0; i < str.length(); i++) {
            if ((i == 0 && str.charAt(i) == 'x') || (i == str.length() - 1 && str.charAt(i) == 'x'))
                newString += str.charAt(i);
            else if (str.charAt(i) == 'x') continue;
            else newString += str.charAt(i);
        }
        return newString;
    }

    public String altPairs(String str) {
        String newString = "";
        int index = 0;
        while (index < str.length()) {
            if (index + 2 > str.length()) newString += str.substring(index);
            else newString += str.substring(index, index + 2);
            index += 4;
        }
        return newString;
    }

    public String stringYak(String str) {
        String newString = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.length() > i + 2) {
                if (str.substring(i, i + 3).equals("yak")) {
                    i += 2;
                    continue;
                } else newString += str.charAt(i);
            } else newString += str.charAt(i);
        }
        return newString;
    }

    public int array667(int[] nums) {
        int count = 0;
        for (int index = 0; index < nums.length - 1; index++) {
            if (nums[index] == 6 && (nums[index + 1] == 6 || nums[index + 1] == 7))
                count++;
        }
        return count;
    }
    public boolean noTriples(int[] nums) {
        for(int index=0;index<nums.length-2;index++)
            if(nums[index]==nums[index+1] && nums[index+1]==nums[index+2])
                return false;
        return true;
    }



}




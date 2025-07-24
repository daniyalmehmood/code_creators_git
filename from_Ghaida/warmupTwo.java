public class warmupTwo{

	public static String stringTimes(String str, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(str);
        }
        return result.toString();
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
	
	public static int countXX(String str) {
        int count = 0;
        for(int i= 0; i < str.length() - 1; i++){
            if (str.substring(i, i + 2).equals("xx")) {
                count++;
            }
            }
        return count;
    }
	
	public static boolean doubleX(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'x') {
                return str.charAt(i + 1) == 'x';
            }
        }
        return false;
    }
	
	public static String stringBits(String str) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < str.length(); i+=2){
            result.append(str.charAt(i));
        }
        return result.toString();
    }
	
	public static String stringSplosion(String str) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i <= str.length(); i++){
            result.append(str.substring(0, i));
        }
        return result.toString();
    }
	
	public static int last2(String str) {
        if (str.length() < 2) {//string can't be less 2 character
            return 0;
        }
        String last2 = str.substring(str.length() - 2);
        int count = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 2).equals(last2)) {
                count++;
            }
        }
        return count;
    }
	
	public static int arrayCount9(int[] nums) {
        int count9 = 0;
        for (int num : nums){
            if(num == 9){
                count9++;
            }
        }
        return count9;
    }
	
	public static boolean arrayFront9(int[] nums) {
        int limit = Math.min(nums.length, 4);
        for (int i = 0; i < limit; i++){
            if(nums[i] == 9){
                return true;
            }
        }
        return false;
    }
	
	public static boolean array123(int[] nums) {
        for(int i = 0; i < nums.length - 2; i++){
            if(nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3){
                return true;
            }
        }
        return false;
    }
	
	public static int stringMatch(String a, String b) {
        int count = 0;
        int minLengthofStrings = Math.min(a.length(), b.length());//length should be same
        for (int i = 0; i < minLengthofStrings - 1; i++) {
            String subOfA = a.substring(i, i + 2);
            String subOfB = b.substring(i, i + 2);
            if (subOfA.equals(subOfB)) {
                    count++;
                }
            }
        return count;
    }
	
	public static String stringX(String str) {
        if (str.length() <= 2){
            return str;
        }
        StringBuilder newString = new StringBuilder();
        newString.append(str.charAt(0));
        for(int i = 1; i <str.length() - 1; i++){
            if(str.charAt(i) != 'x'){
                newString.append(str.charAt(i));
            }
        }
        newString.append(str.charAt(str.length() - 1));
        return newString.toString();
    }
	
	public static String altPairs(String str) {
        StringBuilder firstTwoIndex = new StringBuilder();
        for(int i = 0; i < str.length(); i += 4){
            firstTwoIndex.append(str.charAt(i));
            if(i + 1 < str.length()){
                firstTwoIndex.append(str.charAt(i+1));
            }
        }
        return firstTwoIndex.toString();
    }
	
	public static String stringYak(String str) {
        return str.replaceAll("yak", "");
    }
	
	public static int array667(int[] nums) {
        int count6 = 0;
        for (int i= 0; i < nums.length - 1; i++){
            if (nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7)) {
                count6++;
            }
        }
        return count6;
    }
	
	public static boolean noTriples(int[] nums) {
        for (int i= 0; i < nums.length - 2; i++){
            if (nums[i] == nums[i + 1] && nums[i] == nums[i+2]) {
                return false;
            }
        }
        return true;
    }
	
	public static boolean has271(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i + 1] == nums[i] + 5) {
                int num1 = nums[i] - 1;
                int num2 = nums[i + 2];
                if (Math.abs(num2 - num1) <= 2) {
                    return true;
                }
            }
        }
        return false;
    }
}
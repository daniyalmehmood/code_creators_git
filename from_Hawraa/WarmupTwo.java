public class WarmupTwo{

	public static String stringTimes(String str, int n) {
        StringBuilder newStr = new StringBuilder();
        for(int i = 0; i < n; i++){
            newStr.append(str);
        }
        return newStr.toString();
    }
	
	public static String frontTimes(String str, int n) {
        String front;
        if(str.length() < 3){
            front = str;
        }
        else {
            front = str.substring(0,3);
        }
        StringBuilder newStr = new StringBuilder();
        for(int i = 0; i < n; i++){
            newStr.append(front);
        }
        return newStr.toString();
    }
	
	static int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length() -1; i++) {
            if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x') {
                    count++;
                }
        }
        return count;
    }
	
	public static boolean doubleX(String str) {
        int i = str.indexOf("x");
        if (i + 1 >= str.length()) {
            return false;
        }
        return str.substring(i + 1, i + 2).equals("x");
	}
	
	public static String stringBits(String str) {
        String newStr = "";
        for (int i =0; i<str.length(); i+=2){
            newStr = newStr + str.substring(i, i+1);
        }
        return newStr;
    }
	
	public static String stringSplosion(String str) {
        String newStr = "";
        for (int i =0; i<str.length(); i++){
            newStr = newStr + str.substring(0, i+1);
        }
        return newStr;
    }
	
	public static int last2(String str) {
        if(str.length() < 2){
            return 0;
        }
        int count = 0;
        String lastCh = str.substring(str.length() - 2);

        for (int i = 0; i < str.length()-2; i++){
            String chars = str.substring(i, i+2);
            if(chars.equals(lastCh)){
                count++;
            }
        }
        return count;
    }
	
	public static int arrayCount9(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] == 9){
                count++;
            }
        }
        return count;
    }
	
	public static boolean arrayFront9(int[] nums) {
        int array = nums.length;
        if (array > 4) {
            array = 4;
        }
        for (int i =0; i < array; i++){
            if(nums[i] == 9){
                return true;
            }
        }
        return false;
    }
	
	public static boolean array123(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++){
            if (nums[i] == 1 && nums[i +1] == 2 && nums[i+2] ==3){
                return true;
            }
        }
        return false;
    }
	
	public static int stringMatch(String a, String b) {
        int len = Math.min(a.length(), b.length());
        int count = 0;
        for (int i = 0; i < len - 1; i++) {
            String subA = a.substring(i, i + 2);
            String subB = b.substring(i, i + 2);

            if (subA.equals(subB)) {
                count++;
            }
        }
        return count;
    }
	
	public static String stringX(String str) {
        String newStr = "";
        for(int i = 0; i < str.length(); i++){
            if(!(i > 0 && i < (str.length() - 1) && str.substring(i, i+1).equals("x"))){
                newStr = newStr + str.substring(i, i+1);
            }
        }
        return newStr;
    }
	
	public static String altPairs(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i+=4){
            int strCh = i + 2;
            if(strCh > str.length()){
                strCh = str.length();
            }
            newStr = newStr + str.substring(i, strCh);
        }
        return newStr;
    }
	
	public static String stringYak(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++){
            if (i+2 < str.length() && str.charAt(i) == 'y' && str.charAt(i+2) == 'k'){
                i = i + 2;
            }
            else {
                newStr = newStr + str.charAt(i);
            }
        }
        return newStr;
    }
	
	public static int array667(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++){
            if((nums[i] == 6 && nums[i + 1] == 6) || (nums[i] == 6 && nums[i + 1] == 7)){
                count++;
            }
        }
        return count;
    }
	
	public static boolean noTriples(int[] nums) {
        for (int i = 0; i < nums.length -2; i++){
            if (nums[i] == nums[i + 1] && nums[i + 2] == nums[i]){
                return false;
            }
        }
        return true;
    }
	
	public static boolean has271(int[] nums) {
        for (int i =0; i < nums.length - 2; i++){
            if(nums[i+1] == nums[i] + 5 && Math.abs(nums[i + 2] - (nums[i] - 1)) <= 2){
                return true;
            }
        }
        return false;
    }
}
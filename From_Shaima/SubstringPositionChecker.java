public class SubstringPositionChecker {
    public static boolean isXyzMiddle(String str) {
        if (str.equals("xyz")) return true;

        for (int i = 0; i < str.length()-3; i++) { //use for loop to go through 'str'
            if (str.substring(i,i+3).equals("xyz")){ //check if the 'str' contain "xyz"
                int beforeChar=i; // initialize a variable hold the index of 'x'
                int afterChar=str.length()-(i+3); // initialize a variable hold the length after 'z'
                if (Math.abs(beforeChar-afterChar)<=1){ // check if before variable is < = 1
                    return true;//while the condition is true
                }
            }
        }
        return false; // the beforeChar-afterChar is not 0 or 1
    }
    public static void main(String[] args) {
        System.out.println(isxyzMiddle("AAxyzBB"));
    }
}

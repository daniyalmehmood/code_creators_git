public class StringE {
    public static void main(String[] args) {
        System.out.println(stringE("Hello"));    // true
        System.out.println(stringE("Heelle"));   // true
        System.out.println(stringE("Heelele"));  // false
    }
    
    public static boolean stringE(String str) {
        int countEInString = 0;  // Initialize counter to 0
        
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'e') {
                countEInString++;  // Increment count when 'e' is found
            }
        }
        
        // check if the string contains between 1 and 3 'e' characters (inclusive).
        if(countEInString >= 1 && countEInString <= 3) {
            return true;
        }
		else{
            return false;
        }
    }
}

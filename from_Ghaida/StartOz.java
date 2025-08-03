public class StartOz{
	public static  void main(String[] args){
		System.out.println(startOz("ozymandias")); //"oz"
		System.out.println(startOz("bzoo")); //"z"
		System.out.println(startOz("oxx")); //"o"

	}
	
	 public static String startOz(String str) {
        String newString = ""; // Initialize an empty newString string
        
        // Check the first character is "o"
        if (str.length() > 0 && str.charAt(0) == 'o') {
            newString += 'o'; // Include 'o' if it is the first character
        }
        
        // Check the second character is "z"
        if (str.length() > 1 && str.charAt(1) == 'z') {
            newString += 'z'; // Include 'z' if it is the second character
        }
        
        return newString;
    }
}
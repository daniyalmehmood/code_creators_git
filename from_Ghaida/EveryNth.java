public class EveryNth {
    public static void main(String[] args) {
        System.out.println(everyNth("Miracle", 2)); //"Mrce"
        System.out.println(everyNth("abcdefg", 2)); //"aceg"
        System.out.println(everyNth("abcdefg", 3)); //"adg"
    }
    
    public static String everyNth(String str, int n){
		if (str == null || str.isEmpty() || n < 1) {
            return "Invalid (n) Value";
        }
		
		StringBuilder newString = new StringBuilder();
        for(int i = 0; i < str.length(); i += n){
			newString.append(str.charAt(i));
		}
		return newString.toString();
    }
}

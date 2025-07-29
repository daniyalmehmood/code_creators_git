public class everyNth {
    public static String everyNth(String str, int n) {
		
		 if (n < 1) {
            return "the value of N should be more than or equal 1";
		 }
        String result = "";

        for (int i = 0; i < str.length(); i += n) {
            result += str.charAt(i);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(everyNth("Miracle", 2));  
        System.out.println(everyNth("abcdefg", 2)); 
        System.out.println(everyNth("abcdefg", 3));  
    }
}

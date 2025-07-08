public class backAround {
    public static void main(String[] args) {
 
        System.out.println(backAround("cat"));    
        System.out.println(backAround("Hello"));  
        System.out.println(backAround("a"));      
    }
	public static String backAround(String str) {
        String lastLetter;
        String newString;
	

        if (str.length() >= 1) {
            lastLetter = str.substring(str.length() - 1);
            newString = lastLetter + str + lastLetter;
        } else {
            newString = str;
        }

        return newString;
    }
}
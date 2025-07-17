public class EndUp {
    public static void main(String[] args) {
        System.out.println(endUp("Hello"));    // "HeLLO"
        System.out.println(endUp("hi there"));    // "hi thERE"
        System.out.println(endUp("hi"));    // "HI"


    }
    
    public static String endUp(String str){
        if(str.length() < 3){
			return str.toUpperCase();
		}
		else{
			String lowerCase = str.substring(0, str.length() - 3);
			String upperCase = str.substring(str.length() - 3);
			
			String endUpString = lowerCase + upperCase.toUpperCase();
			return endUpString;
		}
    }
}

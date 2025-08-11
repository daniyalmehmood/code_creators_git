public class frontBack{
    public static void main(String[] args) {
        System.out.println(frontBack("code"));  
        System.out.println(frontBack("a"));     
        System.out.println(frontBack("ab"));    
    }

    public static String frontBack(String str) {
        String newString;

        if (str.length() <= 1) {
            newString = str;
        } else {
            char first = str.charAt(0);
            char last = str.charAt(str.length() - 1);
            String middle = str.substring(1, str.length() - 1);
            newString = last + middle + first;
        }

        return newString;
    }
}

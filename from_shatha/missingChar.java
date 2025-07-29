public class missingChar {
    public static void main(String[] args) {
       
        System.out.println(missingChar("kitten", 1));  
        System.out.println(missingChar("kitten", 0)); 
        System.out.println(missingChar("kitten", 4));  
    }

    public static String missingChar(String str, int n) {
        String newString;

        if (n >= 0 && n < str.length()) {
            String front = str.substring(0, n);
            String back = str.substring(n + 1);
            newString = front + back;
        } else {
            newString = str;
        }
        return newString;
    }
}

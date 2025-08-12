public class BackAround {
    public static void main(String[] args) {
        System.out.println(backAround("cat"));    
        System.out.println(backAround("Hello"));  
        System.out.println(backAround("a"));      
    }

    public static String backAround(String str) {
        String lastChar;
        String result;

        if (str.length() >= 1) {
            lastChar = str.substring(str.length() - 1);
            result = lastChar + str + lastChar;
        } else {
            result = str;
        }

        return result;
    }
}

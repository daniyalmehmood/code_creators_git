public class ZipZap {

    public static String zipZap(String str) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            // Check if there's enough chars for a 3-length substring starting at i
            if (i <= str.length() - 3 &&
                    str.charAt(i) == 'z' &&
                    str.charAt(i + 2) == 'p') {
                result.append('z').append('p');
                i += 3; 
            } else {
                result.append(str.charAt(i));
                i++;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(zipZap("zipXzap"));      
        System.out.println(zipZap("zopzop"));       
        System.out.println(zipZap("zzzopzop"));    
    }
}
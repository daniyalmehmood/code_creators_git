public class IsNotReplacer {
    // Method to replace whole word "is" with "is not"
    public static String replaceIsWithIsNot(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (i <= text.length() - 2 && text.substring(i, i + 2).equals("is")) {
                
                boolean hasLetterBefore = (i > 0 && Character.isLetter(text.charAt(i - 1)));
                boolean hasLetterAfter = (i + 2 < text.length() && Character.isLetter(text.charAt(i + 2)));
                if (!hasLetterBefore && !hasLetterAfter) {
                    result.append("is not");
                    i += 1; 
                    continue;
                }
            }
            result.append(text.charAt(i));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(replaceIsWithIsNot("is test"));      
        System.out.println(replaceIsWithIsNot("is-is"));       
        System.out.println(replaceIsWithIsNot("This is right")); 
        System.out.println(replaceIsWithIsNot("This island"));   
    }
}
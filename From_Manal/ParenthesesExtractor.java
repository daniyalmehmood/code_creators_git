public class ParenthesesExtractor {

    // Recursive method to return the first parentheses and its contents
    public String extractParentheses(String text) {
        // If the string starts with '(' and ends with ')', return it
        if (text.charAt(0) == '(' && text.charAt(text.length() - 1) == ')') {
            return text;
        }

        // If the first character is not '(', remove it and recurse
        if (text.charAt(0) != '(') {
            return extractParentheses(text.substring(1));
        }

        // If the last character is not ')', remove it and recurse
        if (text.charAt(text.length() - 1) != ')') {
            return extractParentheses(text.substring(0, text.length() - 1));
        }

        return text;
    }

  
    public static void main(String[] args) {
        ParenthesesExtractor extractor = new ParenthesesExtractor();

        System.out.println(extractor.extractParentheses("xyz(abc)123"));  
        System.out.println(extractor.extractParentheses("x(hello)"));     
        System.out.println(extractor.extractParentheses("(xy)1"));        
    }
}
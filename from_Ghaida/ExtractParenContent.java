public class ExtractParenContent {//Recursion-1 > parenBit
    public static void main(String[] args) {
        System.out.println(findParenSubstring("xyz(abc)123"));// → "(abc)"
        System.out.println(findParenSubstring("x(hello)"));// → "(hello)"
        System.out.println(findParenSubstring("(xy)1"));// → "(xy)"
    }
    public static String findParenSubstring(String str) {
        if(str.length() <= 1){
            return "";
        }
        if(str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')'){
            return str;
        }
        if(str.charAt(0) == '('){
            return findParenSubstring(str.substring(0, str.length() - 1));
        }
        return findParenSubstring(str.substring(1));
    }
}
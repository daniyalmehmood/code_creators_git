public class CountTriple {
    public static void main(String[] args) {
        System.out.println(countTripleInStr("abcXXXabc"));// → 1
        System.out.println(countTripleInStr("xxxabyyyycd"));// → 3
        System.out.println(countTripleInStr("a"));// → 0
    }
    public static int countTripleInStr(String str) {
        int countTriples = 0;
        if(str.length() < 3){
            return countTriples;
        }
        for (int i = 0; i < str.length()-2; i++) {
            if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2)) {
                countTriples++;
            }
        }
        return countTriples;
    }
}
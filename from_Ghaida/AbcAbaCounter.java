public class AbcAbaCounter {//Recursion-1 > countAbc
    public static void main(String[] args) {
        System.out.println(countAbcAbaPatterns("abc"));// → 1
        System.out.println(countAbcAbaPatterns("abcxxabc"));// → 2
        System.out.println(countAbcAbaPatterns("abaxxaba"));// → 2
    }
    public static int countAbcAbaPatterns(String str) {
        if(str.length() <= 2){
            return 0;
        }
        if(str.substring(0, 3).equals("abc") || str.substring(0, 3).equals("aba")){
            return 1 + countAbcAbaPatterns(str.substring(2));
        }
        return countAbcAbaPatterns(str.substring(1));
    }
}
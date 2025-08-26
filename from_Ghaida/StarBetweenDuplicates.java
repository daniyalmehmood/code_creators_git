public class StarBetweenDuplicates {//Recursion-1 > pairStar
    public static void main(String[] args) {
        System.out.println(insertStarBetweenPairs("hello"));// → "hel*lo"
        System.out.println(insertStarBetweenPairs("xxyy"));// → "x*xy*y"
        System.out.println(insertStarBetweenPairs("aaaa"));// → "a*a*a*a"
    }
    public static String insertStarBetweenPairs(String str) {
        if(str.length() <= 1){
            return str;
        }
        if(str.charAt(0) == str.charAt(1)){
            return str.charAt(0) + "*" + insertStarBetweenPairs(str.substring(1));
        }
        return str.charAt(0) + insertStarBetweenPairs(str.substring(1));
    }
}
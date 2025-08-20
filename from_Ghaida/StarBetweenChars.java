public class StarBetweenChars {//Recursion-1 > allStar
    public static void main(String[] args) {
        System.out.println(addStarsBetweenChars("hello"));// → "h*e*l*l*o"
        System.out.println(addStarsBetweenChars("abc"));// → "a*b*c"
        System.out.println(addStarsBetweenChars("ab"));// → "a*b"
    }
    public static String addStarsBetweenChars(String str) {
        if(str.length() <= 1){
            return str;
        }
        return str.charAt(0) + "*" + addStarsBetweenChars(str.substring(1));
    }
}
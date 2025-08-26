public class SuffixChecker {
    public static void main(String[] args){
        System.out.println(endsWithLy("oddly"));// → true
        System.out.println(endsWithLy("y")); // → false
        System.out.println(endsWithLy("oddy")); // → false
    }
    public static boolean endsWithLy(String str) {
        if(str.length() >= 2){
            return str.substring(str.length() - 2).equals("ly");
        }
        return false;
    }
}

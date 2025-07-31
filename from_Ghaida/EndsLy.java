public class EndsLy {
    public static void main(String[] args){
        System.out.println(endsLy("oddly"));// → true
        System.out.println(endsLy("y")); // → false
        System.out.println(endsLy("oddy")); // → false
    }
    public static boolean endsLy(String str) {
        if(str.length() >= 2){
            return str.substring(str.length() - 2).equals("ly");
        }
        return false;
    }
}

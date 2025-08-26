public class StringFrontChecker {
    public static void main(String[] args) {
        System.out.println(hasSameFrontAndBack("edited")); //true
        System.out.println(hasSameFrontAndBack("edit")); //false
        System.out.println(hasSameFrontAndBack("ed")); //true
    }
    public static boolean hasSameFrontAndBack(String str) {
        if (str == "") {
            return false;
        }
        else if(str.length() < 2){
            return false;
        }
        else if (str.substring(0, 2).equals(str.substring(str.length()-2))) {
            return true;
        }
        return false;
    }
}

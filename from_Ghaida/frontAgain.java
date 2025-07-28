public class frontAgain {
    public static void main(String[] args) {
        System.out.println(frontAgain("edited")); //true
        System.out.println(frontAgain("edit")); //false
        System.out.println(frontAgain("ed")); //true
    }
    public static boolean frontAgain(String str) {
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

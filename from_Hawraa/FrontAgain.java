public class FrontAgain {
    public static boolean frontAgain(String str) {
        if(str.length() >= 2){
            return str.substring(0,2).equals(str.substring(str.length()-2));
        }
        return false;
    }

    public static void main(String[] args){
        System.out.println(frontAgain("edited"));
        System.out.println(frontAgain("edit"));
        System.out.println(frontAgain("ed"));
    }
}

public class frontAgain {
    public static boolean frontAgain(String str) {
        if (str.length() < 2) {
            return false;
        }
 String first=str.substring(0,2);
 String last=str.substring(str.length()-2);
    return first.equals(last);
}
public static void main (String[]args){
    System.out.println(frontAgain("edited"));
    System.out.println(frontAgain("edit"));
    System.out.println(frontAgain("ed"));

}
}
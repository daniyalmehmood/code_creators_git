public class FrontAgain {
    public static boolean hasSameStartAndEnd(String str) {
        if (str.length() < 2) {
            return false;
        }
 String first=str.substring(0,2);
 String last=str.substring(str.length()-2);
    return first.equals(last);
}
public static void main (String[]args){
    System.out.println(hasSameStartAndEnd("edited"));
    System.out.println(hasSameStartAndEnd("edit"));
    System.out.println(hasSameStartAndEnd("ed"));

}
}
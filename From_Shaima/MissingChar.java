public class  MissingChar {
    public static String missingChar(String str, int n) {
        String FirstIndex ;
        String LastIndex ;
        String NewStr;
        if (!str.isEmpty() && 0 <= n && n< str.length()) {
            FirstIndex = str.substring(0, n);
            LastIndex = str.substring(n + 1);
            NewStr = FirstIndex + LastIndex;
            return NewStr;
        } else {
            return "str is empty  or n is less than 0";
        }
    }

    public static void main(String[] args) {
        System.out.println(MissingChar.missingChar("kitten",1));
        System.out.println(MissingChar.missingChar("kitten",0));
        System.out.println(MissingChar.missingChar("kitten",4));
        System.out.println(MissingChar.missingChar("kitten",-2));
        System.out.println(MissingChar.missingChar("",4));
    }
}
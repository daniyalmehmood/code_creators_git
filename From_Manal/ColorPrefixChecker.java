public class ColorPrefixChecker {
    public static String getStringColor(String str) {
        //check if the string starts with  "red"
        if(str.length() >= 3 && str.substring(0, 3).equals("red")) {
            return "red";
        }
        //check if the string starts with "blue"
        else if (str.length() >= 4 && str.substring(0,4).equals("blue")) {
            return "blue";
        }
        //otherwise return the empty string
        else {
            return "";
        }
    }
    public static void main(String[] args) {
        System.out.println(getStringColor("redxx"));
        System.out.println(getStringColor("xxred"));
        System.out.println(getStringColor("blueTimes"));
    }
}

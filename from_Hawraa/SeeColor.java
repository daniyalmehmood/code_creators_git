public class SeeColor {
    public static String seeColor(String str) {
        if (str.length() >= 4 && str.substring(0, 4).equals("blue")) {
            return "blue";
        } else if (str.length() >= 3 && str.substring(0, 3).equals("red")) {
            return "red";
        } else {
            return "";
        }
    }

    public static void main(String[] args){
        System.out.println(seeColor("redxx"));
        System.out.println(seeColor("xxred"));
        System.out.println(seeColor("blueTimes"));
    }
}

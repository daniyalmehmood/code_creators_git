public class SeeColor {
    public static void main(String[] args) {
        System.out.println(seeColor("redxx")); //"red"
        System.out.println(seeColor("xxred")); //""
        System.out.println(seeColor("blueTimes")); //"blue"
    }
    public static String seeColor(String str) {
        if(str.startsWith("red")){
            return "red";
        }
        else if (str.startsWith("blue")){
            return "blue";
        }
        return "";
    }
}

public class ColorChecker {
    public String getStartingColor(String str) {
        if(str.startsWith( "red")){
            return str.substring(0,3);

        }
        if (str.startsWith("blue")) {
            return str.substring(0,4);

        }
        return "";
    }

}

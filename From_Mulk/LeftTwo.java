public class LeftTwo {
    public String rotateLeftByTwo(String str) {
        if (str.length() >= 2) {
            return str.substring(2) + str.substring(0, 2);
        } else {
            return "";
        }
    }
} 



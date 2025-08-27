//Recursion-1 > noX


public class XRemover {
    public String RemoveX(String str) {

        if (str.length() == 0) {
            return str;
        }
        char firstChar = str.charAt(0);

        if (firstChar == 'x') {
            return noX(str.substring(1));
        }

        return String.valueOf(firstChar) + noX(str.substring(1));
    }

}
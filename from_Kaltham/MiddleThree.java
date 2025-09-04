public class MiddleThree {
    public String middleThree(String str) {
        String strWithoutSpace = str.replaceAll("\\s+", ""); //It remove white space from String
        int lengthOfStrWithoutSpace = strWithoutSpace.length() / 2;

        if (strWithoutSpace.length() == 3) {
            return str;
        } else {
            return strWithoutSpace.substring(lengthOfStrWithoutSpace - 1, lengthOfStrWithoutSpace + 2);
        }

    }
}
//Recursion-1 > allStar

public class StarInserter {
    public String addStarsBetweenChars(String str) {
        if (str.length() <= 1) {
            return str;
        }

        char firstChar = str.charAt(0);

        return firstChar + "*" + addStarsBetweenChars(str.substring(1));

    }
}
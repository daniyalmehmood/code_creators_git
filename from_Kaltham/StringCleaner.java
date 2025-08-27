//Recursion-1 > stringClean

public class StringCleaner {
    public String removeAdjacentDuplicates(String str) {
        if (str.length() <= 1) {
            return str;
        }
        if (str.charAt(0) == str.charAt(1)) {
            return removeAdjacentDuplicates(str.substring(1));
        }
        return str.charAt(0) + removeAdjacentDuplicates(str.substring(1));

    }

}
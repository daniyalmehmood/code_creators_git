public class DuplicateSeparator {
    public String insertStarBetweenDuplicates(String str) {
        if (str.length() <= 1) {
            return str;
        } else {
            if (str.charAt(0) == str.charAt(1)) {
                return str.charAt(0) + "*" + insertStarBetweenDuplicates(str.substring(1));
            } else {
                return str.charAt(0) + insertStarBetweenDuplicates(str.substring(1));
            }


        }
    }

}


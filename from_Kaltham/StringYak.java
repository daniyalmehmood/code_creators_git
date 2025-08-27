public class StringYak {
    public String removeYakSubstrings(String str) {
        StringBuilder newstr = new StringBuilder(str);
        for (int i = 0; i < newstr.length() - 2; i++ ) {
            if (newstr.substring(i, i + 3).equals("yak")) {
                newstr.delete(i, i + 3);
            } 
        }
        return newstr.toString();
    }

}
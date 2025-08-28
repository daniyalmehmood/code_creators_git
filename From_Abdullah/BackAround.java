public class BackAround {
    public String wrapWithLastChar(String str) {

        String lastchar;
        lastchar=str.substring (str.length()-1);

        return lastchar + str + lastchar;
    }
}

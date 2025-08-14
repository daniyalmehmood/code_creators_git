public class WithoutXTwo {

    public String removeXFromFirstTwo(String str) {
        String result = "";

        if (str.length()>=1 && str.charAt(0)!=('x')) {
            result += str.charAt(0);
        }
        if (str.length()>=2 && str.charAt(1) != ('x')) {
            result+= str.charAt(1);
        }
        if (str.length() > 2) {
            result += str.substring (2);
        }
        return result;
    }

}

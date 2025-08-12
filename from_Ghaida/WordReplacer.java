public class WordReplacer {
    public static void main(String[] args) {
        System.out.println(replaceIsWithIsNot("is test"));//"is not test"
        System.out.println(replaceIsWithIsNot("is-is"));// → "is not-is not"
        System.out.println(replaceIsWithIsNot("This is right"));// → "This is not right"
    }
    public static String replaceIsWithIsNot(String str) {
        String resultAfterAddingNot = "";
        for (int i = 0; i < str.length(); i++) {
            if(i-1 >= 0 && Character.isLetter(str.charAt(i-1)) || i+2 < str.length() && Character.isLetter(str.charAt(i+2))) {
                resultAfterAddingNot += str.charAt(i);
            }
            else if(i+1 < str.length() && str.substring(i, i+2).equals("is")) {
                resultAfterAddingNot += "is not";
                i++;
            }
            else {
                resultAfterAddingNot += str.charAt(i);
            }
        }
        return resultAfterAddingNot;
    }
}

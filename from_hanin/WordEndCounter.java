public class WordEndCounter {
    public static int countWordsEndingInYorZ(String str) {
       int count =0;
        str = str.toLowerCase();
        for (int i=0;i<str.length(); i++) {
            if (i == str.length() - 1 || !Character.isLetter(str.charAt(i + 1))) {
// This means it's the end of a word!
                if (str.charAt(i) == 'y'|| str.charAt(i) == 'z') {
                    count++;
                }
            }
        }
        return count;
    }

}

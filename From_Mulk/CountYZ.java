public class CountYZ {
    public int countWordsEndingInYOrZ(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) == 'z' || str.charAt(i) == 'y')
                    && (i == str.length() - 1 || !Character.isLetter(str.charAt(i + 1)))) {
                count++;
            }
        }
        return count;
    }
}




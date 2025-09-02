public class WordEndCounter {
    public static int countWordsEndingInYOrZ(String str) {
        int count = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == 'y' || c == 'z') {
                if (i == str.length() - 1 || !Character.isLetter(str.charAt(i + 1))) {
                    count++;
                }
            }
        }

        return count;
    }

public static void main(String arg[]){
    System.out.println(countWordsEndingInYOrZ("fez day"));
    System.out.println(countWordsEndingInYOrZ("day fez"));
    System.out.println(countWordsEndingInYOrZ("day fyyyz"));
}
}
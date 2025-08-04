import java.util.Arrays;

public class CountYZ {
    public static void main(String[] args) {
        System.out.println(countYZInStr("fez day")); //2
        System.out.println(countYZInStr("day fez")); //2
        System.out.println(countYZInStr("day fyyyz")); //2
    }
    public static int countYZInStr(String str) {
        int countYZ = 0;
        String[] splitStringToWords = str.split("\\s+");//split by space
        for (String word : splitStringToWords) { // go through each word
            if (!word.isEmpty()) { // check that the word is not empty
                char lastCharFromWord = Character.toLowerCase(word.charAt(word.length() - 1)); // last character of the word
                // Check if the last character is 'y' or 'z'
                if (lastCharFromWord == 'y' || lastCharFromWord == 'z') {
                    countYZ++; // if the last character is 'y' or 'z' --> add them to countYZ
                }
            }
        }
        return countYZ;
    }
}
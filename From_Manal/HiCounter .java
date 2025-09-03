public class HiCounter {
    public static int countOccurrencesOfHi(String text) {
        int occurrences = 0;
        // Loop through the string, stopping 1 character before the end
        for (int index = 0; index < text.length() - 1; index++) {
            // Get a substring of 2 characters starting at the current index
            String twoCharacters = text.substring(index, index + 2);
            if (twoCharacters.equals("hi")) {
                occurrences++;
            }
        }
        return occurrences;
    }

    public static void main(String[] args) {
        System.out.println(countOccurrencesOfHi("abc hi ho")); 
        System.out.println(countOccurrencesOfHi("ABChi hi"));  
        System.out.println(countOccurrencesOfHi("hihi"));     
    }
}
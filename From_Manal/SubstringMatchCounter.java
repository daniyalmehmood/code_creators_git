public class SubstringMatchCounter {
//this function counts how many last2 characters appear in the string
    public static int countMatchingLastTwo(String str) {
//if the string shorter less than two characters, there is no possible match

        if (str.length() < 2) {
            return 0;
        }
//get the last two characters from the string
        String lastTwoChar = str.substring(str.length() - 2);
        int count = 0;
//Loop through the string, stopping two characters befor the end
        for (int i = 0; i < str.length() - 2; i++) {
            String currentPair = str.substring(i, i + 2);
            if (currentPair.equals(lastTwoChar)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countMatchingLastTwo("hixxhi"));
        System.out.println(countMatchingLastTwo("xaxxaxaxx"));
        System.out.println(countMatchingLastTwo("axxxaaxx"));
    }
}
public class LongestCharacterBlock {
    public static void main(String[] args) {
        System.out.println(findLongestBlock("hoopla"));// → 2
        System.out.println(findLongestBlock("abbCCCddBBBxx"));// → 3
        System.out.println(findLongestBlock(""));// → 0
    }
    public static int findLongestBlock(String str) {
        int maxBlock = 0;
        int currentBlock = 1; // Start with a block of at least 1
        if (str.isEmpty()) {
            return 0;
        }
        for (int i = 1; i < str.length(); i++) {//checks each blocks in str
            if (str.charAt(i) == str.charAt(i - 1)) {
                currentBlock++;
            }
            else {
                if (currentBlock > maxBlock) {
                    maxBlock = currentBlock;
                }
                currentBlock = 1; // set currentBlock for the new character
            }
        }
        return Math.max(maxBlock, currentBlock);
    }
}

public class LargestBlockFinder {
    // Method to find the length of the largest block in a string
    public static int findLargestBlock(String str) {
        if (str == null || str.isEmpty()) {
            return 0; 
        }
        int maxBlockLength = 1; 
        int currentBlockLength = 1;

        // Loop through the string from the second character
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                //  increase block length
                currentBlockLength++; 
            } else {
                // Different char, reset current block length
                currentBlockLength = 1; 
            }
            if (currentBlockLength > maxBlockLength) {
                maxBlockLength = currentBlockLength;
            }
        }

        return maxBlockLength;
    }

    public static void main(String[] args) {
        System.out.println(findLargestBlock("hoopla"));
        System.out.println(findLargestBlock("abbCCCddBBBxx"));
        System.out.println(findLargestBlock("")); 
    }
}
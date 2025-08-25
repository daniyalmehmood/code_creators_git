public class TriangleBlocksCalculator {

    // Function to calculate total blocks in a triangle with given rows
    public static int calculateTotalBlocks(int numberOfRows) {
        // Base case: no rows → no blocks
        if (numberOfRows == 0) {
            return 0;
        }
        //  blocks in current row + blocks in previous rows
        return numberOfRows + calculateTotalBlocks(numberOfRows - 1);
    }

    public static void main(String[] args) {
        System.out.println(calculateTotalBlocks(0));
        System.out.println(calculateTotalBlocks(1));
        System.out.println(calculateTotalBlocks(2));

    }
}
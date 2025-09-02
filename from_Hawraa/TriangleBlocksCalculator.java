// Recursion-1 > triangle
public class TriangleBlocksCalculator {
    public int getTotalTriangleBlocks(int rows) {
        if (rows == 0) {
            return 0;
        }
        return rows + getTotalTriangleBlocks(rows - 1);
    }
}
public class TriangleBlocks {
    public int getNumberOfBlocks(int rows) {
        if (rows == 0 || rows == 1) return rows;
        return rows + getNumberOfBlocks(rows - 1);
    }

}

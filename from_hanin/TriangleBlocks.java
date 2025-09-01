//Recursion-1 > triangle
public class TriangleBlocks {
    public int countBlocks(int rows) {
        if (rows == 0) {
            return 0;
        }
        return rows + countBlocks(rows - 1);
    }

}

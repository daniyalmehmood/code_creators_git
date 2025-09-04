//Recursion-1 > triangle


public class TriangleNumberCalculator {
    public int calculateTriangleNumber(int rows) {
        if (rows == 0) {
            return 0;
        }
        return rows + calculateTriangleNumber(rows - 1);
    }
}
public class TriangularSum {//Recursion-1 > triangle
    public static void main(String[] args) {
        System.out.println(calculateTriangle(0));// → 0
        System.out.println(calculateTriangle(1));// → 1
        System.out.println(calculateTriangle(2));// → 3
    }
    public static int calculateTriangle(int rows) {
        if(rows == 0){
            return 0;
        }
        return rows + calculateTriangle(rows - 1);
    }
}
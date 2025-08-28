public class InOrderChecker {
    public static boolean numberInOrder(int a, int b, int c, boolean bOk) {
        if (bOk) {
            return b<c;
        }
        return b>a && b<c;
    }
    public static void main(String[] args) {
        System.out.println(numberInOrder(1,2,4,false));
    }
}

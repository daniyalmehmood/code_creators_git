public class InOrderEqualChecker {
    public static boolean numberSequenceValidator(int a, int b, int c, boolean equalOk) {
        if (equalOk)  return a<=b && b<=c;
        return a<b && b<c;
    }
    public static void main(String[] args) {
        System.out.println(numberSequenceValidator(2,5,11,false));
    }
}

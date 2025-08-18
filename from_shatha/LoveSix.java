public interface LoveSix {
    public static boolean checkSixMatch(int a, int b) {
        if (a == 6 || b == 6 || (a + b) == 6 || Math.abs(a-b) == 6) {
            return true;
        } else {
            return false;
        }
    }
    public static void main (String[] args){
        System.out.println(checkSixMatch(6,4));
        System.out.println(checkSixMatch(4,5));
        System.out.println(checkSixMatch(1,5));
}
}
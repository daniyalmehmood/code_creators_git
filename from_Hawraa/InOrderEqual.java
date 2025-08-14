public class InOrderEqual {
    public static boolean isInOrderOrEqual(int a, int b, int c, boolean equalOk) {
        if(equalOk && a <= b && b <= c){
            return true;
        }
        return a < b && b < c;
    }

    public static void main(String[] args){
        System.out.println(isInOrderOrEqual(2, 5, 11, false));
        System.out.println(isInOrderOrEqual(5, 7, 6, false));
        System.out.println(isInOrderOrEqual(5, 5, 7, true));
    }
}

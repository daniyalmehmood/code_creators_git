public class InOrder {
    public static boolean isInOrder(int a, int b, int c, boolean bOk) {
        if(bOk && b < c ){
            return true;
        }
        return a < b && b < c;
    }

    public static void main(String[] args){
        System.out.println(isInOrder(1, 2, 4, false));
        System.out.println(isInOrder(1, 2, 1, false));
        System.out.println(isInOrder(1, 1, 2, true));
    }
}

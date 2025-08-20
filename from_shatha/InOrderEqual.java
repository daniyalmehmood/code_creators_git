public class InOrderEqual {
    public static boolean increasingOrder(int a, int b, int c, boolean equalOk) {
        if (equalOk){
            return (c>=b && b>=a);
        }
        else{
            return (b>a) && (c>b);
        }
    }
    public static void main (String[] args){
        System.out.println(increasingOrder(2, 5, 11,false));
        System.out.println(increasingOrder(5, 7, 6, false));
        System.out.println(increasingOrder(5, 5, 7, true));
    }

}

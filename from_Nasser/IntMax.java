public class IntMax {

    public static int intMax(int a ,int b, int c){

        return Math.max(a, Math.max(b, c));

    }

    public static void main(String[] args){

        System.out.println(intMax(1,3,5));
        System.out.println(intMax(1,8,5));
        System.out.println(intMax(6,3,5));
    }
}

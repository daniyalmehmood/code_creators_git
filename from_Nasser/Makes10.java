public class Makes10 {
    public static boolean makes10(int a,int b){

        if(a==10 || b==10|| (a+b)==10) {
            return true;

        }
        else {
            return false;

        }
    }
    public static void main(String[] args){

        System.out.println("case 1\t"+makes10(9,10));
        System.out.println("case 2\t"+makes10(9,9));
        System.out.println("case 1\t"+makes10(1,9));

    }
}

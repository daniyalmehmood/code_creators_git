public class OR35 {

    public static boolean or35(int n){
        return n % 3 == 0 || n % 5 == 0;
    }

    public static void main(String[] args){

        System.out.println(or35(34));
        System.out.println(or35(30));
        System.out.println(or35(15));
    }
}

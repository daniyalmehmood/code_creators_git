public class IntMax {

    public static int intMax(int a ,int b, int c){

        if( a>b && a>c){

            return a;

        }

        else if( b>a && b>c){

            return b;
        }

        else if (c>a && c>b){

            return c;
        }

        else return 0;

    }

    public static void main(String[] args){

        System.out.println(intMax(1,3,5));
        System.out.println(intMax(1,8,5));
        System.out.println(intMax(6,3,5));
    }
}

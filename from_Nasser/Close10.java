public class Close10 {
    public static int close10( int a , int b){

        if( Math.abs(10-a)>Math.abs(10-b) ){
            return b;

        }
        else if (Math.abs(10-a)<Math.abs(10-b)){
            return a;

        }

        else if( Math.abs(10-a)==Math.abs(10-b)){

            return 0;

        }
        else return 0000000;
    }

    public static void main(String[] args){

        System.out.println(close10(8,13));
        System.out.println(close10(13,8));
        System.out.println(close10(13,7));
    }
}

public class Array123 {

    public static boolean array123(int[] num) {
        if (num.length<=2){
            return false;
        }
        else {

            for (int i = 0; i < (num.length - 1); i++) {
                if (num[i] == 1 && num[i + 1] == 2 && num[i + 2] == 3)
                    return true;
            }
        }

            return false;


        }




    public static void main(String [] args){

        System.out.println( Array123.array123(new int[]{1, 1, 2, 3, 1}));
        System.out.println( Array123.array123(new int[]{1, 1, 2, 4, 1}));
        System.out.println( Array123.array123(new int[]{1, 1, 2, 1, 2, 3}));
        System.out.println( Array123.array123(new int[]{1, 1, 2, 1, 2, 1}));
        System.out.println( Array123.array123(new int[]{1, 2, 3, 1, 2, 3}));
        System.out.println( Array123.array123(new int[]{1, 2}));
        System.out.println( Array123.array123(new int[]{1}));


    }

}


public class LoneTeen {

    public static boolean loneTeen(int a, int b) {

        return (a >= 13 && a <= 19) ^ (b >= 13 && b <= 19);


    }
    public static void main(String[] args){

        System.out.println(loneTeen(13,99));
        System.out.println(loneTeen(21,19));
        System.out.println(loneTeen(13,13));
    }
}


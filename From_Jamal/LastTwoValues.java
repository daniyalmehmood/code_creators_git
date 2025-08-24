public class LastTwoValues {
    public static int last2(String str) {

        if (str.length()<=2)return 0;

        int count = 0;

        String a = str.substring(str.length()-2);
        int last2 = str.length()-2;

        for (int i =0; i < str.length()-2; i++){

            if (str.substring(i,i+2).equals(a)) count++;

        }


        return count;

    }

    public static void main(String[] args) {
        System.out.println(last2("xxxaaooossddd"));
        System.out.println(last2("xxxx"));
    }
}

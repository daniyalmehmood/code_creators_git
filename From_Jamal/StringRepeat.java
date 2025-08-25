public class StringRepeat {

    public static String stringTimes(String str, int n) {

        String rep = "";
        for (int i = 0; i<n; i++){

            rep = rep + str;



        }

        return rep;



    }

    public static void main(String[] args) {
        System.out.println(stringTimes("Jamal ",10));
    }

}

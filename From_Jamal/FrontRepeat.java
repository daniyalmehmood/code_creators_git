public class FrontRepeat {

    public static String frontTimes(String str, int n) {

        String rep = "";

        if(str.length() > 3){

            for (int i = 0 ; i < n ; i++){

                rep = rep + str.substring(0,3);

            }


        }else if(str.length() <= 3){

            for(int i= 0; i< n; i++){
                rep = rep + str.substring(0,str.length());


            }

        }

        return rep;


    }

    public static void main(String[] args) {
        System.out.println(frontTimes("Jamal ",10));
    }

}

public class IN1020 {

    public static boolean in1020( int a, int b){

        if((10<=a && a<=20) || (10<=b && b<=20)) {

            return true;
        }
        else {
            return false;
        }


        }

        public static void main(String[] args){

            System.out.println(in1020(20,20));
            System.out.println(in1020(19,100));
            System.out.println(in1020(30,40));


    }
    }


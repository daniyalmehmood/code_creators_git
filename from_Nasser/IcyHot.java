public class IcyHot {

    public static boolean icyHot(int temp1, int temp2){

        if( temp1>100||temp2<0) {
            return true;

        } else if (temp1<0||temp2>100) {
            return true;

        }
        else return false;

        }

        public static void main(String[] args){

            System.out.println(icyHot(200,-2));
            System.out.println(icyHot(-4,200));
            System.out.println(icyHot(50,90));
        }
    }



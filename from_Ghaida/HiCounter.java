public class HiCounter {//Recursion-1 > countHi2
    public static void main(String[] args) {
        System.out.println(countHiSkippingXhi("ahixhi")); //1
        System.out.println(countHiSkippingXhi("ahibhi")); //2
        System.out.println(countHiSkippingXhi("xhixhi")); //0
    }
    public static int countHiSkippingXhi(String str) {
        if(str.length() <= 1){
            return 0;
        }
        else if(str.startsWith("hi")){
            return 1 + countHiSkippingXhi(str.substring(2));
        }
        else if (str.startsWith("xhi")){
            return countHiSkippingXhi(str.substring(3));
        }
        return countHiSkippingXhi(str.substring(1));
    }
}

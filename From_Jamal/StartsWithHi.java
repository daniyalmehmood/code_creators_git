public class StartsWithHi
{

    public static boolean startHi(String str) {
        if(str.length()<2  )return false;
        return str.substring(0,2).equals("hi");

    }

    public static void main(String[] args) {
        System.out.println(startHi("hi how are you !"));
        System.out.println(startHi(""));
    }

}
